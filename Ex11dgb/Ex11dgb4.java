/**
*
*Ejercicio 4 Control 1 
*Programa que estira un numero introducido por usuario repitiendo sus digitos tantas veces como lo pida
*
*@author: Daniel Gómez
*
*/
public class Ex11dgb4 {
  public static void main(String [] args) {
    
    int numeroIntroducido=0;
    int estiramiento=0;
    int aux;
    int digito = 0;
    String estirado="";
    
    System.out.print("Introduzca el numero positivo a ser estirado: ");
    numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el estiramiento: ");
    estiramiento = Integer.parseInt(System.console().readLine());
    
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
