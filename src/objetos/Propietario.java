
package objetos;

public class Propietario {
    String dni, nombre, apellidos, direccion, celular, correo;
    
    
    
    /*
    propietario.setDni(rs.getString("dni"));
                propietario.setNombre(rs.getString("nombre"));
                propietario.setApellidos(rs.getString("apellidos"));
                propietario.setDireccion(rs.getString("direccion"));
                propietario.setCelular(rs.getString("celular"));
                propietario.setCorreo(rs.getString("correo"));
    */

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
