import java.util.Scanner;
    public class Ejercicio4 {

        Scanner v1 = new Scanner(System.in);
        Scanner v2 = new Scanner(System.in);
        public static void main(String[] args){
            Ejercicio4 App  = new Ejercicio4 ();
            App.Contador_index();
        }

        public void Contador_index(){

            System.out.println("Palabra: ");
            String palabra = v1.nextLine();
            System.out.println("Caracter: ");
            String caracter = v2.nextLine();

            System.out.println(palabra.indexOf(caracter));
        }

    }

