
package negocio;
import java.sql.*;
import java.util.ArrayList;
import persistencia.Conexion;
public class DaoMedico {
    public ArrayList<String> obtenerListaMedicos() {
        ArrayList<String> lista = new ArrayList<>();
        String sql = "SELECT cmp, nombre, apellido, especialidad FROM medico";

        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                String cmp = rs.getString("cmp");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String especialidad = rs.getString("especialidad");

                String formato = cmp + "-" + nombre + " " + apellido + "-" + especialidad;
                lista.add(formato);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}
