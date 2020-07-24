/*
            TALLER DE PROGRAMACIÓN I SEMESTRE 2020
            TAREA DE INVESTIGACIÓN DE GIT HUB Y JAVA
                
                "CALCULADORA TRIGONOMÉTRICA"
Integrantes:
    Marco Gonzales 2020034547
    Diego Garcia 2020124283
    Kenneth Castillo 2019062984
*/
import java.util.Scanner;  // Import the Scanner class

class Trigonometria {
  public static void main(String[] args) {
        //Se defienen las variables
        Scanner in = new Scanner(System.in);
        double angle_g = 0;
        double angle = 0;
        int option_c = 0;
        int option_f = 0;
        double result = 0;

        //Ingreso del Angulo
        System.out.println("CALCULADORA DE FUNCIONES TRIGONOMETRICAS");
        System.out.println("Ingrese el angulo que desea calcular:");
        angle_g = in.nextInt();
        //Convierte el angulo a radianes
        angle = Math.toRadians(angle_g);

        //Solicita el tipo de funcion que se desea calcular
        System.out.println("El angulo a calcular es: " + angle_g);
        System.out.println("Tipo de función que desea calcular");
        System.out.println("1. Funciones trigonometricas");
        System.out.println("2. Funciones trigonometricas inversas");
        System.out.println("3. Funciones trigonometricas hiperbolicas");
        option_c = in.nextInt();

        //Verifica que la funcion elegida sea del tipo Trigonometrica.
        if(option_c == 1){
            System.out.println("ingrese la funcion que desea calcular");
            System.out.println("1. Funcion Seno");
            System.out.println("2. Funcion Coseno");
            System.out.println("3. Funcion Tangente");
            option_f = in.nextInt();

            //Verifica que se eligio la Funcion Seno y la ejecuta.
            if(option_f == 1){
                result = Math.sin(angle);
                System.out.println("El resultado de la Funcion Seno de " + angle_g + " es: " + result);
            }

            //Verifica que se eligio la Funcion Coseno y la ejecuta.
            else if(option_f ==2){
                result = Math.cos(angle);
                System.out.println("El resultado de la Funcion Coseno de: "+ angle_g + " es: " + result);
            }

            //Verifica que se eligio la Funcion Tangente y la ejecuta.
            else if(option_f == 3){
                result = Math.tan(angle);
                System.out.println("El resultado de la Funcion Tangente de: "+ angle_g + " es: " + result);
            }
        }

        //Verifica que la funcion elegida sea del tipo Trigonometrica Inversa.
        if(option_c == 2){
            System.out.println("Ingrese la funcion que desea calcular");
            System.out.println("1. Funcion Inversa de Seno");
            System.out.println("2. Funcion Inversa de Coseno");
            System.out.println("3. Funcion Inversa de Tangente");
            option_f = in.nextInt();

            //Verifica que se eligio la Funcion inversa de Seno y la ejecuta.
            if(option_f == 1){
                result = Math.asin(angle);
                System.out.println("El resultado de la Funcion Inversa de Seno de: "+ angle_g + " es: " + result);
            }

            //Verifica que se eligio la Funcion inversa de Coseno y la ejecuta.
            else if(option_f ==2){
                result = Math.acos(angle);
                System.out.println("El resultado de la Funcion Inversa de Coseno de: "+ angle_g + " es:" + result);
            }

            //Verifica que se eligio la Funcion inversa de Tangente y la ejecuta.
            else if(option_f == 3){
                result = Math.atan(angle);
                System.out.println("El resultado de la Funcion Inversa de Tangente de: "+ angle_g + " es:" + result);
            }
        }

        //Verifica que la funcion elegida sea del tipo Trigonometrica Hiperbolica.
        if(option_c == 3){
            System.out.println("Ingrese la funcion que desea calcular");
            System.out.println("1. Funcion Hiperbolica de Seno");
            System.out.println("2. Funcion Hiperbolica de Coseno");
            System.out.println("3. Funcion Hiperbolica de Tangente");
            option_f = in.nextInt();

            //Verifica que se eligio la Funcion Hiperbolica de Seno y la ejecuta.
            if(option_f == 1){
                result = Math.sinh(angle);;
                System.out.println("El resultado de la Funcion Hiperbolica de Seno de: "+ angle_g + " es: " + result);
            }

            //Verifica que se eligio la Funcion Hiperbolica de Coseno y la ejecuta.
            else if(option_f ==2){
                result = Math.cosh(angle);
                System.out.println("El resultado de la Funcion Hiperbolica de Coseno de: "+ angle_g + " es: " + result);
            }

            //Verifica que se eligio la Funcion Hiperbolica de Tangente y la ejecuta.
            else if(option_f == 3){
                result = Math.tanh(angle);
                System.out.println("El resultado de la Funcion Hiperbolica de Tangente de: "+ angle_g + " es: " + result);
            }
        }    
  }
}