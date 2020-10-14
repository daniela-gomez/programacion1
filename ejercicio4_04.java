/**
*
*Este programa saluda según la hora
*
*@author: Daniela Gómez 
*
*/
public class ejercicio4_04 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
    int horas = Integer.parseInt(System.console().readLine());
    int hOrdinarias = 40;
    int ordinarias = hOrdinarias * 12;
    int hextras = horas - hOrdinarias;
    int extras = ((hextras) * 16);
    
    if ((horas>=1) && (horas<=40)) {
    System.out.print("Tu salario de la semana es: " + ordinarias + " euros");
    
    }
    
    if (horas>=41) {
    System.out.print("Tu salario de la semana es: " + (ordinarias + extras) + " euros.");
    
    }
    
    
    
    
  }
}  
  
