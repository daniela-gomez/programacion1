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
public class ejercicio7dw_05 {
 
    public static void main(String[] args) {
      
      int i=4;
      int combinacion=0;
      
      do { 
        System.out.println("Introduce la combinación de 4 cifras para abrir la caja fuerte:");
        combinacion = Integer.parseInt(System.console().readLine());
        
        if (combinacion == 1234) { 
          System.out.println("\nLa caja fuerte se ha abierto satisfactoriamente");
          
        
        } else {
          i--;
          System.out.println("Combinación incorrecta, te queda " + i + " intento/s");
        }
        
    
      } while ((combinacion  != 1234) && (i !=0));
    
      
   
   
  }
}
