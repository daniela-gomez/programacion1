/**
*
Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta dos asteriscos menos en la base para simular la curvatura de las esquinas inferiores.
*
*
*@author: Daniela Gómez 
*
*/
public class ejercicio33_05 {
 
    public static void main(String[] args) {
      
      int altura = 0;
      

      System.out.print("Este programa pinta una U con asteríscos, introduzca la altura: ");
      altura = Integer.parseInt(System.console().readLine());
      
      
        
    
      for ( int i = 1; i < altura; i++) {
        System.out.print("* ");
          for ( int j = 2; j < altura; j++) {
            System.out.print("  ");
          }
          System.out.println("*");
      }
          
      System.out.print("  ");
      for (int i = 2; i < altura; i++) {
        System.out.print("* ");
      }
        
    
        
      

  }
}  
