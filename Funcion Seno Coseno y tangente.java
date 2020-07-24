import java.util.Scanner;  // Import the Scanner class

class MyClass {
  public static void main(String[] args) {
        System.out.println("CALCULADORA DE FUNCIONES TRIGONOMÉTRICAS");
        System.out.println("Ingrese el ángulo que desea calcular:");
        Scanner angulo_ingresado = new Scanner(System.in); // Recibe el ángulo que desea calcular 
        String angulo = angulo_ingresado.nextLine();
        //OPCIONES DE LA CALCULADORA
        System.out.println("El angulo a calcular es: " + angulo);
        System.out.println("Tipo de función que desea calcular");
        System.out.println("1. Calcular seno");
        System.out.println("2. Calcular coseno");
        System.out.println("3. Calcular tangente");
        Scanner opcion = new Scanner(System.in);
        String opcion_elegida = opcion.nextLine();
        System.out.println("La opción elegida es: " + opcion_elegida);
        //double radianes= Math.toRadians(angulo);
        //double resultado=Math.sin(radianes);
       // double resultado=0;
        //angulo_num=angulo.nextDouble();
        //double radianes=Math.toRadians(angulo_num)
        //System.out.println("El resultado es: " + resultado);
  }
}