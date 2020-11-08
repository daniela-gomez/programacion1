/**
*
*Ejercicio 3 Control 1 
*
*
*@author: Daniela Gómez
*
*/
public class Ex11dgb2corregido {
  public static void main(String [] args) {
    

    long numero=1234567890;
    long aux;

    System.out.print("Introduzca numero largo: ");
    numero = Long.parseLong(System.console().readLine());

    long digito;
    long pares=0;
    long impares=0;    

    long potencia=1;    //calcula factor de potencia
    aux=numero;
    while(aux>0) {
      digito=aux%10;
      aux/=10;
      potencia= potencia*10;
    }
    potencia/=10;

    //long potOriginal=potencia;
    
    aux=numero;       //los pares: corto por la izquierda el numero, y acumulo por la izquierda
    while(aux>0) {
      digito=aux/potencia;    //0
      aux=aux%potencia;
      potencia/=10;

      if (digito%2==0) {
        pares = pares*10 + digito;    // 12
      } //else impares= impares*10 + digito;      //asi pone los impares en orden
        //else
        //impares= impares + digito*(potOriginal/potencia);   //no vale, no se cuantos impares habra

      if (aux==0) {
        pares*=10;
      }
    }

    aux=numero;
    while (aux>0) {     //los impares: corto el numero por la derecha, acumulo por la izquierda (asi es inverso)
      digito=aux%10;
      aux/=10;

      if (digito%2!=0) {
        impares= impares*10 + digito;
      }
    }

    System.out.println(pares);
    System.out.println(impares);
 
  }

}
