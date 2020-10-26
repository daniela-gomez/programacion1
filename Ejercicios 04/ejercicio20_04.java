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
public class ejercicio20_04 {
 
    public static void main(String[] args) {
      
      System.out.println("Por favor introduce un número entero de máximo 5 cifras");
      int numero = Integer.parseInt(System.console().readLine());
      
      int primera=0;
      int segunda=0;
      int tercera=0;
      int cuarta=0;
      int quinta=0;
      
      
      if (numero > 10000) {
        primera = numero / 10000;
        quinta = numero % 10;
        
        if (primera == quinta) {
          segunda = (numero % 10000) / 1000;
          cuarta = (numero % 100) / 10;
          if (segunda == cuarta) {
            System.out.println(numero + " es un número capicúa");
          } else { 
            System.out.println(numero + " no es un número capicúa");
          }
        }
            
         
      } else if (numero > 1000) {
        primera = numero / 1000;
        cuarta = numero % 10;
        if (primera == cuarta) {
          segunda = (numero % 1000) / 100;
          tercera = (numero % 100) / 10;
          if (segunda == tercera) {
            System.out.println(numero + " es un número capicúa");
          } else { 
            System.out.println(numero + " no es un número capicúa");
          }  
        
        } else {
          System.out.println(numero + " no es un número capicúa");
        }
        
        } else if (numero > 100) {
        primera = numero / 100;
        tercera = numero % 10;
          if (primera == tercera) {
            System.out.println(numero + " es un número capicúa");
          }
              else { 
                System.out.println(numero + " no es un número capicúa");
              }
          } else if ((numero > 10) && (numero > 10)) {
            primera = numero / 10;
            segunda = numero % 10;
            if (primera == segunda) {
              System.out.println(numero + " es un número capicúa");
            } else {
              System.out.println(numero + " no es un número capicúa");
            }
          }
        
    
   
  }
}  
  
