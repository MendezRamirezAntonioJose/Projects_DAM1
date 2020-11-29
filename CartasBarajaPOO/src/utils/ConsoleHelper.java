package utils;

import java.util.Scanner;

public class ConsoleHelper {

	private static Scanner sc = new Scanner(System.in);

	/**
	 * Con gestion de errores lee por teclado una de las opciones que le damos
	 * 
	 * @param min minimo numero a aceptar
	 * @param max maximo numero a aceptar
	 * @return la opcion introducida por el usuario
	 */
	public static int elegirOpcion(int min, int max) {
		boolean isNumber = false;
		int opc = 0;
		while (!isNumber) {
			try {
				opc = Integer.parseInt(sc.nextLine());
				while (opc < min || opc > max) {
					System.out.println("ERROR: Por favor, elige una opci�n entre " + min + " y " + max);
					opc = Integer.parseInt(sc.nextLine());
				}
				isNumber = true;
			} catch (NumberFormatException e) {
				System.out.println("ERROR: Introduce n�meros del " + min + " al " + max);
			}
		}
		return opc;
	}

	/**
	 * Con gestion de errores lee por teclado junto al mensaje dado las opciones que
	 * le damos
	 * 
	 * @param what El mensaje a mostrar al usuario
	 * @return la opcion elegida por el usuario
	 */
	public static boolean leerSiNo(String what) {
		boolean isNumber = false;
		int opc = 0;
		System.out.println(what);
		while (!isNumber) {
			try {
				opc = Integer.parseInt(sc.nextLine());
				while (opc < 0 || opc > 1) {
					System.out.println("ERROR: Por favor, elige una opci�n entre " + 0 + " (no) y " + 1 + "(s�)");
					opc = Integer.parseInt(sc.nextLine());
				}
				isNumber = true;
			} catch (NumberFormatException e) {
				System.out.println("ERROR: Introduce n�meros del " + 0 + " (no) y " + 1 + "(s�)");
			}
		}
		return opc == 1;
	}
}