import java.util.Scanner;  // Import the Scanner class

class MyClass {
  public static void main(String[] args) {
        System.out.println("CALCULADORA DE FUNCIONES TRIGONOMÉTRICAS");
        System.out.println("Ingrese el ángulo que desea calcular:");
        Scanner angulo_ingresado = new Scanner(System.in); // Recibe el ángulo que desea calcular 
        double angulo = angulo_ingresado.nextDouble();
        double radianes=Math.toRadians(angulo);
        //OPCIONES DE LA CALCULADORA
        System.out.println("El angulo a calcular es: " + angulo);
        System.out.println("Tipo de función que desea calcular");
        System.out.println("1. Calcular seno");
        System.out.println("2. Calcular coseno");
        System.out.println("3. Calcular tangente");
        Scanner opcion = new Scanner(System.in);
        int opcion_elegida = opcion.nextInt();        
        if (opcion_elegida==1)
        {
        double resultado=Math.sin(radianes);
        System.out.println("El resultado de calcular el seno de " + angulo + " es: " + resultado);
        }
        if (opcion_elegida==2)
        {
        double resultado=Math.cos(radianes);
        System.out.println("El resultado de calcular el coseno de " + angulo + " es: " + resultado);
        }
        if (opcion_elegida==3)
        {
        double resultado=Math.tan(radianes);
        System.out.println("El resultado de calcular la tangente de " + angulo + " es: " + resultado);
        }
  }
}