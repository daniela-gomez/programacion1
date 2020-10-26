/**
*
*Este programa dice si un numero es capicua
* 
*
*
*
*@author: Daniela Gómez 
*
*/
public class ejercicio22_04 {
 
    public static void main(String[] args) {
      
      System.out.println("Calcula tu nota del trimestre de PROGRAMACIÓN");
      System.out.println("Dime, ¿qué sacaste en el primer control?:");
      double control1 = Double.parseDouble(System.console().readLine());
      System.out.println("¿Y en el sgundo?:");
      double control2 = Double.parseDouble(System.console().readLine());
      
      double media = (control1 + control2) / 2;
      
      if (media >= 5) {
        System.out.println("Estás aprobado! Tu nota del trimestre es: " + media);
      } else {
        System.out.println("¿Culál fue el resultado de la recuperación? (apto/no apto)");
        String recuperacion = System.console().readLine();
        
        if (recuperacion.equals("apto")) {
          System.out.println("Tu nota del trimestre es: 5");
        } else { 
          System.out.println("Tu nota del trimestre es: " + media);
        }   
      }
      
      
      
        
    
   
  }
}  
  
