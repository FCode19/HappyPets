
package objetos;

public class Mascota {
    String nombre, tamano, color, fecNacimiento, especie, sexo, raza, vacunas;
    int edad;
    
    
    
    
    /*
    mascota.setNombre(rs.getString("nombre"));
                mascota.setTamaño(rs.getString("tamaño"));
                mascota.setColor(rs.getString("color"));
                mascota.setEdad(rs.getInt("edad"));
                mascota.setFecNacimiento(rs.getString("fec_nacimiento"));
                mascota.setEspecie(rs.getString("especie"));
                mascota.setSexo(rs.getString("sexo"));
                mascota.setRaza(rs.getString("raza"));
                mascota.setVacunas(rs.getString("vacunas"));
    */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFecNacimiento() {
        return fecNacimiento;
    }

    public void setFecNacimiento(String fecNacimiento) {
        this.fecNacimiento = fecNacimiento;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getVacunas() {
        return vacunas;
    }

    public void setVacunas(String vacunas) {
        this.vacunas = vacunas;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
