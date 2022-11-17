package ejercicio3;

import java.util.Scanner;

    public class ejercicio3 {

        public static void main(String[] args) {

            int[] array;
            array = new int[10];
            try {
                System.out.println("Valor: ");
                Scanner sc = new Scanner(System.in);

                for (int i = 0; i < 20; i++) {
                    array[i]=sc.nextInt();
                }
            } catch (Exception MaxLengthArr) {

                System.out.println("Se a desbordado");

                Scanner SCANNERTWO = new Scanner(System.in);
                String RESULTADO;
                RESULTADO = SCANNERTWO.nextLine();

                if (RESULTADO.equals("SI")) {
                    array = new int[20];

                    for (int i = 0; i < 20; i++) {
                        array[i]=SCANNERTWO.nextInt();
                    }

                    System.out.println("Desbordado al completo ");
                } else {
                    System.out.println("GRACIAS POR UTILIZAR EL PROGRAMA");
                }
                }
             }
        }

