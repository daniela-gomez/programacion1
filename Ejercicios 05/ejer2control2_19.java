/**
*
*Ejercicio2 Control2 2019
* 
*
*
*
*@author: Daniela Gómez 
*
*/
public class ejer2control2_19 {
 
    public static void main(String[] args) {
      
      int digito;
      String morse="";
      String resultado="";
      int numeroIntroducido;
      
      
      do {
        System.out.print("Introduzca un valor entero a codificar (>=0):");
        numeroIntroducido = Integer.parseInt(System.console().readLine());
        int aux = numeroIntroducido;
        
        if (aux==0){
          resultado = "-----";
        } else {
        while ( aux>0) {
          digito = aux%10;
          
          switch (digito) {
            case 1:
              morse = ".----";
            break;
            
            case 2:
              morse = "..---";
            break;
            
            case 3:
              morse = "...--";
            break;
            
            case 4:
              morse = "....-";
            break;
            
            case 5:
              morse = ".....";
            break;
            
            case 6:
              morse = "-....";
            break;
            
            case 7:
              morse = "--...";
            break;
            
            case 8:
              morse = "---..";
            break;
            
            case 9:
              morse = "----.";
            break;
            
            case 0:
              morse = "-----";
            break;
            
            default:

          }
          
          resultado = morse +  " "  + resultado;
          aux /=10;
        }

      }
        
        System.out.println(resultado);
        resultado="";
        
      } while (numeroIntroducido >=0);
      
      
            
        
    
   
  }
} 
