package t5_libro;

import java.util.Scanner;

public class ejer10 {

	public static void main(String[] args) {
//		System.out.println("Escribe un programa que calcule la media de un conjunto de n�meros positivos\r\n"
//				+ "introducidos por teclado. A priori, el programa no sabe cu�ntos n�meros se\r\n"
//				+ "introducir�n. El usuario indicar� que ha terminado de introducir los datos\r\n"
//				+ "cuando meta un n�mero negativo.\r\n"
//				+ "");
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int numberSc = 0;
		long number = 0;
		
		while(true) {
			System.out.println("Introduce los n�meros para realizar la media de los mismos (introduce uno negativo para finalizar):");
			numberSc = Integer.parseInt(sc.nextLine());
			
			if(numberSc > 0) {
				count += 1;
				number = number + numberSc;
			} else if(numberSc < 0) {
				//System.out.println("number - count " + number + " " + count);
				System.out.println("La media es: " + number / count);
				return;
			} else {
				System.out.println("Error.");
				return;
			}
		}
		

		
	}

}
