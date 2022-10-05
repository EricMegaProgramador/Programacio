public class Servicio extends Personal {
    private String seccion;

    public Servicio(String nombre, String apellido, String dni, char estado, String seccion) {
        super(nombre, apellido, dni, estado);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
}
