import java.util.Scanner;
/**
*
*Este programa ordena 3 números enteros de menor a mayor
*
*
*
*@author: Daniela Gómez 
*
*/
public class ejercicio13_04 {
 
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
    
      System.out.println("Introduce 3 números enteros separados por espacios y yo los ordenaré");
    
      int numero1 = s.nextInt();
      int numero2 = s.nextInt();
      int numero3 = s.nextInt();
    
      if ((numero1 > numero2) && (numero2 > numero3)) {
        System.out.println("Los números en orden serían: " + numero1 + ">" + numero2 + ">" + numero3); 
      
      } else if ((numero1 > numero3) && (numero3 > numero2)) { 
        System.out.println("Los números en orden serían: " + numero1 + ">" + numero3 + ">" + numero2);
      
      } else if ((numero2 > numero1) && (numero1 > numero3)) {
        System.out.println("Los números en orden serían: " + numero2 + ">" + numero1 + ">" + numero3);
        
      } else if ((numero2 > numero3) && (numero3 > numero1)) {
        System.out.println("Los números en orden serían: " + numero2 + ">" + numero3 + ">" + numero1);
      
      } else if ((numero3 > numero1) && (numero1 > numero2)) {
        System.out.println("Los números en orden serían: " + numero3 + ">" + numero1 + ">" + numero2);
      
      } else if ((numero3 > numero2) && (numero2 > numero1)) {
        System.out.println("Los números en orden serían: " + numero3 + ">" + numero2 + ">" + numero1);
      }
    
        
  
  }
}  
