package t5_libro;

import java.util.Scanner;

public class ejer28 {

	public static void main(String[] args) {
		// C�lculo del factorial de 6
		// 6!=6*5*4*3*2*1=720

		// Escribe un programa que calcule el factorial de un n�mero entero le�do por
		// teclado.

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un n�mero, te calculo el factorial: ");
		int n = Integer.parseInt(sc.nextLine());
		int factorial = n;

		for (int i = 1; i < n; i++) {
			factorial *= i;
		}
		
		System.out.println("El factorial de: " + n + " es: " + factorial);
	}

}
