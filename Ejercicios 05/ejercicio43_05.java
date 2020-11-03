/**
*
*Escribe un programa que permita partir un número introducido por teclado en dos partes. Las posiciones se cuentan de izquierda a derecha empezando por el 1. Suponemos que el usuario introduce correctamente los datos, es decir, el número introducido tiene dos dígitos como mínimo y la posición en la que se parte el número está entre 2 y la longitud del número. No se permite en este ejercicio el uso de funciones de manejo de String (por ej. para extraer subcadenas dentro de una cadena).
*
*
*
*@author: Daniela Gómez 
*
*/
public class ejercicio43_05 {
  public static void main(String[] args) {
    long n = 0;
    long aux;
    long posicion = 0;
    long desplazamienot= 0;
    long izquierda=0;
    long derecha=0; 

    System.out.print("Introduzca un numero entero positivo: ");
    n = Long.parseLong(System.console().readLine());

    System.out.print("Introduzca la posicioón a partir de la cual desea partir el número: ");
    posicion = Long.parseLong(System.console().readLine());
    
   
    int longitud = 0;
    aux = n;

    do {
      
      aux = aux/10;
      longitud++;
    } while (aux>0); 
    
    
    izquierda = n / (long) (Math.pow (10, longitud - posicion+1));
    derecha = n % (long) (Math.pow (10, longitud - posicion+1));
  
    
    System.out.println("El número partido es: " + izquierda + " y " + derecha);
  }
}
