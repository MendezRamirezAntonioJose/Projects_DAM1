package t4_libro;

import java.util.Scanner;

public class ejer18 {
	public static  void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Por favor, introduce un n�mero ENTERO (M�ximo 5 cifras):");
			int numero = Integer.parseInt(sc.nextLine());
			
			while (numero >= 10) {
				numero/= 10; 
			}

			System.out.println("La primera cifra del n�mero introducido es: " + numero);
		}
		
	}
}