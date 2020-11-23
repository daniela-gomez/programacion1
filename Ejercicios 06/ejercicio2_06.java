/**
*
*Ejercicio 2 Tema 6 
*
*
*@author: Daniela Gómez
*
*/
public class ejercicio2_06 {
  public static void main(String [] args) {
    
    int numeroPalo;
    int numeroCarta;
    
    String palo="";
    String carta="";
    
    System.out.println("Este programa muestra al azar el nombre de una carta de la bajara francesa: ");
    
    numeroPalo = (int)(Math.random()*4)+1;
    
    switch (numeroPalo) {
      
      case 1:
        palo = "Picas"; 
        break;
      
      case 2:
        palo = "Corazones";
        break;
      
      case 3:
        palo = "Diamantes";
        break;
        
      case 4: 
        palo = "Tréboles";
        break;
        
      default:

    }
    
    numeroCarta = (int)(Math.random()*13)+1;
    
    switch (numeroCarta) {
      case 1: 
        carta="As";
        break;
        
      case 11:
        carta="J";
        break;
      
      case 12: 
        carta="Q";
        break;
        
      case 13:
        carta="K";
        break;
      
      default:
      
        carta = String.valueOf(numeroCarta);
              
    }
    
    System.out.print("La carta es " + carta + " de " + palo);
    
  
  }

}
