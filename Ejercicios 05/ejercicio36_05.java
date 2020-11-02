/**
*
Escribe un programa que diga si un número introducido por teclado es o no capicúa. Se recomienda usar long en lugar de int ya que el primero admite números más largos.
*
*
*@author: Daniela Gómez 
*
*/
public class ejercicio36_05 {
 
    public static void main(String[] args) {
      
      long numeroIntroducido;
      long invertido = 0;
      int resto = 0;

      System.out.print("Introduzca un numero entero para saber si es capicúa: ");
      numeroIntroducido = Long.parseLong(System.console().readLine());
      
      long aux = numeroIntroducido;
      
      while (aux >0) {
        
        invertido = (invertido * 10) + (aux % 10);
         aux /=10;
      }
      
      if (numeroIntroducido == invertido) {
        System.out.printf("El %d es capicúa.", numeroIntroducido);
      } else {
        System.out.printf("El %d no es capicúa", numeroIntroducido);
        }

  }
}  
