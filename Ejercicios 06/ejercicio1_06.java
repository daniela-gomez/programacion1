/**
*
*Ejercicio 1 Tema 6 
*
*
*@author: Daniela Gómez
*
*/
public class ejercicio1_06 {
  public static void main(String [] args) {
    
    int dado;
    int suma=0;
    System.out.println("Este programa muestra la tirada de 3 dados y su suma total: ");
    
    
    
    for (int i=1; i<=3; i++) {
      dado = (int) (Math.random()*6+1); // general número al azar entre 0 y 6
      suma += dado;
      
      System.out.println("Tirada " + i + ": " + dado);
      
    }
    System.out.print("La suma de estos números es: " + suma);
  
  
  }

}
