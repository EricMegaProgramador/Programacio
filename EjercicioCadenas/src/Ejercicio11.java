import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
    public class Ejercicio11 {

        public static void main(String[] args){
            Ejercicio11 App  = new Ejercicio11();
            App.ordenar();
        }

        public void ordenar(){

            final Map<String, Integer> ordenar = new HashMap<>();
            ordenar.put("E", 8);
            ordenar.put("r", 9);
            ordenar.put("i", 1);
            ordenar.put("c", 4);
            ordenar.put("A", 6);
            ordenar.put("l", 5);
            ordenar.put("v", 7);
            ordenar.put("a", 1);
            ordenar.put("t", 6);

            final Map<String, Integer> sortedByCount = ordenar.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue())
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

            System.out.println(sortedByCount);
        }
    }



