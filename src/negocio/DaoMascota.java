
package negocio;
import java.sql.*;
import objetos.Mascota;
import persistencia.Conexion;
public class DaoMascota {
    public int registrar(String nombre, String tamano, String color, int edad, String fecha, String especie, String sexo, String raza, String vacunas) {
        String sql = "INSERT INTO mascota (nombre, tamano, color, edad, fec_nacimiento, especie, sexo, raza, vacunas) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection con = Conexion.getConexion(); PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, nombre);
            ps.setString(2, tamano);
            ps.setString(3, color);
            ps.setInt(4, edad);
            ps.setString(5, fecha);
            ps.setString(6, especie);
            ps.setString(7, sexo);
            ps.setString(8, raza);
            ps.setString(9, vacunas);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    public Mascota buscar(int idMascota) {
        String sql = "SELECT * FROM mascota WHERE id_mascota = ?";
        Mascota mascota = null;
        try (Connection con = Conexion.getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idMascota);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mascota = new Mascota();
                mascota.setNombre(rs.getString("nombre"));
                mascota.setTamano(rs.getString("tamano"));
                mascota.setColor(rs.getString("color"));
                mascota.setEdad(rs.getInt("edad"));
                mascota.setFecNacimiento(rs.getString("fec_nacimiento"));
                mascota.setEspecie(rs.getString("especie"));
                mascota.setSexo(rs.getString("sexo"));
                mascota.setRaza(rs.getString("raza"));
                mascota.setVacunas(rs.getString("vacunas"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mascota;
    }
    
    public void actualizar(int idMascota, String nombre, String tamano, String color, int edad, String fecNacimiento, String especie, String sexo, String raza, String vacunas) {
        String sql = "UPDATE mascota SET nombre = ?, tamano = ?, color = ?, edad = ?, fec_nacimiento = ?, especie = ?, sexo = ?, raza = ?, vacunas = ? WHERE id_mascota = ?";
        try (Connection con = Conexion.getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setString(2, tamano);
            ps.setString(3, color);
            ps.setInt(4, edad);
            ps.setString(5, fecNacimiento);
            ps.setString(6, especie);
            ps.setString(7, sexo);
            ps.setString(8, raza);
            ps.setString(9, vacunas);
            ps.setInt(10, idMascota);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
