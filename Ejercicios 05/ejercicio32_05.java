/**
*
Escribe un programa que, dado un número entero positivo, diga cuáles son y cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir números largos.
*
*
*@author: Daniela Gómez 
*
*/
public class ejercicio32_05 {
 
    public static void main(String[] args) {
      
      long numeroIntroducido = 0; 
      int resto = 0;
      int invertido= 0;
      int sumaPares = 0;
      int cuentaDigitos =0;
      
    
      
      
      System.out.print("Introduzca el número entero positivo para ver qué digitos pares tiene: ");
      numeroIntroducido = Long.parseLong(System.console().readLine());
     
     
      while (numeroIntroducido >0) {
        resto = (int) numeroIntroducido %10;//1
        invertido = invertido * 10 + resto;//432*10+1
        numeroIntroducido /=10;//1
      }
   
    
      
      while (invertido > 0) {
        
        resto = (int) invertido % 10;
          
        if ( resto % 2 == 0) {
          System.out.print(resto + " ");
          sumaPares = sumaPares + resto;
        }
        invertido /=10;
      }

      System.out.print("\nLa suma de los dígitos pares es: " + sumaPares);
            

  }
}  
