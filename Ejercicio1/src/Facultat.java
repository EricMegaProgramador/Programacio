public class Facultat {
    public static void main(String[] args) {

        Profesores pp = new Profesores("Eric","Alvarez", "48169743H", 's', "3","2003", "Informatico");
        Estudiantes e = new Estudiantes("Leo", "Messi", "56437984D", 'c',"2nciclo", "143");
        Servicio r = new Servicio("Sergio", "Lopez", "93674628A", 's', "3");

        System.out.println("******************************************************");

        System.out.println(pp.getNombre());
        System.out.println(pp.getApellido());
        System.out.println(pp.getDni());
        System.out.println(pp.getEstado());
        System.out.println(pp.getnDespachos());
        System.out.println(pp.getaCorporacion());
        System.out.println(pp.getDepartamento());

        System.out.println("******************************************************");

        System.out.println(e.getNombre());
        System.out.println(e.getApellido());
        System.out.println(e.getDni());
        System.out.println(e.getEstado());
        System.out.println(e.getCurso());
        System.out.println(e.getMatricula());

        System.out.println("******************************************************");

        System.out.println(r.getNombre());
        System.out.println(r.getApellido());
        System.out.println(r.getDni());
        System.out.println(r.getEstado());
        System.out.println(r.getSeccion());

        System.out.println("******************************************************");

    }
}
