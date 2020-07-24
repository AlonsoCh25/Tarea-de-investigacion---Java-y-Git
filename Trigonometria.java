import java.util.Scanner;  // Import the Scanner class

class Trigonometria {
  public static void main(String[] args) {
        //Se defienen las variables
        Scanner in = new Scanner(System.in);
        double angle = 0;
        int option_c = 0;
        int option_f = 0;
        double result = 0;

        //Ingreso del Angulo
        System.out.println("CALCULADORA DE FUNCIONES TRIGONOMETRICAS");
        System.out.println("Ingrese el angulo que desea calcular:");
        angle = in.nextInt();
        //Convierte el angulo a radianes
        angle = Math.toRadians(angle);

        //Solicita el tipo de funcion que se desea calcular
        System.out.println("El angulo en radianes a calcular es: " + angle);
        System.out.println("Tipo de función que desea calcular");
        System.out.println("1. Funciones trigonometricas");
        System.out.println("2. Funciones trigonometricas inversas");
        System.out.println("3. Funciones trigonometricas hiperbolicas");
        option_c = in.nextInt();

        if(option_c == 1){
            System.out.println("ingrese la funcion que desea calcular");
            System.out.println("1. Funcion Seno");
            System.out.println("2. Funcion Coseno");
            System.out.println("3. Funcion Tangente");
            option_f = in.nextInt();
            if(option_f == 1){
                result = Math.sin(angle);;
                System.out.println("El resultado de la Funcion Seno es:" + result);
            }
            else if(option_f ==2){
                result = Math.cos(angle);
                System.out.println("El resultado de la Funcion Coseno es:" + result);
            }
            else if(option_f == 3){
                result = Math.tan(angle);
                System.out.println("El resultado de la Funcion Tangente es:" + result);
            }
        }
        if(option_c == 2){
            System.out.println("ingrese la funcion que desea calcular");
            System.out.println("1. Funcion Inversa de Seno");
            System.out.println("2. Funcion Inversa de Coseno");
            System.out.println("3. Funcion Inversa de Tangente");
            option_f = in.nextInt();
            if(option_f == 1){
                result = Math.asin(angle);;
                System.out.println("El resultado de la Funcion Inversa de Seno es:" + result);
            }
            else if(option_f ==2){
                result = Math.acos(angle);
                System.out.println("El resultado de la Funcion Inversa de Coseno es:" + result);
            }
            else if(option_f == 3){
                result = Math.atan(angle);
                System.out.println("El resultado de la Funcion Inversa de Tangente es:" + result);
            }
        }    
  }
}