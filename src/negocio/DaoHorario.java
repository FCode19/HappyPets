
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
            "N° Horario", "CMP", "Nombre Médico", "Especialidad", "Fecha", "Hora", "Consultorio", "Estado"
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
                    rs.getString("estado")
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
    
    public String[] buscarHorarioPorNumero(int numHorario) {
        String[] datos = new String[5];
        try {
            Conexion con = new Conexion();
            PreparedStatement ps = con.getConexion().prepareStatement(
                    "SELECT cmp, fecha, hora, consultorio, estado FROM horario WHERE num_horario = ?");
            ps.setInt(1, numHorario);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                datos[0] = rs.getString("cmp");
                datos[1] = rs.getString("fecha");
                datos[2] = rs.getString("hora");
                datos[3] = rs.getString("consultorio");
                datos[4] = rs.getString("estado");
            } else {
                datos = null;
            }

            rs.close();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error al buscar horario: " + e.getMessage());
            datos = null;
        }

        return datos;
    }

    
    public boolean actualizarHorario(int numHorario, int cmp, String fecha, String hora, String consultorio, String estado) {
        try {
            Connection conn = Conexion.getConexion();
            String sql = "UPDATE horario SET cmp = ?, fecha = ?, hora = ?, consultorio = ?, estado = ? WHERE num_horario = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, cmp);
            stmt.setString(2, fecha);
            stmt.setString(3, hora);
            stmt.setString(4, consultorio);
            stmt.setString(5, estado);
            stmt.setInt(6, numHorario);

            int filas = stmt.executeUpdate();
            conn.close();
            return filas > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean eliminarHorario(int numHorario) {
        boolean eliminado = false;
        try {
            Conexion con = new Conexion();
            PreparedStatement ps = con.getConexion().prepareStatement(
                    "DELETE FROM horario WHERE num_horario = ?"
            );
            ps.setInt(1, numHorario);
            int filas = ps.executeUpdate();
            eliminado = filas > 0;
            ps.close();
        } catch (Exception e) {
            System.out.println("Error al eliminar horario: " + e.getMessage());
            eliminado = false;
        }
        return eliminado;
    }

}
