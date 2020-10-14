/**
*
*Este programa dice cuantos digitos tiene un numero entero de hasta cinco cifras
* 
*
*
*
*@author: Daniela Gómez 
*
*/
public class ejercicio19_04 {
 
    public static void main(String[] args) {
      
      System.out.println("Por favor introduce un número entero de máximo 5 cifras");
      int numero = Integer.parseInt(System.console().readLine());
      
      int digitos=0;
      
      if (numero > 0) {
        digitos = 1;
      }      
      
      if ((numero >= 10) && (numero < 100)) {
        digitos = 2;
      }
      
      
      if ((numero >= 100) && (numero < 1000)) {
        digitos = 3;
      }
      
      if ((numero >= 1000) && (numero < 10000)) {
        digitos = 4;
      }
      
      if ((numero >= 10000) && (numero < 100000)) {
        digitos = 5;
      }
      
      
      
      
      
       
      
      if ((numero >= -10) && (numero < 0)) {
        digitos = 1;
      }
      
      
      if ((numero >= -100) && (numero < -10)) {
        digitos = 2;
      }
      
      if ((numero >= -1000) && (numero < -100)) {
        digitos = 3;
      }
      
      if ((numero >= -10000) && (numero < -1000)) {
        digitos = 4;
      }
      
      if ((numero >= -100000) && (numero < -10000)) {
        digitos = 5;
      }
      
      
      System.out.print("El numero introducido tiene " + digitos + " digitos");
    
    
   
  }
}  
  
