
package negocio;

import java.util.List;
import persistencia.Conexion;
import java.sql.*;
import java.util.ArrayList;

public class DaoCita {
    public boolean registrarCitaRegular(int idPropietario, String mascota, int cmp, String fecha, String hora, String especialidad, String consultorio) {
        try {
            Conexion con = new Conexion();
            PreparedStatement ps = con.getConexion().prepareStatement("INSERT INTO tbl_citas (id_propietario, propietario_emergencia, mascota, cmp, fecha, hora, consultorio, especialidad) VALUES (?, null, ?, ?, ?, ?, ?, ?)");
            ps.setInt(1, idPropietario);
            ps.setString(2, mascota);
            ps.setInt(3, cmp);
            ps.setString(4, fecha);
            ps.setString(5, hora + ":00");
            ps.setString(6, consultorio);
            ps.setString(7, especialidad);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error al registrar cita regular: " + e.getMessage());
            return false;
        }
    }
    
    public boolean registrarCitaEmergencia(Integer idPropietario, String propietarioEmergencia, String mascota, int cmp, String fecha, String hora,String consultorio, String especialidad) {
        try {
            Conexion con = new Conexion();
            PreparedStatement ps = con.getConexion().prepareStatement("INSERT INTO tbl_citas (id_propietario, propietario_emergencia, mascota, cmp, fecha, hora, consultorio, especialidad) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");

            if (idPropietario == null) {
                ps.setNull(1, java.sql.Types.INTEGER);
            } else {
                ps.setInt(1, idPropietario);
            }

            if (propietarioEmergencia == null) {
                ps.setNull(2, java.sql.Types.VARCHAR);
            } else {
                ps.setString(2, propietarioEmergencia);
            }

            ps.setString(3, mascota);
            ps.setInt(4, cmp);
            ps.setString(5, fecha);
            ps.setString(6, hora);
            ps.setString(7, consultorio);
            ps.setString(8, especialidad);

            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error al registrar cita de emergencia: " + e.getMessage());
            return false;
        }
    }
    
    public ArrayList<String[]> obtenerListaPropietarios() {
        ArrayList<String[]> lista = new ArrayList<>();
        try {
            Conexion con = new Conexion();
            PreparedStatement ps = con.getConexion().prepareStatement(
                    "SELECT id_propietario, nombre FROM propietario");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(new String[]{rs.getString("id_propietario"), rs.getString("nombre")});
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error al listar propietarios: " + e.getMessage());
        }
        return lista;
    }
    
    public ArrayList<String[]> obtenerListaMedicos() {
        ArrayList<String[]> lista = new ArrayList<>();
        try {
            Conexion con = new Conexion();
            PreparedStatement ps = con.getConexion().prepareStatement(
                    "SELECT cmp, nombre FROM medico");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(new String[]{rs.getString("cmp"), rs.getString("nombre")});
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error al listar médicos: " + e.getMessage());
        }
        return lista;
    }
    
    public String obtenerEspecialidadPorCmp(int cmp) {
        String especialidad = "";
        try {
            Conexion con = new Conexion();
            PreparedStatement ps = con.getConexion().prepareStatement(
                    "SELECT especialidad FROM medico WHERE cmp = ?");
            ps.setInt(1, cmp);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                especialidad = rs.getString("especialidad");
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error al obtener especialidad: " + e.getMessage());
        }
        return especialidad;
    }
    
    public String obtenerMascotaPorPropietario(int idPropietario) {
        String nombreMascota = "";
        try {
            Conexion con = new Conexion();
            PreparedStatement ps = con.getConexion().prepareStatement(
                    "SELECT m.nombre FROM mascota m JOIN propietario p ON m.id_mascota = p.id_mascota WHERE p.id_propietario = ?");
            ps.setInt(1, idPropietario);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                nombreMascota = rs.getString("nombre");
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error al obtener mascota: " + e.getMessage());
        }
        return nombreMascota;
    }
    
