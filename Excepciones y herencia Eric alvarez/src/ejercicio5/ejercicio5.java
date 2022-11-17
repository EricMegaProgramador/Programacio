package ejercicio5;
import java.util.Scanner;

    public class ejercicio5 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String word= "HOLAAAAA";
            do {
                try {

                    System.out.println("Empecemos");
                    word = sc.nextLine();

                    if (word.equals("SI")) {

                        System.out.println("Que mes del año tiene 28 dias?");
                        word = sc.nextLine();

                        if (word.equals("Todos")) {

                            System.out.println("COOOORRRREEEECTTTOOOOOOOOO!!!!!!");
                            System.out.println("Siguiente preguntita Qué se moja mientras se seca?");
                            word = sc.nextLine();

                            if (word.equals("Toalla")) {

                                System.out.println("COOOORRRREEEECTTTOOOOOOOOO!!!!!! Seguimos  Qué pasó ayer en Colombia entre las 6 y las 7 de la tarde?");
                                word = sc.nextLine();

                                if (word.equals("Una hora")) {

                                    System.out.println("COOOORRRREEEECTTTOOOOOOOOO!!!!!! ESTAS DENTRO DE LA SECTA!!");
                                }
                            }
                        }

                    } else if (word.equals("NO")) {
                        System.out.println("SEGUIMOS INTENTANDO");
                    }else {
                        throw new ejercicio51("IIIINNNNCOOOOORRREEECCCTTTOOO!!!!!!");
                    }

                } catch (Exception e) {

                    System.out.println("IIIINNNNCOOOOORRREEECCCTTTOOO!!!!!!");
                } catch (ejercicio51 e) {
                    throw new RuntimeException(e);
                }
            } while (true);
        }
    }

