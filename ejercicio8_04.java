/**
*
*Este programa calcula la media de tres notas
*
*
*
*@author: Daniela Gómez 
*
*/
public class ejercicio8_04 {
 
    public static void main(String[] args) {
    System.out.println("Puedo calcular la media de tres notas");
    
    System.out.println("Introduce la primera nota:");
    Double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduce la segunda nota:");
    Double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduce la tercera nota:");
    Double nota3 = Double.parseDouble(System.console().readLine());
    
    double media =  (nota1 + nota2 + nota3) /3;
    
    
    
    System.out.printf("Tu nota media es de %.2f\n", media);        
    
     if (media < 5) {
       System.out.print("Tu nota equivale a  Insuficiente");
       
     }
     
     if ((media >= 5) && (media < 6)) {
       System.out.print("Tu nota equivale a Suficiente"); 
     }
    
     if ((media >=6 ) && (media <7 )) {
       System.out.print("Tu nota media equivale a Bien");
     }
        
     if ((media >= 7) && (media <9 )) {
       System.out.print("Tu nota media equivale a Notable");
     }
     
      if (media >= 9) {
       System.out.print("Tu nota media equivale a Sobresaliente");
     }
  
  }
}  
  
