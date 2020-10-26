/**
*
*Este programa resuelve ecuaciones de segundo grado del tipo ax²+bx+c=0
*
*
*
*@author: Daniela Gómez 
*
*/
public class ejercicio9_04 {
 
    public static void main(String[] args) {
    System.out.println("Puedo resolver ecuaciones del tipo ax²+bx+c=0");
    
    double x1;
    double x2; 
    
    System.out.println("Introduce el valor de a");
    Double a = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduce el valor de b");
    Double b = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduce el valor de c");
    Double c = Double.parseDouble(System.console().readLine());
    
    
    
    
  
     if (( a == 0 ) && ( b == 0 ) && ( c == 0 )) {
       System.out.print("La ecuacion tiene infinitas soluciones para estos valores");
       
     }
     
     if (( a == 0 ) && ( b == 0 ) && ( c != 0 )) {
       System.out.print("No tiene solución para estos valores"); 
     }
    
     if (( a != 0 ) && ( b != 0 ) && ( c == 0 )) {
       System.out.print("x1=0");
       System.out.print("x2=" + (-b/a));
     }
     
     if (( a == 0 ) && ( b != 0 ) && ( c != 0 )) {
       System.out.print("x1= x2= " + (-c/b));
       
     }
     
      if (( a != 0 ) && ( b != 0 ) && ( c != 0 )) {
       
       
       double raiz = b*b - (4*a*c);
         
         if (raiz < 0 ) {
           System.out.println("No existe solución");
         } else { 
           System.out.println("x1 = " + (-b + Math.sqrt(raiz))/(2*a));
           System.out.println("x2 = " + (-b - Math.sqrt(raiz))/(2*a));
         }
       
     }
        
     
  
  }
}  
  
