/** 
*
*
*Ejerecicio 18 tema 7 
*
*/
public class ejercicio18_07 {
  public static void main (String[] args) {
    int[] arr = new int[10];
    int[] menor = new int[10];
    int[] mayor = new int[10];
    

    for (int i=0; i<10; i++) {    //rellena con aleatorios y los pinta 
      arr[i] = (int)(Math.random()*201);
      System.out.print(arr[i] + " ");
    }

    System.out.println();

    // 120, 33, 150, 180, 5
    // menor 33, 5, 1, 0,0,0,0,0,0
    // mayor 120, 150, 180, 190
    // final 33, 120

    int indMayor=0;
    int indMenor=0;
    for (int i=0; i<10; i++) {    //creo los array menor y mayor y condicion
      if (arr[i]>100) {
        mayor[indMayor] = arr[i];
        indMayor++;                 //al final obtengo cuántos mayores y menores tengo
      } else {
        menor[indMenor] = arr[i];
        indMenor++;
      }
    }

    int indFinal=0;    
    int j=0;
    int k=0;

    while (indFinal<10) {     //un unico índice para el array final
    //for (int i=0; i<10; i++) {
      if (j<indMenor) {
        arr[indFinal]=menor[j];     //pregunto si tengo menores, y los meto en el final
        indFinal++;
        j++;
      }

      if (k<indMayor) {       //pregunto si tengo mayores, y los meto en el final
        arr[indFinal]=mayor[k];
        indFinal++;
        k++;
      }
    }


    for (int i=0; i<10; i++) {    
      System.out.print(arr[i] + " ");
    }

    System.out.println();
  
  }
}
