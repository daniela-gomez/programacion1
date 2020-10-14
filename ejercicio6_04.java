
/**
*
*Este programa calcule el tiempo que tardará en caer un objeto desde
*una altura h. Aplica la fórmula t =
*√
*2h
*g siendo g = 9:81m/s
*
*@author: Daniela Gómez 
*
*/
public class ejercicio6_04 {
 
    public static void main(String[] args) {
    System.out.println("Puedo calcular el tiempo de caida de un objeto");
    
    System.out.println("Introduce la altura en metros desde la que cae el objeto:");
    Double h = Double.parseDouble(System.console().readLine());
    
    double t = Math.sqrt (2*h/9.81);
    
    
    
    System.out.printf("El objeto tarda %.3f segundos en caer", t);        
    
     
    
  
  }
}  
  
