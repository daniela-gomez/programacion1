/**
*
*Prgrama muestra los numeros del 320 al 160 de 20 en 20 hacia atrás con while
*
*
*
*@author: Daniela Gómez 
*
*/
public class ejercicio6_05 {
 
    public static void main(String[] args) {
      
      int i = 320;
     
      System.out.println("Este programa muestra los números del 320 al 160 de 20 en 20 hacia atrás:");
      
      
      do {
        System.out.println(i);
        i-=20;
        
       } while (i >= 160);
        
  }
}  
