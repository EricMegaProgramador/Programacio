import java.util.ArrayList;
import java.util.Iterator;
    public class Ejercicio7 {

        public static void main(String[] args){
            Ejercicio7 App = new Ejercicio7();
            App.iteracion();
        }

        public void iteracion(){

            ArrayList<String> Equipos_NBA = new ArrayList<String>();
            Equipos_NBA.add("Suns");
            Equipos_NBA.add("Lakers");
            Equipos_NBA.add("Celtics");
            Equipos_NBA.add("Chicago Bulls");
            Equipos_NBA.add("Miami Heat");

            Iterator<String> it = Equipos_NBA.iterator();

            for (int i = 0; i < Equipos_NBA.size(); i++) {

                System.out.println(it.next());
            }
        }
    }



