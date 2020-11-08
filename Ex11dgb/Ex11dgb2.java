/**
*
*Ejercicio 2 
*Programa que pida un numero entero y obtenga dos enteros a partir de él, el primero obtendra los números pares en el mismo orden en el que aparecen y el otro los impares en orden inverso. 
*
*@author: Daniela Gómez
*
*/
public class Ex11dgb2 {
  public static void main(String [] args) {
    
    long numeroIntroducido= 1234567890;
    long aux;
    int potencia;
    long digito;
    int resultado=0;
    int potencia2=0;
    int longitud=0;
    int pares=0;
    int impares=0;
    
    
    
    
    
    System.out.print("Introduzca el número entero positivo para ver qué digitos pares tiene: ");
    numeroIntroducido = Long.parseLong(System.console().readLine());
    
    aux = numeroIntroducido;
    potencia = 1;
    
    
    while ( aux> 0) {
        digito =  aux%10;
        
        longitud++;
      
      
        if (digito%2==0) {
          for (int i=1; i<longitud; i++) {
           potencia = potencia*10;  
           pares = (int) digito*potencia + resultado;
         }
          } else {
              for (int i=1; i<longitud; i++) {
                potencia = potencia*10;  
                impares = (int) digito*potencia + resultado;
            
              }
          }
          
          
        
      
      aux /=10; // 
      
    }
    
    System.out.println("Las cifras pares del número: " + resultado);
    System.out.println("Las impares pares del número: " + resultado);
    
    


  }

}
