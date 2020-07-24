import java.util.Scanner; 
class Funciones_trigonometricas {
  public static void main(String[] args) {
    System.out.println("CALCULADORA DE FUNCIONES TRIGONOMÉTRICAS");
    System.out.println("Ingrese el ángulo que desea calcular:");
    Scanner angulo_ingresado = new Scanner(System.in);
    String angulo = angulo_ingresado.nextLine();
    System.out.println("El angulo a calcular es: " + angulo);
    System.out.println("Tipo de función que desea calcular");
    System.out.println("1. Calcular seno");
    System.out.println("2. Calcular coseno");
    System.out.println("3. Calcular tangente");
    Scanner myObj = new Scanner(System.in);
    String opcion_elegida = myObj.nextLine();
    System.out.println("La opción elegida es: " + opcion_elegida);  // Output user input
    
  }
}