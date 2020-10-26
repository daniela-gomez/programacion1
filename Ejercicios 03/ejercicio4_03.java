import java.util.Scanner;
/**
*
*Este programa suma, resta, multipliza y divide dos numeros
*
*@author: Daniela Gómez 
*
*/
public class ejercicio4_03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce dos numeros pueden (contener decimales) separados por un espacio:");
    
    double num1 = s.nextDouble();
    double num2 = s.nextDouble();
    
    
    double sum = num1 + num2;
    double res = num1 - num2;
    double mul = num1 * num2;
    double div = num1 / num2;
   
    
  
    System.out.println("Su suma es: " + sum);
    System.out.println("Su resta es: " + res);
    System.out.println("Su multiplicación es: " + mul);
    System.out.println("Su división es:" + div);  
  }
}  
  
  
