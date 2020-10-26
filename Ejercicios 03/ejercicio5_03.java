/**
*
*Este programa calcula en area de un rectangulo
*
*@author: Daniela Gómez 
*
*/
public class ejercicio5_03 {
  public static void main(String[] args) {

    String numA;
    System.out.println("Vamos a calcular el área de un rectángulo");
    System.out.println("¿Cuánto mide la base?");
    numA = System.console().readLine();
    int base;
    base = Integer.parseInt( numA );
    
    String numB;
    System.out.println("¿Cuánto mide la altura?");
    numB = System.console().readLine();
    int altura;
    altura = Integer.parseInt( numB );
    
    int area;
    area = base * altura;
  
    System.out.print("El área del rectángulo descrito es: " + area);  
  }
}  
  
  
