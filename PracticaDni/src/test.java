import java.util.Scanner;

public class test{

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numDNI;
        dni letra = new dni();
        System.out.print("Introduzca número del DNI: ");
        numDNI = Integer.parseInt(entrada.nextLine());
        System.out.println("\nEl DNI con letra es: " + numDNI + letra.obtenerLetradni(numDNI));
        entrada.close();

    }

}