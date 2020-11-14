package t5_libro;

import java.util.Scanner;

public class ejer49 {

	public static void main(String[] args) {

		System.out.println("Por favor, vaya introduciendo n�meros enteros positivos. ");
		System.out.println("Para terminar, introduzca un n�mero primo:");

		Scanner sc = new Scanner(System.in);

		int numero;
		int suma = 0;
		int cuentaNumeros = 0;
		int maximo = Integer.MIN_VALUE;
		int minimo = Integer.MAX_VALUE;
		boolean esPrimo;

		do {
			numero = Integer.parseInt(sc.nextLine());

			// comprueba si el n�mero introducido es primo
			esPrimo = true;
			for (int i = 2; i < numero; i++) {
				if ((numero % i) == 0) {
					esPrimo = false;
				}
			}

			// si no es primo, se contabiliza
			if (!esPrimo) {
				suma += numero;
				cuentaNumeros++;

				maximo = numero > maximo ? numero : maximo;
				minimo = numero < minimo ? numero : minimo;
			}

		} while (!esPrimo);

		System.out.println("Ha introducido " + cuentaNumeros + " n�meros no primos.");
		System.out.println("M�ximo: " + maximo);
		System.out.println("M�nimo: " + minimo);
		System.out.println("Media: " + (double) suma / cuentaNumeros);
	}

}
