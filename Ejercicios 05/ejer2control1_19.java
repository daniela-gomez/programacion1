/**
*
*Ejercicio 2 Control 1 2019
*
*
*@author: Daniel Gómez
*
*/
public class ejer2control1_19 {
  public static void main(String [] args) {
    
    char car1='o';
    char car2='+';
    int altura= 6;
    String orientacion="";
    
    System.out.println("Este programa pinta piramides.");
    
    do { 
      System.out.print("Introduzca altura (1-10):");
      altura = Integer.parseInt(System.console().readLine());
    } while (altura<1 || altura>10 );
    
    do {
      System.out.print("Introduzca la orientación(izquierda, derecha, arriba, abajo:)");
      orientacion = System.console().readLine();
    } while (!orientacion.equals("izquierda") && !orientacion.equals("derecha") && !orientacion.equals("arriba") && !orientacion.equals("abajo"));
    
    System.out.print("Introduzca el primer carácter:");
    car1 = System.console().readLine().charAt(0);
    
    System.out.print("Introduzca el segundo carácter:");
    car2 = System.console().readLine().charAt(0);
    
    System.out.println();
    
    switch (orientacion) {
      case "arriba":
        for (int fila=1; fila<=altura; fila++){
          for (int i=1; i<=altura-fila; i++){
            System.out.print(" ");
          }
    
          for (int i=1; i<=fila*2-1; i++) {
            if (i%2==0){
              System.out.print(car1);
            } else {
              System.out.print(car2);
              }
          }
          System.out.println();
        }
      break;  
    
    
    case "abajo":
      int ancho = altura*2-1;
       for (int fila=1; fila<=altura; fila++){
         for (int i=1; i<=fila-1; i++){
           System.out.print(" ");
       }

       for (int i=1; i<=ancho; i++) {
         if (i%2==0){
           System.out.print(car1);
          } else {
              System.out.print(car2);
            }
       }
         ancho -=2;
         System.out.println();
       }
    
    break; 
 
    
    case "izquierda":
      for (int fila=1; fila<=altura; fila++){
      for (int i=1; i<=altura-fila; i++){
        System.out.print(" ");
      }
    
      for (int i=1; i<=fila; i++) {
        if (i%2==0){
          System.out.print(car1);
        } else {
          System.out.print(car2);
          }
      }
      System.out.println();
      
    }
    
    for (int fila=1; fila<=altura-1; fila++){
      for (int i=1; i<=fila; i++) {
        System.out.print(" ");
      }
    
      for (int i=1; i<=altura-fila; i++) {
        if (i%2==0){
          System.out.print(car1);
        } else {
          System.out.print(car2);
          }
      }
      
      System.out.println();
    }
    break; 
    

    case "derecha": 
    for (int fila=1; fila<=altura; fila++){
      for (int i=1; i<=fila; i++) {
        if ((fila+i)%2==0) {
          System.out.print(car2);
        }
        else {
          System.out.print(car1);
        }
   
      }
      
      System.out.println();
    }
    
    
    for (int fila=1; fila<=altura-1; fila++){
      for (int i=1; i<=altura-fila; i++) {
        if ((fila+i)%2==0) {
          System.out.print(car2);
        }
        else {
          System.out.print(car1);
        }
   
      }
      
      System.out.println();
    }
  break;
  default:
  }

  }

}
