public class ColoreoConFormato {
  public static void main (String[] args)  {
  
    System.out.printf("%-10s | %6s\n","Articulo","Precio");
    System.out.println("------------------");
    System.out.printf("%s%-10s | %6.2f\n","\033[36m","Raton","\033[37m",10.00);
    System.out.printf("%s%-10s | %6.2f\n","\033[35m","webcam","\033[37m",30.5);
    System.out.printf("%s%-10s | %6.2f\n","\033[34m","teclado","\033[37m",8.25);
    System.out.printf("\033[35m%-10s\033[36m | %6.2f\n","Webcam",30.5);
    System.out.printf("\033[34m%-10s\033[36m | %6.2f\n","teclado",8.25);
  }
}  
