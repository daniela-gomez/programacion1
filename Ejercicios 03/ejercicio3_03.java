import java.util.Scanner;
/**
*
*Este programa convierte pesetas a euros
*
*@author: Daniela Gómez 
*
*/
public class ejercicio3_03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Este programa converte pesetas a euros");
    System.out.println("Introduce la cantidad que quieres convertir");
    
    double pesetas = s.nextDouble();
    
    
    double euros;
    euros = pesetas/166.386;
    
  
    System.out.print(pesetas + "pesetas"  + " son " + euros + " euros");  
  }
}  
  
  
