/**
*
*Este programa calcula la media de tres notas
*
*
*
*@author: Daniela Gómez 
*
*/
public class ejercicio7_04 {
 
    public static void main(String[] args) {
    System.out.println("Puedo calcular la media de tres notas");
    
    System.out.println("Introduce la primera nota:");
    Double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduce la segunda nota:");
    Double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduce la tercera nota:");
    Double nota3 = Double.parseDouble(System.console().readLine());
    
    double media =  (nota1 + nota2 + nota3) /3;
    
    
    
    System.out.printf("Tu nota media es de %.2f", media);        
    
     
    
  
  }
}  
  
