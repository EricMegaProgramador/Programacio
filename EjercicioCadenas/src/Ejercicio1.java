public class Ejercicio1 {
        String nombre_completo = "Eric Alvarez Suñe";


        public static void main(String[] args){
            Ejercicio1 app = new Ejercicio1();
            app.Apellidos();
        }

        public void Apellidos (){

            String[] apellidos = nombre_completo.split(" ");
            String apellido = apellidos[1];
            String apellido2 = apellidos[2];
            String nombre = apellidos[0];

            char inicial = nombre.charAt(0);

            System.out.println(apellido + " " + apellido2 + " " + inicial);

        }

    }



