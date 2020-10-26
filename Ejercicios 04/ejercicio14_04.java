/**
*
*Este programa te dice si un número es par y/o múltiplo de 5
*
*
*
*@author: Daniela Gómez 
*
*/
public class ejercicio14_04 {
 
    public static void main(String[] args) {
      
      System.out.println("Por favor, introduce un número entero:");
      int numero = Integer.parseInt(System.console().readLine());
      
      if ((numero % 2) == 0) {
        System.out.println(numero + " es par");
      } else { 
        System.out.println(numero + " no es par");
      }
      
      if ((numero % 5) == 0) {
        System.out.println(numero + " es multiplo de 5");
      } else {
        System.out.println(numero + " no es multipo de 5");
      }
   
   
   
   
  }
}  
  
