/**
*
*Prgrama muestra los numeros del 320 al 160 de 20 en 20 hacia atrás con for
*
*
*
*@author: Daniela Gómez 
*
*/
public class ejercicio7_05 {
 
    public static void main(String[] args) {
      
      
     
      System.out.println("Introduce la combinación de 4 cifras para abrir la caja fuerte:");
      int combinacion = Integer.parseInt(System.console().readLine());
      
      if (combinacion != 1234) {
        
        for ( int i=1; i >= 3; i++) {
          System.out.println("Combinación incorrecta, te queda" + i + "intento/s");
        }
      
      } else {
        
        System.out.println("\nLa caja fuerte se ha abierto satisfactoriamente");
       } 
        
  
   
   
  }
}  
