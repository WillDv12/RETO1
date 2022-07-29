/* COMANDOS BUSQUEDA SQL
# Atributos: idEmp, nombreEmp, apellidos, tipoDocumento, documento, cedula.
# Mostrar los regustros con todos los atributos de la tabla.
# El * es para mostrar todos los atributos de la tabla
SELECT * FROM `empleados`;

# consulota que especifica los atributos que se necesitan

SELECT nombreEmp, apellidos FROM empleados

# Asignarle a los atributos un sinonimo
SELECT nombreEmp AS Nombre, apellidos AS Apellido FROM empleados;

# Filtrar la busqueda por el idEmp
SELECT nombreEmp, apellidos FROM empleados WHERE IDeMP = 2; 

# Filtrar la busqueda por el nombre del empleado
SELECT nombreEmp, apellidos FROM empleados WHERE nombreEmp = "Armando"; 

# Filtrar utilizando la CONJUNCION (Y) en la busqueda - INCLUYENTE
SELECT nombreEmp, apellidos FROM empleados WHERE nombreEmp = "Armando" AND documento = "75310001";
# Filtrar utilizando la DISYUNCION (O) en la busqueda - EXCLUYENTE
SELECT nombreEmp, apellidos FROM empleados WHERE nombreEmp = "Armando" OR documento = "75310210";

# Filtrar la busqueda por contenido
SELECT nombreEmp, apellidos FROM empleados WHERE nombreEmp LIKE "%Juan%";

*/



package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    Connection connection;
    String driver = "com.mysql.cj.jdbc.Driver";
    String cadenaConexion = "jdbc:mysql://localhost:3306/reto1_g55_db";
    String usuario = "root";
    String password = "";

    public Conexion() {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(cadenaConexion, usuario, password);
            if (connection != null) {
                System.out.println("Conexion exitosa con la BD");
            } 
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("No se pudo establecer conexion");
        }
    }
    public Connection getConnection() {
        return connection;
    }

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
