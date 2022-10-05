public class Estudiantes extends Personal {
    private String curso;
    private String matricula;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Estudiantes(String nombre, String apellido, String dni, char estado, String curso, String matricula) {
        super(nombre, apellido, dni, estado);
        this.curso = curso;
        this.matricula = matricula;
    }
}
