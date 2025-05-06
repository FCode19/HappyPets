
package persistencia;
import java.sql.*;
public class main {
    public static void main(String[] args) {
        Connection conn = Conexion.getConexion();
        if (conn != null) {
            System.out.println("Conexión realizada correctamente.");
            try {
                conn.close();
                System.out.println("Conexión cerrada.");
            } catch (Exception e) {
                System.out.println("Error al cerrar la conexión.");
                e.printStackTrace();
            }
        } else {
            System.out.println("No se pudo establecer conexión.");
        }
    }
    
}
