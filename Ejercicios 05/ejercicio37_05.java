/**
*
Realiza un conversor del sistema decimal al sistema de “palotes”.
*
*
*@author: Daniela Gómez 
*
*/
public class ejercicio37_05 {
 
    public static void main(String[] args) {
      
      long numeroIntroducido;
      long invertido = 0;
      int digito = 0;
      int tam=0;
     
      
      System.out.print("Introduzca un numero entero para convertir al sistema de palotes: ");
      numeroIntroducido = Long.parseLong(System.console().readLine());
      
      long aux = numeroIntroducido;
      
      while (aux >0) {
        invertido = (invertido * 10) + (aux % 10);
        aux /=10;
        tam++;
      }
      

      for (int i=1; i <= tam; i++) {
        digito = (int) (invertido%10);
        invertido /=10;
        for (int j=1; j <= digito; j++) {
          System.out.print("|");
          
        }
        if ( i < tam ) {
          System.out.print("-");
        }
      }
          

      

  }
}  
