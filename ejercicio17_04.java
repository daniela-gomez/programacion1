/**
*
*Este programa dice cual es la primera cifra de un número entero introducido por teclado
*
*
*
*@author: Daniela Gómez 
*
*/
public class ejercicio17_04 {
 
    public static void main(String[] args) {
      
      System.out.println("Por favor introduce un número entero");
      int numero = Integer.parseInt(System.console().readLine());
      
      int ultimoDigito;
      ultimoDigito = (numero % 10);
      
      System.out.print("El último dígito del número que has introducido es: " +ultimoDigito);
    
    
   
  }
}  
  
