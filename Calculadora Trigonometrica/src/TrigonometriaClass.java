import java.util.Scanner;
public class TrigonometriaClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double angulo = 0;
        int funcion = 0;
        double resultado = 0;

        System.out.println("Ingrese el angulo que desea calcular: ");
        angulo = in.nextInt();
        System.out.println("1. Funcion seno hiperbolico, 2. Funcion coseno hiperbolico, 3. Funcion trangente hiperbolica");
        funcion = in.nextInt();
        if(funcion == 1){
          resultado = Math.sinh(angulo);
          System.out.println("El resultado de la Funcion seno hiperbolico de "+ angulo +" es: "+ resultado +"");
        }
        else if(funcion == 2){
            resultado = Math.cosh(angulo);
            System.out.println("El resultado de la Funcion coseno hiperbolico de "+ angulo +" es: "+ resultado +"");
        }
        else if(funcion == 3){
            resultado = Math.tanh(angulo);
            System.out.println("El resultado de la funcion tangente hiperbolica de "+ angulo +" es: "+ resultado +"");
        }
        }
}
