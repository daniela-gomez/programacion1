/**
*
*Este programa pinta una piramide rellena con el caracter que el usuario desee
*
*
*
*@author: Daniela Gómez 
*
*/
public class ejercicio16_04 {
 
    public static void main(String[] args) {
      
          int puntos = 0; 
      String respuesta;
      
      
      System.out.println("Responde a las siguientes 10 cuestiones y comprueba si tu pareja te es fiel!");
      System.out.println("Recuerda que solo puedes responder con 'v' par verdadero y 'f' para falso");
    
      System.out.println("\n1.Tu pareja parece estar más inquieta de lo normal sin motivo aparente.");
      respuesta = System.console().readLine();
      
      if (respuesta.equals("v")) {
        puntos += 3;
      }
      
      System.out.println("\n2.Ha aumentado sus gastos de vestuario");
      respuesta = System.console().readLine();
      
      if (respuesta.equals("v")) {
        puntos += 3;
      }
      
      System.out.println("\n3.Ha perdido el interés que mostraba anteriormente por ti");
      respuesta = System.console().readLine();
      
      if (respuesta.equals("v")) {
        puntos += 3;
      }
      
      System.out.println("\n4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se\narregla el pelo y se asea con más frecuencia (si es mujer)");
      respuesta = System.console().readLine();
      
      if (respuesta.equals("v")) {
        puntos += 3;
      }
      
      
      System.out.println("\n5. No te deja que mires la agenda de su teléfono móvil");
      respuesta = System.console().readLine();
      
      if (respuesta.equals("v")) {
        puntos += 3;
      }
      
      
      System.out.println("\n6.A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
      respuesta = System.console().readLine();
      
      if (respuesta.equals("v")) {
        puntos += 3;
      }
      
      
      System.out.println("\n7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado");
      respuesta = System.console().readLine();
      
      if (respuesta.equals("v")) {
        puntos += 3;
      }
      
      System.out.println("\n8.Muchos días viene tarde después de trabajar porque dice tener mucho más\ntrabajo");
      respuesta = System.console().readLine();
      
      if (respuesta.equals("v")) {
        puntos += 3;
      }
      
      System.out.println("\n9.Has notado que últimamente se perfuma más");
      respuesta = System.console().readLine();
      
      if (respuesta.equals("v")) {
        puntos += 3;
      }
      
      
      System.out.println("\n10.Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
      respuesta = System.console().readLine();
      
      if (respuesta.equals("v")) {
        puntos += 3;
      }
      
      if (puntos <= 10) {
        System.out.println("\nEnhorabuena! Tu pareja parece ser totalmente fiel");
      }  
      
      if ((puntos > 10) && (puntos <= 22)) {
        System.out.println("\nQuizas exista el peligro de otra persona en su vida o en su mente, aunque\nseguramente será algo sin importancia. No bajes la guardia");
      }  
      
      if ((puntos > 22) && (puntos <=30)) {
        System.out.println("\nTu pareja tiene todos los ingredientes para estar viviendo un romance con otra\npersona. Te aconsejamos que indagues un poco más  averigües que es lo que está\npasando por su cabeza");
      }  
      
      
    
   
  }
}  
  
