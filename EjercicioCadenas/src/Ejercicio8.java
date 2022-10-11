import java.util.*;
    public class Ejercicio8 {

        public static void main(String[] args) {
            Ejercicio8 App  = new Ejercicio8();
            App.function_lambda();
        }

        public void function_lambda() {
            ArrayList<Jugadores> Jugador = new ArrayList<Jugadores>();
            Jugador.add(new Jugadores("Lebron James", 37));
            Jugador.add(new Jugadores("Harden", 33));
            Jugador.add(new Jugadores("Curry", 34));
            Jugador.add(new Jugadores("Davis", 29));
            Jugador.add(new Jugadores("Lamelo", 21));
            Jugador.removeIf(Jugadores -> (Jugadores.edad <= 31));
            System.out.println("La lista de jugadores es: ");

            for (Jugadores Jugadores : Jugador) {
                System.out.println(Jugadores.nombre);
            }
        }

        private static class Jugadores {
            private String nombre;
            private int edad;

            public Jugadores(String nombre, int edad) {
                this.nombre = nombre;
                this.edad = edad;
            }
        }
        public class lista {
            public static void main(String args[]) {

                List<Integer> lista1 = new ArrayList();

                lista1.add(1);
                lista1.add(2);

                int[] array = new int[lista1.size()];

                for(int i = 0; i < lista1.size(); i++)
                    array[i] = lista1.get(i);
            }
        }
    }


