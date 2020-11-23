/** 
*
*
*Ejerecicio 7 tema 7 
*
*/
public class ejercicio7_07 {
  public static void main (String[] args) {
  
  int[] num = new int[10];

  int maximo = Integer.MIN_VALUE;
  int minimo = Integer.MAX_VALUE;
  int i;
  
  System.out.println("Vaya introduciendo números enteros y pulsando intro:");
  
  for (i = 0; i < 10; i++) {
    num[i] = Integer.parseInt(System.console().readLine());
    if (num[i] < minimo) {
      minimo = num[i];
    }
    if (num[i] > maximo) {
      maximo = num[i];
    }
  }
  
  System.out.println();
  
  for (i = 0; i < 10; i++) {
    System.out.print(num[i]);
    if (num[i] == maximo) {
      System.out.print(" máximo");
    }
    if (num[i] == minimo) {
      System.out.print(" mínimo");
    }
    System.out.println();
  }
  
  
  }
}
