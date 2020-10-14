
/**
*
*Este programa resuelve una ecuación de primer grado del tipo ax+b = 0
*
*@author: Daniela Gómez 
*
*/
public class ejercicio5_04 {
  public static void main(String[] args) {
    System.out.println("Puedo resolver cualquier ecuació de tipo ax+b = 0 ");
    
    System.out.println("Dime el valor que le quieres dar a la variable a: ");
    int num1 = Integer.parseInt(System.console().readLine());
    System.out.println("Dime el valor que le quieres dar a la variable b: ");
    int num2 = Integer.parseInt(System.console().readLine());
    
    if (num2 != 0) {
      int equis = (-num2 )/ num1;
      System.out.print("El valor de x para que la ecuación se cumpla es: " + equis);
     } else {
      System.out.print("Esta ecuación no tiene solución para x=0");        
    
     }
    
  
  }
}  
  
