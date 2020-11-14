package t5_libro;

import java.util.Scanner;

public class ejer64 {

	public static void main(String[] args) {
	    
	    int ancho = 6;
	    int alto = 3;
	    
	    Scanner sc = new Scanner(System.in);

	    int opcion = 0;
	    
	    do {
	      // Pinta el rect�ngulo
	      for (int i = 0; i < ancho; i++) {
	          System.out.print("*");
	      }
	      System.out.println();
	      
	      for (int i = 0; i < alto - 2; i++) {
	        System.out.print("*");
	        for (int j = 0; j < ancho - 2; j++) {
	          System.out.print(" ");
	        }
	        System.out.println("*");
	      }
	      
	      for (int i = 0; i < ancho; i++) {
	          System.out.print("*");
	      }
	      System.out.println();
	      
	      // Men�
	      System.out.println("1. Agrandarlo");
	      System.out.println("2. Achicarlo");
	      System.out.println("3. Cambiar la orientaci�n");
	      System.out.println("4. Salir");
	      System.out.print("Indique qu� quiere hacer con el rect�ngulo: ");
	      opcion = Integer.parseInt(sc.nextLine());
	      
	      switch(opcion) {
	        case 1:
	          ancho++;
	          alto++;
	          break;
	        case 2:
	          if ((ancho > 2) && (alto > 2)) {
	            ancho--;
	            alto--;
	          }
	          break;
	        case 3:
	          int aux = ancho;
	          ancho = alto;
	          alto = aux;
	          break;
	        default:
	      }
	      System.out.println();
	    } while (opcion != 4);
	  }

}
