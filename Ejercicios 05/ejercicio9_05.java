/**
*
*Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
esta manera, la única limitación en el número de dígitos la establece el tipo de
dato que se utilice (int o long).
*
*
*
*@author: Daniela Gómez 
*
*/
public class ejercicio9_05 {
 
    public static void main(String[] args) {
      
      int numero = 0; 
      int numeroDigitos= 0; 
      
      System.out.print("Introduce un número y te diré cuántos dígitos tiene:");
      numero = Integer.parseInt(System.console().readLine());
      
      
      int aux = numero;
      while ( aux >0 ) {
        numeroDigitos++;
        aux = aux / 10;
        
    
        
      } 
      System.out.print("\n El numero " + numero + " tiene " + numeroDigitos + " dígitos.");

    
   
  }
}  
