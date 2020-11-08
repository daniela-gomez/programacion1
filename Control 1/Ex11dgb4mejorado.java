/**
*
*Ejercicio 4 mejorado Control 1 
*Programa que estira un numero introducido por usuario repitiendo sus digitos tantas veces como lo pida
*
*@author: Daniel Gómez
*
*/
public class Ex11dgb4mejorado {
  public static void main(String [] args) {
    
    int numeroIntroducido=0;
    int estiramiento=0;
    int aux;
    int digito = 0;
    String estirado="";
    
    do {
      System.out.print("Introduzca el numero positivo a ser estirado: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      if (numeroIntroducido==0) {
        System.out.print("El número cero no vale.");
        }

    } while (numeroIntroducido==0);
    
    if (numeroIntroducido<0) {
        System.out.println("El número introducido es negativo, se tomará el valor absoluto");
        numeroIntroducido = numeroIntroducido * -1;
      }

    
    do {
    System.out.print("Introduzca el estiramiento: ");
    estiramiento = Integer.parseInt(System.console().readLine());
    if (estiramiento<=0) {
      System.out.print("Ha introducido un valor negativo.");
      }
    } while (estiramiento<=0);
    
    aux= numeroIntroducido;
    
    System.out.println("El número " + numeroIntroducido + " estirado por " + estiramiento + " es:");
    
    while ( aux>0) {
      digito = aux%10; //1234 5
      aux /=10; //1234
      for (int i=1; i <= estiramiento; i++){
        estirado = digito+estirado;
      }


    }
    System.out.print(estirado);


  }

}
