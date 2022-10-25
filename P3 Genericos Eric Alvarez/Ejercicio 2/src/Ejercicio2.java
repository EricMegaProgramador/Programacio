public class Ejercicio2 {
        public static void main(String[] args){

            secundario<String> array = new secundario<>();

            System.out.println();
            System.out.println("Que tenemos en la lista?");

            if (array.isEmpty() == true ){
                System.out.println("No hay nada en la lista");
            }else{
                System.out.println("Si que hay contenido en la lista");
            }
            System.out.println();

            //Valores de la lista
            array.addFirst("Pau Gasol") ;
            array.addFirst("Rodolfo");
            array.addFirst("Ibai");
            array.addFirst("Iñaki");

            System.out.println("Lista: " + array.toString());


            array.removeFirst();

            System.out.println("Primer valor eliminado que contiene la lista: "+array.toString());

            array.addFirst("Nico");
            System.out.println("Valor añadido en la primera posición de la lista:"+array);

            String string = array.toString();
            System.out.println("Array a String"+ string);

        }
    }

