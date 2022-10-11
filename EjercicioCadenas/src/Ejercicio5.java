import java.util.regex.Matcher;
import java.util.regex.Pattern;
        public class Ejercicio5 {
            String contra = "WhatFuck:";
            Integer fuerza = 0;

            public static void main(String[] args){
                Ejercicio5 App  = new Ejercicio5 ();
                App.contraseña();
            }
            public void contraseña(){

                //char[] contra_arr = contra.toCharArray();
                String contra1 = contra;
                int frase_lenght = contra1.length();

                if(frase_lenght >= 8){

                    System.out.println("La contraseña cumple con la longitud minima.");

                    fuerza = fuerza + 1;

                }else{

                    System.out.println("La contraseña no cumple con la longitud mínima.");
                }

                if (contra1!=contra1.toLowerCase()){

                    System.out.println("La contraseña cumple con mayúsculas y minuscúlas.");
                    fuerza = fuerza + 1;

                }else{

                    System.out.println("La contraseña no contiene minsuculas y mayusculas.");
                }

                Pattern pattern = Pattern.compile("^(?=.*\\d)(?=.*\\W)", Pattern.CASE_INSENSITIVE);
                Matcher matcher = pattern.matcher("WhatFuck:");
                boolean contiene_digitos_simbolos = matcher.find();

                if(contiene_digitos_simbolos) {
                    System.out.println("La contraseña contiene digítos y símbolos.");
                    fuerza = fuerza + 1;
                } else {
                    System.out.println("La contaraseña no cumple con los parametros de seguridad");

                }

                System.out.println();

                if(fuerza == 3){

                    System.out.println("La contraseña es fuerte.");
                }else{

                    System.out.println("La contraseña no fuerte.");
                }

            }
        }