/**
*
*
*
*
*
*@author: Daniela Gómez 
*
*/
public class ejercicio52_05 {
  public static void main(String[] args) {
    int n = 6538;
    int desplazamiento;

    System.out.print("Introduzca un numero: ");
    n = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca un numero de rotaciones: ");
    desplazamiento = Integer.parseInt(System.console().readLine());
    
    int aux;
    int resto;
    int numero;
    int resultado=0;

    //865 3

    //cortar 8
    //8*1000=8000
    //8000 + 653 = 8653

    aux = n;
    int pot=1;
    while (aux>0) {
      pot = pot*10;
      aux = aux/10;
    }
    pot=pot/10;   //1000

    for (int i=0; i<desplazamiento; i++) {
      resto = n%10;
      numero = n/10;  
      resultado = resto*pot + numero;

      n = resultado;    //actualiza la variable 
    }
    
    System.out.printf("El numero resultado es %d", resultado);
  }
}

