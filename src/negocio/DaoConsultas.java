
package negocio;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
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
            System.out.println("Error al consultar mascotas: " + e.getMessage());
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
            System.out.println("Error al consultar propietarios: " + e.getMessage());
        }
        return modelo;
    }
}
