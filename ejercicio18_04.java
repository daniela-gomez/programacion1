/**
*
*Este programa dice cual es la primera cifra de un número de hasta 5 cifras
* 
*
*
*
*@author: Daniela Gómez 
*
*/
public class ejercicio18_04 {
 
    public static void main(String[] args) {
      
      System.out.println("Por favor introduce un número entero de máximo 5 cifras");
      int numero = Integer.parseInt(System.console().readLine());
      
      int digito=0;
      
      if (numero < 10) {
        digito = numero;
      }      
      
      if ((numero >= 10) && (numero < 100)) {
        digito = numero / 10;
      }
      
      
      if ((numero >= 100) && (numero < 1000)) {
        digito = numero / 100;
      }
      
      if ((numero >= 1000) && (numero < 10000)) {
        digito = numero / 1000;
      }
      
      if (numero >= 10000) {
        digito = numero / 10000;
      }
      
      
      System.out.print("El primer dígito del número que has introducido es: " + digito);
    
    
   
  }
}  
  
