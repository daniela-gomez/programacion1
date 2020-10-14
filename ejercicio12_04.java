/**
*
*Este programa calcula los segundos que faltan para llegar a media noche
*
*
*
*@author: Daniela Gómez 
*
*/
public class ejercicio12_04 {
 
    public static void main(String[] args) {
      
      int puntos = 0; 
      String respuesta;
      
      
      System.out.println("Responde a las siguientes 10 preguntas y alcanza la máxima puntuación!");
    
      System.out.println("\n1.¿Qué es un ordenador?");
      System.out.println("a)un dispositivo mecánico\nb)un dispositivo electrónico\nc)un robot\n");
      respuesta = System.console().readLine();
      if (respuesta.equals("b")) {
        puntos++;
      }
      
      System.out.println("\n2.¿Cuáles de las siguientes unidades se consideran dispositivos de entrada/salida?");
      System.out.println("a)Ratón\nb)Pantalla táctil\nc)Lector DVD");
      respuesta = System.console().readLine();
      if (respuesta.equals("b")) {
        puntos++;
      }
      
      System.out.println("\n3.¿Qué componente forma parte de la Unidad Central de Proceso de un ordenador?");
      System.out.println("a)Unidad aritmético lógica\nb)Memoria central\nc)Unidad entrada salida\n");
      respuesta = System.console().readLine();
      if (respuesta.equals("a")) {
        puntos++;
      }
      
      System.out.println("\n4. ¿Para qué sirve una fuente de alimentación?");
      System.out.println("a)Para refrigerar el interior del ordenador con su ventilador\nb)Para crear y estabilizar la corriente alterna\nc)Para suministrar la corriente continua que necesita el ordenador\n");
      respuesta = System.console().readLine();
      if (respuesta.equals("c")) {
        puntos++;
      }
      
      
      System.out.println("\n5. ¿Cuál es un conector propio de los dispositivos de almacenamiento?");
      System.out.println("a)PCI\nb)SVGA\nc)IDE\n");
      respuesta = System.console().readLine();
      if (respuesta.equals("c")) {
        puntos++;
      }
      
      
      System.out.println("\n6.¿Qué es un slot de memoria?");
      System.out.println("a)Cada una de las plaquitas de memoria insertadas en la placa base\nb)El conector en el que se inserta la memoria RAM\nc)Es el zócalo destinado a conectar la memoria ROM\n");
      respuesta = System.console().readLine();
      if (respuesta.equals("b")) {
        puntos++;
      }
      
      
      System.out.println("\n7. ¿Cuántas representaciones del 0 existen en C-2");
      System.out.println("a)1\nb)3\nc)2\n");
      respuesta = System.console().readLine();
      if (respuesta.equals("a")) {
        puntos++;
      }
      
      System.out.println("\n8.¿En qué lenguaje se ejecuta la máquina de Von Neumann?");
      System.out.println("a)HTML\nb)FIELDATA \nc)Ensamblador\n");
      respuesta = System.console().readLine();
      if (respuesta.equals("c")) {
        puntos++;
      }
      
      System.out.println("\n9.¿Qué tipo de memoria es ultrarápida?");
      System.out.println("a)Memoria Cahché\nb)Memoria Principal\nc)Registros del procesador\n");
      respuesta = System.console().readLine();
      if (respuesta.equals("a")) {
        puntos++;
      }
      
      
      System.out.println("\n10.¿Cuáles son las dos representaciones del 0 en C-1, en 5 bits");
      System.out.println("a) 00000 / 10000\nb) 00000 / 11111\nc) 00000 / 00001\n");
      respuesta = System.console().readLine();
      if (respuesta.equals("b")) {
        puntos++;
      }
      
      
      
      
    
    System.out.printf("Has obtenido %d puntos. Gracias por participar!" , puntos);
    
    
    
    
    
  
     
  
  }
}  
  
