/**
*
*Este programa presenta una piramide vacia
*
*@author: Daniela Gómez 
*
*/
public class ejercicio20_05 {
 
    public static void main(String[] args) {
      
      
      
      int espacios=-1;
        
     
      System.out.println("Introduce la altura de la piramide:");
      int altura = Integer.parseInt(System.console().readLine());
      System.out.println("Introduce el caracter con el que lo desea pintar:");
      char car = System.console().readLine().charAt(0);
      
      for(int fila=1; fila<=altura-1;fila++){
        for (int i=1; i<=altura-fila;i++){
          System.out.print(" ");
        } 
        
        System.out.print(car);
        
        
        for(int i=1; i<= espacios; i++) {
          System.out.print(" ");
        } 
        
        espacios +=2;
          
        if (fila > 1) {
          System.out.print(car);
        }
        System.out.print("\n");
        
      }
      
        
        
      for (int i=1; i<=2*altura-1; i++) {
        System.out.print(car);
      } 
       

   
  }
}  
