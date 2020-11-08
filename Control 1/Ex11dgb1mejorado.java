/**
*
*Ejercicio 1 mejorado Control1  2020
*
*
*@author: Daniela Gómez
*
*/
public class Ex11dgb1mejorado {
  public static void main(String [] args) {
   
    
    int filas;
    int columnas; 
    
    do {
      System.out.print("Introduzca el número de filas (1-20): "); 
      filas = Integer.parseInt(System.console().readLine());
      if ( filas <=0 || filas > 20) {
        System.out.print("Valor fuera del rango. ");
      }  
    } while (filas <=0 || filas > 20);
    
    do {
    System.out.print("Introduzca el número de columnas (1-20): ");
    columnas = Integer.parseInt(System.console().readLine());
    if ( columnas <=0 || columnas > 20) {
        System.out.print("Valor fuera del rango. ");
      }  
    } while ( columnas <=0 || columnas > 20);
    
    
      for (int linea=1; linea<=filas; linea ++) {
     for (int pos=1; pos<=columnas; pos++) {
       if ((linea+pos)%2==0) {
        System.out.print("██"); 
       } else {
         System.out.print("  ");
         }
       }
        System.out.println();
       
    }


  }

}
