package t4_libro;

import java.util.Scanner;

public class ejer20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numRevert = 0;
		int numeroTemp; 
		int numOrig;
		
		//while(true) {
			System.out.println("-------------------------------------- \n");
			System.out.println("Introduce un n�mero entero y te dir� si es capicu�: ");
			int numero = Integer.parseInt(sc.nextLine());
			

			numOrig = numero;

			while (numero != 0) {
				numeroTemp = numero % 10;
				numRevert = numRevert * 10 + numeroTemp;
				numero /= 10;
			}

			if (numOrig == numRevert) {
				System.out.println(numOrig + " es capic�o.");
			}else {
				System.out.println(numOrig + " no es capicuo.");
			}
		//}
		
	}
}
