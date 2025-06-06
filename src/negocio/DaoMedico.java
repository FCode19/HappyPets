
package negocio;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
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
    
    public boolean registrar(String cmp, String nombre, String apellido, String especialidad) {
        try {
            Conexion con = new Conexion();
            PreparedStatement ps = con.getConexion().prepareStatement(
                    "INSERT INTO medico (cmp, nombre, apellido, especialidad) VALUES (?, ?, ?, ?)");
            ps.setString(1, cmp);
            ps.setString(2, nombre);
            ps.setString(3, apellido);
            ps.setString(4, especialidad);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error al registrar médico: " + e.getMessage());
            return false;
        }
    }

    public boolean modificar(String cmp, String nombre, String apellido, String especialidad) {
        try {
            Conexion con = new Conexion();
            PreparedStatement ps = con.getConexion().prepareStatement(
                    "UPDATE medico SET nombre=?, apellido=?, especialidad=? WHERE cmp=?");
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, especialidad);
            ps.setString(4, cmp);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error al modificar médico: " + e.getMessage());
            return false;
        }
    }

    public String[] buscarPorCmp(String cmp) {
        String[] datos = new String[3];
        try {
            Conexion con = new Conexion();
            PreparedStatement ps = con.getConexion().prepareStatement(
                    "SELECT nombre, apellido, especialidad FROM medico WHERE cmp=?");
            ps.setString(1, cmp);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                datos[0] = rs.getString("nombre");
                datos[1] = rs.getString("apellido");
                datos[2] = rs.getString("especialidad");
            } else {
                datos = null;
            }

            rs.close();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error al buscar médico: " + e.getMessage());
            datos = null;
        }
        return datos;
    }
    
    public DefaultTableModel listarMedicos() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("CMP");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Especialidad");

        try {
            Conexion con = new Conexion();
            Statement st = con.getConexion().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM medico");

            while (rs.next()) {
                Object[] fila = {
                    rs.getString("cmp"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getString("especialidad")
                };
                modelo.addRow(fila);
            }

            rs.close();
            st.close();
        } catch (Exception e) {
            System.out.println("Error al listar médicos: " + e.getMessage());
        }

        return modelo;
    }
    
    public boolean eliminar(String cmp, boolean forzar) {
        try {
            Conexion con = new Conexion();

            PreparedStatement psVerificar = con.getConexion().prepareStatement(
                    "SELECT COUNT(*) AS cantidad FROM horario WHERE cmp = ?");
            psVerificar.setString(1, cmp);
            ResultSet rs = psVerificar.executeQuery();

            int cantidad = 0;
            if (rs.next()) {
                cantidad = rs.getInt("cantidad");
            }

            rs.close();
            psVerificar.close();

            if (cantidad > 0) {
                if (!forzar) {
                    return false;
                } else {
                    PreparedStatement psHorario = con.getConexion().prepareStatement(
                            "DELETE FROM horario WHERE cmp = ?");
                    psHorario.setString(1, cmp);
                    psHorario.executeUpdate();
                    psHorario.close();
                }
            }

            PreparedStatement psMedico = con.getConexion().prepareStatement(
                    "DELETE FROM medico WHERE cmp = ?");
            psMedico.setString(1, cmp);
            psMedico.executeUpdate();
            psMedico.close();

            return true;
        } catch (Exception e) {
            System.out.println("Error al eliminar médico: " + e.getMessage());
            return false;
        }
    }

}
