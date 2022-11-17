package ejercicio4;

import java.util.Scanner;

    public class ejercicio4 {
        public static void main(String[] args) {

            boolean fallo = false;
            Scanner sc = new Scanner(System.in);
            while(!fallo) {
                try {

                    System.out.println("Valor: ");
                    String VALOR = sc.nextLine();

                    int VALOR_int = Integer.parseInt(VALOR);
                    int CUADRADO;

                    CUADRADO = VALOR_int * VALOR_int;

                    System.out.println("Al cuadrado de" + VALOR_int + " es: " + CUADRADO);

                  } catch (Exception Formatfallo) {

                    System.out.println("Invalido. Otra vez valor:  ");

                }
            }
        }
    }

