package t2yt3_libro;

import java.util.Scanner;

public class ejer8 {
	// Ejercicio 5 y 6 del punto 3.4 del Libro.
	// El 7 y 8 y 9 y10 y 11 y 12... es m�s de lo mismo de lo anterior...
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println(
					"Bienvenido selecciona la opci�n que m�s te convenga:");
			System.out.println(
					"1 --> calcular �rea de un rect�ngulo \n"
					+ "2 --> calcular �rea de un tri�ngulo");
			
			String seleccion = sc.nextLine();
			
			if (seleccion.equals("1")) {
				System.out.println("Escribe el tama�o de la base del rect�ngulo");
				double base = Double.parseDouble(sc.nextLine());
				System.out.println("Escribe el tama�o de la altura del rect�ngulo");
				double altura = Double.parseDouble(sc.nextLine());
				double areaRectangulo = base * altura;
				System.out.println("El �rea del rect�ngulo es: " + areaRectangulo);
				
			} else if (seleccion.equals("2")) {
				System.out.println("Escribe el tama�o de la base del tri�ngulo");
				double base = Double.parseDouble(sc.nextLine());
				System.out.println("Escribe el tama�o de la altura del tri�ngulo");
				double altura = Double.parseDouble(sc.nextLine());
				double areaTriangulo = (base * altura) /2;
				System.out.println("El �rea del tri�ngulo es: " + areaTriangulo);
				
			}else {
				System.out.println("ERROR: Vuelve a intentarlo.");
				
			}
		}
	}
}