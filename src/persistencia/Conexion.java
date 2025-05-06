
package persistencia;

import java.sql.*;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/bd_veterinaria";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";

    public static Connection getConexion() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se encontró el driver de MySQL.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error: No se pudo conectar a la base de datos.");
            e.printStackTrace();
        }
        return conexion;
    }
}
