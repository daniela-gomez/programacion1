/**
*
*Ejercicio 3 Tema 6 
*
*
*@author: Daniela Gómez
*
*/
public class ejercicio3_06 {
  public static void main(String [] args) {
    
    int numeroPalo;
    int numeroCarta;
    
    String palo="";
    String carta="";
    
    System.out.println("Este programa muestra al azar el nombre de una carta de la bajara española: ");
    
    numeroPalo = (int)(Math.random()*4)+1;
    
    switch (numeroPalo) {
      
      case 1:
        palo = "Oros"; 
        break;
      
      case 2:
        palo = "Copas";
        break;
      
      case 3:
        palo = "Espadas";
        break;
        
      case 4: 
        palo = "Bastos";
        break;
        
      default:

    }
    
    numeroCarta = (int)(Math.random()*13)+1;
    
    switch (numeroCarta) {
      case 1: 
        carta="As";
        break;
        
      case 11:
        carta="Sota";
        break;
      
      case 12: 
        carta="Caballo";
        break;
        
      case 13:
        carta="Rey";
        break;
      
      default:
      
        carta = String.valueOf(numeroCarta);
              
    }
    
    System.out.print("La carta es " + carta + " de " + palo);
    
  
  }

}
