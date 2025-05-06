
package negocio;
import java.sql.*;
import objetos.Propietario;
import persistencia.Conexion;
public class DaoPropietario {
    public void registrar(String dni, String nombre, String apellidos, String direccion,
            String celular, String correo, int idMascota) {

        String sql = "INSERT INTO propietario (dni, nombre, apellidos, direccion, celular, correo, id_mascota) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection con = Conexion.getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, dni);
            ps.setString(2, nombre);
            ps.setString(3, apellidos);
            ps.setString(4, direccion);
            ps.setString(5, celular);
            ps.setString(6, correo);
            ps.setInt(7, idMascota);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Propietario buscarPorIdMascota(int idMascota) {
        String sql = "SELECT * FROM propietario WHERE id_mascota = ?";
        Propietario propietario = null;
        try (Connection con = Conexion.getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idMascota);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                propietario = new Propietario();
                propietario.setDni(rs.getString("dni"));
                propietario.setNombre(rs.getString("nombre"));
                propietario.setApellidos(rs.getString("apellidos"));
                propietario.setDireccion(rs.getString("direccion"));
                propietario.setCelular(rs.getString("celular"));
                propietario.setCorreo(rs.getString("correo"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return propietario;
    }
    
    public void actualizar(String dni, String nombre, String apellidos, String direccion, String celular, String correo, int idMascota) {
        String sql = "UPDATE propietario SET dni = ?, nombre = ?, apellidos = ?, direccion = ?, celular = ?, correo = ? WHERE id_mascota = ?";
        try (Connection con = Conexion.getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, dni);
            ps.setString(2, nombre);
            ps.setString(3, apellidos);
            ps.setString(4, direccion);
            ps.setString(5, celular);
            ps.setString(6, correo);
            ps.setInt(7, idMascota);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
