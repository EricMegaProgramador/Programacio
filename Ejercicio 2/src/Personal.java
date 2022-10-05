public class Personal {
    private String nombre;
    private String apellido;
    private String dni;
    private char estadocivil;

    public Personal(String nombre, String apellido, String dni, char estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estadocivil = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getEstado() {
        return estadocivil;
    }

    public void setEstado(char estado) {
        this.estadocivil = estado;
    }
}
