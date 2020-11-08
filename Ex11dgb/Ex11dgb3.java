/**
*
*Ejercicio 3 Control 1 
*
*
*@author: Daniela Gómez
*
*/
public class Ex11dgb3 {
  public static void main(String [] args) {
    
    String articulo="";
    float precioUnidad=0;
    float precioArticulos=0;
    float cantidad = 0;
    int ivaIntroducido = 0;
    float preciotipo4=0;
    float preciotipo10=0;
    float preciotipo21=0;
    float totalCompra=0;
    float iva4=0;
    float iva10=0;
    float iva21=0;
    String porciento="%";
    
  
  
  
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
      
      
      precioArticulos = precioUnidad * cantidad;
     
      
      switch (ivaIntroducido) {
        case 4:
          preciotipo4 = precioArticulos + preciotipo4;
          iva4 = preciotipo4 * (float) 0.04;
          
        
        break;
        
        case 10:
          preciotipo10 = precioArticulos + preciotipo10;
          iva10 = preciotipo10 * (float) 0.10;
        
          
        break;
        
        case 21:
          preciotipo21 = precioArticulos + preciotipo21;
          iva21 = preciotipo21 * (float) 0.21;
        
          
        break;
        
        default:
      }
      totalCompra += precioArticulos;
      
      
      
      
      
    }
    
    
     
    
  
  } while ( !articulo.equals("fin")); 
  
  
  System.out.printf("TOTAL:                               %.2f\n", totalCompra);
  System.out.println("------------------------------------------");
  System.out.printf("Base imponible 4%s       %.2f   IVA %.2f \n", porciento, preciotipo4,iva4);
  System.out.printf("Base imponible 10%s      %.2f   IVA %.2f \n", porciento,preciotipo10,iva10);
  System.out.printf("Base imponible 21%s      %.2f   IVA %.2f \n", porciento, preciotipo21,iva21);
  



  }

}
