
package negocio;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;
import persistencia.Conexion;
public class DaoConsultas {
    public DefaultTableModel consultarMascotas() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"ID", "Nombre", "Tamano", "Color", "Edad", "Nacimiento", "Especie", "Sexo", "Raza", "Vacunas"});
        String sql = "SELECT * FROM mascota";
        try (Connection cn = Conexion.getConexion(); Statement st = cn.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getInt("id_mascota"),
                    rs.getString("nombre"),
                    rs.getString("tamano"),
                    rs.getString("color"),
                    rs.getInt("edad"),
                    rs.getString("fec_nacimiento"),
                    rs.getString("especie"),
                    rs.getString("sexo"),
                    rs.getString("raza"),
                    rs.getString("vacunas")
                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al consultar mascotas: "+e.getMessage());
        }
        return modelo;
    }

    public DefaultTableModel consultarPropietarios() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"ID", "DNI", "Nombre", "Apellidos", "Dirección", "Celular", "Correo", "ID Mascota"});
        String sql = "SELECT * FROM propietario";
        try (Connection cn = Conexion.getConexion(); Statement st = cn.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getInt("id_propietario"),
                    rs.getString("dni"),
                    rs.getString("nombre"),
                    rs.getString("apellidos"),
                    rs.getString("direccion"),
                    rs.getString("celular"),
                    rs.getString("correo"),
                    rs.getInt("id_mascota")
                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al consultar propietarios: "+e.getMessage());
        }
        return modelo;
    }
    
    public DefaultTableModel buscarMascotasPorNombre(String nombre) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"ID", "Nombre", "Tamano", "Color", "Edad", "Nacimiento", "Especie", "Sexo", "Raza", "Vacunas"});

        String sql = "SELECT * FROM mascota WHERE nombre LIKE ?";
        try (Connection con = Conexion.getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, "%" + nombre + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getInt("id_mascota"),
                    rs.getString("nombre"),
                    rs.getString("tamano"),
                    rs.getString("color"),
                    rs.getInt("edad"),
                    rs.getString("fec_nacimiento"),
                    rs.getString("especie"),
                    rs.getString("sexo"),
                    rs.getString("raza"),
                    rs.getString("vacunas")
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar mascotas: " + e.getMessage());
        }
        return modelo;
    }

    public DefaultTableModel buscarPropietarioPorDni(String dni) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"ID", "DNI", "Nombre", "Apellidos", "Dirección", "Celular", "Correo", "ID Mascota"});

        String sql = "SELECT * FROM propietario WHERE dni = ?";
        try (Connection con = Conexion.getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getInt("id_propietario"),
                    rs.getString("dni"),
                    rs.getString("nombre"),
                    rs.getString("apellidos"),
                    rs.getString("direccion"),
                    rs.getString("celular"),
                    rs.getString("correo"),
                    rs.getInt("id_mascota")
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar propietario: " + e.getMessage());
        }
        return modelo;
    }
    
    public boolean eliminarAmbos(int idMascota) {
        String sqlProp = "DELETE FROM propietario WHERE id_mascota = ?";
        String sqlMascota = "DELETE FROM mascota WHERE id_mascota = ?";
        try (Connection cn = Conexion.getConexion()) {
            cn.setAutoCommit(false);  // Transacción manual

            try (PreparedStatement ps1 = cn.prepareStatement(sqlProp); PreparedStatement ps2 = cn.prepareStatement(sqlMascota)) {

                ps1.setInt(1, idMascota);
                ps1.executeUpdate();

                ps2.setInt(1, idMascota);
                ps2.executeUpdate();

                cn.commit(); // Confirmar cambios
                return true;

            } catch (SQLException e) {
                cn.rollback(); // Revertir si hay error
                JOptionPane.showMessageDialog(null, "Error al eliminar: " + e.getMessage());
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
        }
        return false;
    }

}
