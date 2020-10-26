/**
*
*Prgrama 
*
*
*
*@author: Daniela Gómez 
*
*/
import java.util.Scanner;
public class ejercicio13_05 {
 
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      
      int contador = 0;
      int suma = 0;
      String numeros = "";
      int n;
      
      
     
      System.out.println("Este programa dice que numero es positivo o negativo:");
      
      
      
      
      
      for ( int i=1; i <= 0; i++) {
       
        System.out.println(" Introduce un numero");
        n = s.nextInt();
        contador++;
        //suma +=n;
        suma = suma +n;
        //numeros +=n + "-";
        numeros = numeros + n + "-";
         
       } 
       System.out.println("Numeros: " + numeros);
       System.out.println("contador: " + contador);
       System.out.println("media: " + (double) suma/contador);
       
        
  
   
  }
}  
