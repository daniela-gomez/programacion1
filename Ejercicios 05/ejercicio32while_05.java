/**
*
Escribe un programa que, dado un número entero positivo, diga cuáles son y cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir números largos.
*
*
*@author: Daniela Gómez 
*
*/
public class ejercicio32while_05 {
 
    public static void main(String[] args) {
      
      long numeroIntroducido; 
      long invertido = 0; 
      int longitud = 0;
      int sumaPares= 0;
      int digito;
      
    
     
      
      
      System.out.print("Introduzca el número entero positivo para ver qué digitos pares tiene: ");
      numeroIntroducido = Long.parseLong(System.console().readLine());
      
      while ( numeroIntroducido > 0) {
        invertido = (numeroIntroducido%10) + (invertido*10);
        numeroIntroducido = numeroIntroducido / 10;
        longitud++;
      }
      
      System.out.print("Los dígitos pares son: ");
      
      for (int i = 0; i < longitud; i++) {
        digito = (int)invertido%10;
        
        if (digito%2 == 0) {
          System.out.print(digito + " ");
          sumaPares += digito;
        }
        
        invertido/=10;
      }
      
      System.out.print("\nLa suma de los digitos pares es: " + sumaPares);

   
  }
}  
