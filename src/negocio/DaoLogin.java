
package negocio;
import java.sql.*;
import persistencia.Conexion;
public class DaoLogin {
    public boolean validarCredenciales(String usuario, String clave) {
        String sql = "SELECT * FROM usuarios WHERE usuario = ? AND clave = ?";
        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, usuario);
            ps.setString(2, clave);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
