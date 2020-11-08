/**
*
*Ejercicio 1 Control1  2020
*
*
*@author: Daniela Gómez
*
*/
public class Ex11dgb1 {
  public static void main(String [] args) {
   
    
    int filas = 8;
    int columnas = 8; 
    
    System.out.print("Introduzca el numero de filas: "); 
    filas = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el numero de columnas:");
    columnas = Integer.parseInt(System.console().readLine());
    
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
