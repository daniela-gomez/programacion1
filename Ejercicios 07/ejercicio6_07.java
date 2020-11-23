/** 
*
*Ejercicio 6 tema 7
*
*
*
*/
public class ejercicio6_07 {
  public static void main (String[] args) {
    // 1 2 3 4
    //[23][11][15][33]
    //[23][11][15][]
  
    //x=33
  
    int[] num = new int[15]; // 0-14
  
    for (int i=0; i<15;i++) {
      System.out.print("Introduce el valor " + i + " : ");
      int numeroIntro = Integer.parseInt(System.console().readLine()); 
      num[i] = numeroIntro;
    }


    int ultimo;
    ultimo=num[14];

    for (int i=13; i>=0; i--) {
      num[i+1]=num[i];
    }

    num[0]=ultimo;

    System.out.println();

    for (int i=0; i<15; i++) {      
      System.out.print(num[i] + " ");
    }    

    System.out.println();

  
  
  }
}
