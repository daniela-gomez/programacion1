/**
*
*Ejercicio 3 Control 1 
*
*
*@author: Daniela Gómez
*
*/
public class Ex11dgb3corregido {
  public static void main(String [] args) {
    
    String articulo="";
    float precioUnidad=0;
    
    float cantidad = 0;
    int ivaIntroducido = 0;
    float preciotipo4=0;
    float preciotipo10=0;
    float preciotipo21=0;
    float totalCompra=0;
    float iva4=0;
    float iva10=0;
    float iva21=0;
    
    
  
  
  
  do {
    System.out.print("Introduzca nombre del artículo:");
    articulo = System.console().readLine();
    
    if (!articulo.equals("fin")) {
      System.out.print("Precio por una unidad para " + articulo +":");
      precioUnidad = Float.parseFloat(System.console().readLine());
      
      System.out.print("Cantidad de unidades de " + articulo + ":");
      cantidad = Integer.parseInt(System.console().readLine());
      
      System.out.print("Tipo de IVA aplicado a " + articulo + " (4, 10, 21):");
      ivaIntroducido = Integer.parseInt(System.console().readLine());
      
      
      
     
      
      switch (ivaIntroducido) {
        case 4:
          iva4 += precioUnidad * cantidad;
          
          
        
        break;
        
        case 10:
          iva10 += precioUnidad * cantidad;
          
        
          
        break;
        
        case 21:
          iva21 += precioUnidad * cantidad;
         
        
          
        break;
        
        default:
      }
      totalCompra = iva4 + iva10 + iva21;
      
      
      
      
      
    }
    
    
     
    
  
  } while ( !articulo.equals("fin")); 
  
  
  System.out.printf("\n TOTAL:                               %.2f\n", totalCompra);
  System.out.println("------------------------------------------");
  System.out.printf("Base imponible 4%%       %.2f      IVA %.2f \n", iva4/1.04,iva4-iva4/1.04);
  System.out.printf("Base imponible 10%%      %.2f      IVA %.2f \n", iva10/1.10,iva10-iva10/1.10);
  System.out.printf("Base imponible 21%%      %.2f      IVA %.2f \n", iva21/1.21,iva21-iva21/1.21);
  



  }

}
