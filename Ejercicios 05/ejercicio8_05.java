/**
*
*Prgrama que presenta tabla de multiplicar de un número con tantas filas como el usuario quiera
*
*
*
*@author: Daniela Gómez 
*
*/
public class ejercicio8_05 {
 
    public static void main(String[] args) {
      
      int num; 
      int mul; 
      int filas;
      System.out.println("Este programa presentará la tabla de multiplicar del número que elijas");
      System.out.println("\nIntroduce un número: ");  
      num = Integer.parseInt(System.console().readLine());
      System.out.println("\n¿Cuántas veces lo quieres multiplicar?: ");
      filas = Integer.parseInt(System.console().readLine());
      
      
      for ( int i=0; i <= filas; i++) {
        
        mul = num * i;
        System.out.printf(num + "x" + i +" = " + mul);

        
      } 

    
   
  }
}  
