
package objetos;

public class Cita {
    private String numTicket, propietario, mascota, medico, fecha, hora, consultorio, especialidad;

    public Cita(String numTicket, String propietario, String mascota, String medico, String fecha, String hora, String consultorio, String especialidad) {
        this.numTicket = numTicket;
        this.propietario = propietario;
        this.mascota = mascota;
        this.medico = medico;
        this.fecha = fecha;
        this.hora = hora;
        this.consultorio = consultorio;
        this.especialidad = especialidad;
    }

    public Cita() {
    }

    public String getNumTicket() {
        return numTicket;
    }

    public void setNumTicket(String numTicket) {
        this.numTicket = numTicket;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    
}
