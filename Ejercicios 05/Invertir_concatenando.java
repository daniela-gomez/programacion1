/**
*
*Prgrama que presenta tabla de multiplicar de un número con tantas filas como el usuario quiera
*
*
*
*@author: Daniela Gómez 
*
*/
public class Invertir_concatenando {
  public static void main(String[] args) {
    int n = 34621;

    System.out.print("Introduce numero: ");
    n = Integer.parseInt(System.console().readLine());

    int resto;
    String str="";

    while (n>0) {
      resto=n%10;
      n = n/10;

      str = str + resto;
    }

    System.out.println("Resultado: " + str);
  }
}
