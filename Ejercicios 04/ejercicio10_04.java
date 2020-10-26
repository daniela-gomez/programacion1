/**
*
*Este programa te dice tu horoscopo
*
*
*
*@author: Daniela Gómez 
*
*/
public class ejercicio10_04 {
    
    
    public static void main(String[] args) {
      String horoscopo="";
      System.out.println("¿Quieres saber tu horóscopo?");
      System.out.println("Dime en qué día naciste");
      int dia = Integer.parseInt(System.console().readLine());
    
      System.out.println("¿Y el mes?(1-12)");
      int mes = Integer.parseInt(System.console().readLine());
    
      switch(mes) {
      case 1: 
       if (dia < 20 ) {
         horoscopo = "Capricornio";
       } else { 
         horoscopo = "Acuario";
       }
       break;
       
       case 2: 
       if (dia < 19 ) {
         horoscopo = "Acuario";
       } else { 
         horoscopo = "Piscis";
       }
       break;
       
       case 3: 
       if (dia < 21 ) {
         horoscopo = "Piscis";
       } else { 
         horoscopo = "Aries";
       }
       break;
       
       case 4: 
       if (dia < 20 ) {
         horoscopo = "Aries";
       } else { 
         horoscopo = "Tauro";
       }
       break;
       
       case 5: 
       if (dia < 21 ) {
         horoscopo = "Tauro";
       } else { 
         horoscopo = "Géminis";
       }
       break;
       
       case 6: 
       if (dia < 21 ) {
         horoscopo = "Géminis";
       } else { 
         horoscopo = "Cáncer";
       }
       break;
       
       case 7: 
       if (dia < 22 ) {
         horoscopo = "Cáncer";
       } else { 
         horoscopo = "Leo";
       }
       break;
       
       case 8: 
       if (dia < 22 ) {
         horoscopo = "Leo";
       } else { 
         horoscopo = "Virgo";
       }
       break;
       
       case 9: 
       if (dia < 22 ) {
         horoscopo = "Virgo";
       } else { 
         horoscopo = "Libra";
       }
       break;
       
       case 10: 
       if (dia < 23 ) {
         horoscopo = "Libra";
       } else { 
         horoscopo = "Escorpio";
       }
       break;
       
       case 11: 
       if (dia < 22 ) {
         horoscopo = "Escorpio";
       } else { 
         horoscopo = "Sagitario";
       }
       break;
       
       case 12: 
       if (dia < 22 ) {
         horoscopo = "Sagitario";
       } else { 
         horoscopo = "Capricornio";
       }
       break;
       default: 
       
     }
     
     System.out.print("Tu horoscopo es: " + horoscopo);
    
    

        
     
  
  }
}  
  
