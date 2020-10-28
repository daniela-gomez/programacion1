/**
*
*Prgrama muestra los múltiplos de 5 del 0 al 100 con do while
*
*
*
*@author: Daniela Gómez 
*
*/
public class ejercicio3_05 {
 
    public static void main(String[] args) {
      
      
      
      int i = 0;
      int contador=0;
     
      System.out.println("Este programa muestra los múltiplos de 5 desde el 0 hasta el 100");
      
      
      
      do {
      
        i += 5;
        contador++; 
        System.out.println("5x"+  contador + " = " + i);
       } while( i < 100);
        
  
   
   
  }
}  
