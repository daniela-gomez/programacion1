/**
*
*Este programa convierte euros a pesetas
*
*@author: Daniela Gómez 
*
*/
public class ejercicio2_03 {
  public static void main(String[] args) {

    String cantidad;
    System.out.println("Este programa converte euros a pesetas");
    System.out.println("Introduce la cantidad que quieres convertir");
    cantidad = System.console().readLine();
    int euros;
    euros = Integer.parseInt( cantidad );
    
    
    double pesetas;
    pesetas = euros / 166.386;
  
    System.out.print(euros+ " son " + pesetas + " pesetas");  
  }
}  
  
  
