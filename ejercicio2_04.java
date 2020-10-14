/**
*
*Este programa saluda según la hora
*
*@author: Daniela Gómez 
*
*/
public class ejercicio2_04 {
  public static void main(String[] args) {
    System.out.println("Hola! ¿Qué hora es? (No incluir los minutos)");
    int hora = Integer.parseInt(System.console().readLine());
    
    
    
    if ((hora>=6) && (hora<=12)) {
    System.out.print("Buenos días");
    
    }
    
    if ((hora>=13) && (hora<=20)) {
    System.out.print("Buenos tardes");
    
    }
    
    if (((hora>=21) && (hora<=24))  || ((hora>=0)&&(hora<=5))) {
    System.out.print("Buenos noches");
    
    }
    
  
    
  }
}  
  
  
