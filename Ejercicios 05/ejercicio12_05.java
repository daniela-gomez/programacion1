/**
*
Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe introducir por teclado.
*
*
*@author: Daniela Gómez 
*
*/
public class ejercicio12_05 {
 
    public static void main(String[] args) {
      
      int terminos = 0; 
      int t1 = 0;
      int t2 = 1;
      int t3 = 0;
      
      
      System.out.print("Introduzca el número de terminos de la sereie de Fibonacci que desea ver:");
      terminos = Integer.parseInt(System.console().readLine());
      System.out.print("\nLos primeros " + terminos + " términos son: ");
      
      if (terminos == 0) {
        System.out.println("Ha elegido ver 0 términos");
        
      } else if (terminos == 1) { 
          System.out.print("0");
          
        } else { 
          System.out.print("0");
          for (int i = 1; i < terminos; i++) {
            t3 = t1 + t2; // 1
            t1 = t2; // actualiza la variable 
            t2 = t3;
            System.out.print( " " + t3);  
          }
        }

    
   
  }
}  
