/**
*
*Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte.
*
*
*
*@author: Daniela Gómez 
*
*/
public class ejercicio7_05 {
 
    public static void main(String[] args) {
      
      
     
      System.out.println("Introduce la combinación de 4 cifras para abrir la caja fuerte:");
      int combinacion = Integer.parseInt(System.console().readLine());
      
      if (combinacion != 1234) {
        
        for ( int i=1; i >= 3; i++) {
          System.out.println("Combinación incorrecta, te queda" + i + "intento/s");
        }
      
      } else {
        
        System.out.println("\nLa caja fuerte se ha abierto satisfactoriamente");
       } 
        
  
   
   
  }
}  
