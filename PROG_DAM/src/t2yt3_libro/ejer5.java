package t2yt3_libro;

import java.util.Scanner;

public class ejer5 {
	// Ejercicio 1 del punto 3.4 del Libro.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido al \"multiplicador\" \nPor favor, Introduce el primer n�mero");
		double primerNumero = Double.parseDouble(sc.nextLine());
		System.out.println("El n�mero introducido es: " + primerNumero);
		System.out.println("Por favor, Introduce el segundo n�mero");
		double segundoNumero = Double.parseDouble(sc.nextLine());
		System.out.println("El n�mero introducido es: " + segundoNumero);
		double resultadoMultiplicacion = primerNumero * segundoNumero;
		System.out.println("La multiplicaci�n de: " + primerNumero + " + " + segundoNumero + " es: " + resultadoMultiplicacion);
	}

}
