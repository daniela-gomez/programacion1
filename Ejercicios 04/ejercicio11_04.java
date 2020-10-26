/**
*
*Este programa calcula los segundos que faltan para llegar a media noche
*
*
*
*@author: Daniela Gómez 
*
*/
public class ejercicio11_04 {
 
    public static void main(String[] args) {
    System.out.println("Puedo decirte cuantos segundos faltan para la media noche");
    System.out.print("Introduce la hora (1-24):");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce los minutos:");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int segundostranscurridos =  (hora*3600) + (minutos*60);
    int segundosfaltan= (24*3600) - segundostranscurridos;
    
    System.out.printf("Son las " + hora + ":" + minutos + " Así que faltan %d segundos para la medianoche.", segundosfaltan);
    
    
    
    
    
  
     
  
  }
}  
  
