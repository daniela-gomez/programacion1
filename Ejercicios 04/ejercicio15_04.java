/**
*
*Este programa pinta una piramide rellena con el caracter que el usuario desee
*
*
*
*@author: Daniela Gómez 
*
*/
public class ejercicio15_04 {
 
    public static void main(String[] args) {
      
      System.out.println("Voy a pintar una piramide rellena ¿De qué\n carácter quieres que este echa?");
      String c = System.console().readLine();
      
      System.out.println("Ahora elige una opción introduciendo el número");
      System.out.println("1. Pirámide con vértice hacía arriba");
      System.out.println("2. Piramide con vértice hacía abajo");
      System.out.println("3. Piramide con vértrice a la derecha");
      System.out.println("4. Piramide con vértice a la izquierda");
      int opcion = Integer.parseInt(System.console().readLine());
      
      switch(opcion) {
        case 1: 
        System.out.println("   "+c);
        System.out.println("  "+c+c);
        System.out.println(""+c+c+c+c);
        System.out.println(c+c+c+c+c+c);
        break;
        
        case 2:
        System.out.println(c+c+c+c+c+c);
        System.out.println(""+c+c+c+c);
        System.out.println("  "+c+c);
        System.out.println("   "+c);
        break;
        
        case 3:
        System.out.println(c);
        System.out.println(c+c);
        System.out.println(c+c+c);
        System.out.println(c+c+c+c);
        System.out.println(c+c+c);
        System.out.println(c+c);
        System.out.println(c);
        break;
        
        case 4: 
        System.out.println("      "+c);
        System.out.println("    "+c+c+c);
        System.out.println("  "+c+c+c+c+c);
        System.out.println(""+c+c+c+c+c+c+c);
        System.out.println("  "+c+c+c+c+c);
        System.out.println("    "+c+c+c);
        System.out.println("      "+c);
        break;
        default:
      }
        
        
      
      
    
   
   
   
  }
}  
  