    public List<String[]> listarCitasRegulares() {
        List<String[]> lista = new ArrayList<>();
        try (Connection cn = Conexion.getConexion()) {
            String sql = "SELECT c.num_ticket, CONCAT(p.nombre, ' ', p.apellidos) AS nombre_propietario, c.mascota, CONCAT(m.nombre, ' ', m.apellido) AS nombre_medico, c.fecha, c.hora, c.consultorio, c.especialidad FROM tbl_citas c JOIN medico m ON c.cmp = m.cmp JOIN propietario p ON c.id_propietario = p.id_propietario WHERE c.consultorio <> 'C_Emergencia';";
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String[] fila = {
                    rs.getString("num_ticket"),
                    rs.getString("nombre_propietario"),
                    rs.getString("mascota"),
                    rs.getString("nombre_medico"),
                    rs.getString("fecha"),
                    rs.getString("hora"),
                    rs.getString("consultorio"),
                    rs.getString("especialidad")
                };
                lista.add(fila);
            }
        } catch (Exception e) {
            System.out.println("Error listarCitasRegulares: " + e.getMessage());
        }
        return lista;
    }
    
    public List<String[]> listarCitasEmergencia() {
        List<String[]> lista = new ArrayList<>();
        try (Connection cn = Conexion.getConexion()) {
            String sql = "SELECT c.num_ticket, IFNULL(c.propietario_emergencia, '--VACIO--') AS propietario, c.mascota, CONCAT(m.nombre, ' ', m.apellido) AS nombre_medico, c.fecha, c.hora, c.consultorio, c.especialidad FROM tbl_citas c JOIN medico m ON c.cmp = m.cmp WHERE c.consultorio = 'C_Emergencia'";
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String[] fila = {
                    rs.getString("num_ticket"),
                    rs.getString("propietario"),
                    rs.getString("mascota"),
                    rs.getString("nombre_medico"),
                    rs.getString("fecha"),
                    rs.getString("hora"),
                    rs.getString("consultorio"),
                    rs.getString("especialidad")
                };
                lista.add(fila);
            }
        } catch (Exception e) {
            System.out.println("Error listarCitasEmergencia: " + e.getMessage());
        }
        return lista;
    }
    
    public boolean modificarCitaRegular(String num_ticket, String nuevaFecha, String nuevaHora) {
        boolean modificado = false;
        try {
            Connection cn = Conexion.getConexion();
            String sql = "UPDATE tbl_citas SET fecha = ?, hora = ? WHERE num_ticket = ?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, nuevaFecha);
            pst.setString(2, nuevaHora);
            pst.setString(3, num_ticket);
            modificado = pst.executeUpdate() > 0;
            cn.close();
        } catch (Exception e) {
            System.out.println("Error al modificar cita regular: " + e);
        }
        return modificado;
    }
    
    public boolean eliminarCitaRegular(String num_ticket) {
        boolean eliminado = false;
        try {
            Connection cn = Conexion.getConexion();
            String sql = "DELETE FROM tbl_citas WHERE num_ticket = ? AND consultorio <> 'C_Emergencia'";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, num_ticket);
            eliminado = pst.executeUpdate() > 0;
            cn.close();
        } catch (Exception e) {
            System.out.println("Error al eliminar cita regular: " + e);
        }
        return eliminado;
    }
    
    public boolean eliminarCitaEmergencia(String num_ticket) {
        boolean eliminado = false;
        try {
            Connection cn = Conexion.getConexion()  ;
            String sql = "DELETE FROM tbl_citas WHERE num_ticket = ? AND consultorio = 'C_Emergencia'";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, num_ticket);
            eliminado = pst.executeUpdate() > 0;
            cn.close();
        } catch (Exception e) {
            System.out.println("Error al eliminar cita de emergencia: " + e);
        }
        return eliminado;
    }
    
    public String[] buscarCitaRegular(String num_ticket) {
        String[] datos = new String[2];
        try {
            Connection cn = Conexion.getConexion();
            String sql = "SELECT fecha, hora FROM tbl_citas WHERE num_ticket = ? AND consultorio <> 'C_Emergencia'";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, num_ticket);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                datos[0] = rs.getString("fecha");
                datos[1] = rs.getString("hora");
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("Error al buscar cita regular: " + e);
        }
        return datos;
    }

}
