package t4_libro;

import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
//		Escribe un programa que pida por teclado un d�a de la semana y que diga qu�
//		asignatura toca a primera hora ese d�a.
		
		Scanner sc = new Scanner(System.in);
		
		final String aLunes = "Bases de datos";
		final String aMartes = "Entornos de desarrollo";
		final String aMiercoles = "Entornos de desarrollo";
		final String aJueves = "FOL";
		final String aViernes = "Programaci�n";
		
		System.out.println("Escribe el d�a de la semana que toca (Lunes, Martes, Miercoles, Jueves o Viernes");
		String selection = sc.nextLine();
		
		switch(selection) {
			case "Lunes":
				System.out.println("A primera hora tendr�s: " + aLunes);
				break;
			case "Martes":
				System.out.println("A primera hora tendr�s: " + aMartes);
				break;
			case "Miercoles":
				System.out.println("A primera hora tendr�s: " + aMiercoles);
				break;
			case "Jueves":
				System.out.println("A primera hora tendr�s: " + aJueves);
				break;
			case "Viernes":
				System.out.println("A primera hora tendr�s: " + aViernes);
				break;
			default: 
				System.out.println("No has introducido un valor correcto");
		}
	}

}
