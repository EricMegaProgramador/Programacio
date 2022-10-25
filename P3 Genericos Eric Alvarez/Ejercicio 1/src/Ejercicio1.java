public class Ejercicio1 {
        public static void main(String[] args) {

            secundario<String> stackList = new secundario<>();

            System.out.println();
            System.out.println("Que tenemos en la lista?");

            if (stackList.isEmpty() == true ){
                System.out.println("No hay nada en la lista");
            }else{
                System.out.println("Si hay contenido en la lista");
            }
            System.out.println();

            //Valores en la lista
            stackList.addFirst("Pau");
            stackList.addFirst("Joan");
            stackList.addFirst("Carles");

            System.out.println("Lista: "+stackList);

            stackList.getFirst();

            stackList.removeFirst();

            //Añadiremos un nuevo valor al inicio de la lista.
            stackList.addFirst("Albert");
            System.out.println("La lista esta actualizada: "+stackList);

        }
    }

