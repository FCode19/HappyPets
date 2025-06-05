
package negocio;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.Conexion;
public class DaoHorario {
    public void registrar(int cmp, String fecha, String hora, String consultorio, String estado) {
        String sql = "INSERT INTO horario (cmp, fecha, hora, consultorio, estado) VALUES (?, ?, ?, ?, ?)";
        try (Connection cn = Conexion.getConexion(); PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setInt(1, cmp);
            ps.setString(2, fecha);
            ps.setString(3, hora);
            ps.setString(4, consultorio);
            ps.setString(5, estado);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Horario registrado exitosamente.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar horario: " + e.getMessage());
        }
    }

    public void actualizar(int numHor, int cmp, String fecha, String hora, String consultorio, String estado) {
        String sql = "UPDATE horario SET cmp = ?, fecha = ?, hora = ?, consultorio = ?, estado = ? WHERE num_horario = ?";
        try (Connection cn = Conexion.getConexion(); PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setInt(1, cmp);
            ps.setString(2, fecha);
            ps.setString(3, hora);
            ps.setString(4, consultorio);
            ps.setString(5, estado);
            ps.setInt(6, numHor);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Horario actualizado correctamente.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar horario: " + e.getMessage());
        }
    }

    public void eliminar(int numHor) {
        String sql = "DELETE FROM horario WHERE num_horario = ?";
        try (Connection cn = Conexion.getConexion(); PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setInt(1, numHor);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Horario eliminado correctamente.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar horario: " + e.getMessage());
        }
    }

    public DefaultTableModel listarHorarios() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{
            "N° Horario", "CMP", "Nombre Médico", "Especialidad", "Fecha", "Hora", "Consultorio", "Estado", "Acciones"
        });

        String sql = "SELECT h.num_horario, m.cmp, CONCAT(m.nombre, ' ', m.apellido) AS medico, m.especialidad, h.fecha, h.hora, h.consultorio, h.estado "
                + "FROM horario h JOIN medico m ON h.cmp = m.cmp";
        try (Connection cn = Conexion.getConexion(); Statement st = cn.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getInt("num_horario"),
                    rs.getInt("cmp"),
                    rs.getString("medico"),
                    rs.getString("especialidad"),
                    rs.getString("fecha"),
                    rs.getString("hora"),
                    rs.getString("consultorio"),
                    rs.getString("estado"),
                    "Modificar / Eliminar"
                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al listar horarios: " + e.getMessage());
        }
        return modelo;
    }

    public DefaultComboBoxModel<String> cargarMedicos() {
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
        modelo.addElement("Seleccione un médico");
        String sql = "SELECT cmp, nombre, apellido, especialidad FROM medico";
        try (Connection cn = Conexion.getConexion(); Statement st = cn.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                String item = rs.getInt("cmp") + " - "
                        + rs.getString("nombre") + " "
                        + rs.getString("apellido") + " - "
                        + rs.getString("especialidad");
                modelo.addElement(item);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar médicos: " + e.getMessage());
        }
        return modelo;
    }
}
