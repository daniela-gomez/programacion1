/**
*
*Ejercicio 1 Control 1 2019
*
*
*@author: Daniel Gómez
*
*/
public class ejer3control1_19 {
  public static void main(String [] args) {
    
    char opcion;
    int hueco1=0;
    int hueco2;
    
    System.out.println("Este programa dibuja un gusano en pantalla.");
    System.out.println("Controles: j: abajo-izquierda; // k: abajo // l: abajo-derecha (seguido de ENTER");
    System.out.println("Pulse 'ds' para salir.");
    
    do {
      
      for (int i=0; i<hueco1; i++) {
        System.out.print(" ");
      } //pinta primer hueco
      
      System.out.print("*");
      
      for (int i=hueco1+1; i<20; i++) {
        System.out.print(" ");
      }//pinta segundo hueco
      
      System.out.print("¿j, k, l, s?:");
      opcion = System.console().readLine().charAt(0);
      
      
      switch (opcion) {
        
        case 'j':
          if (hueco1>0) {
            hueco1--;
          }
        break;
    
        
        case 'l':
          if (hueco1<9) {
            hueco1++;
            break;
          }
        default:
      }
    } while ( opcion!='s' );
  
  
  


  }

}
