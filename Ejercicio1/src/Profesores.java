public class Profesores extends Personal {
    private String nDespachos;
    private String aCorporacion;
    private String departamento;

    public Profesores(String nombre, String apellido, String dni, char estado, String nDespachos, String aCorporacion, String departamento) {
        super(nombre, apellido, dni, estado);
        this.nDespachos = nDespachos;
        this.aCorporacion = aCorporacion;
        this.departamento = departamento;
    }

    public String getnDespachos() {
        return nDespachos;
    }

    public void setnDespachos(String nDespachos) {
        this.nDespachos = nDespachos;
    }

    public String getaCorporacion() {
        return aCorporacion;
    }

    public void setaCorporacion(String aCorporacion) {
        this.aCorporacion = aCorporacion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
