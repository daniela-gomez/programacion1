/**
*
*Este programa te dice que clase tienes a primera dependiendo del dia de la semana que insertes
*
*@author: Daniela Gómez 
*
*/
public class ejercicio1_04 {
  public static void main(String[] args) {
    System.out.println("Hola! Te voy a decir que asignatura tienes a primera hora");
    System.out.print("Escribe que día (en minusculas y sin tíldes) de la semana quieres consultar:");
    String respuesta = (System.console().readLine());
    
    
    
    switch (respuesta) {
    
    case "lunes":
    System.out.print("El " + respuesta + "  a primera tienes programación");
    break;
    
    case "martes":
    respuesta.equals("martes");
    System.out.print("El " + respuesta + "  a primera tienes Sistemas Informáticos");
    break;
    
    case "miercoles":
    respuesta.equals("miercoles");
    System.out.print("El " + respuesta + "  a primera tienes programación");
    break;
    
    case "jueves":
    respuesta.equals("jueves");
    System.out.print("El " + respuesta + "  a primera tienes programación");
    break;
    
    case "viernes":
    respuesta.equals("viernes");
    System.out.print("El " + respuesta + "  a primera tienes Sistemas Informáticos");
    break;
    
  

    default:
    System.out.print("Día no válido");
    }
    
  }
}  
  
  
