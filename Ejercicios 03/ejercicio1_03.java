import java.util.Scanner;
/**
*
*Muestra el producto de dos numeros
*
*@author: Daniela Gómez 
*
*/
public class ejercicio1_03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce dos numeros enteros separados por un espacio:");
    int num1 = s.nextInt();
    int num2 = s.nextInt();
    
    
    int mul = num1 * num2;
  
    System.out.print("El producto de " + num1 + " y " + num2 + " es igual a " + mul);  
  }
}  
  
  
  
