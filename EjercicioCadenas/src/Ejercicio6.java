import java.nio.charset.StandardCharsets;
    public class Ejercicio6 {


        public static void main(String[] args){
            Ejercicio6 App  = new Ejercicio6 ();
            App.transformar();
        }

        String cadena_texto = "Cadenas de texto y coleccionables";

        public void transformar(){

            String cadena_preparada= cadena_texto.trim().replaceAll(" ","").toLowerCase();

            char[] arr_frase = cadena_preparada.toCharArray();
            String[] frase_letra = cadena_preparada.split("");

            for (int i = 0; i < cadena_preparada.length(); i++) {

                byte[] bytes = cadena_preparada.getBytes(StandardCharsets.US_ASCII);

                System.out.println("El valor ASCII "+arr_frase[i]+" es: "+bytes[i]);

            }
        }
    }




