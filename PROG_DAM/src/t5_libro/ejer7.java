package t5_libro;
import java.util.Scanner;

public class ejer7 {

	public static void main(String[] args) {
//		System.out.println("Realiza el control de acceso a una caja fuerte. La combinaci�n ser� un\r\n"
//				+ "n�mero de 4 cifras. El programa nos pedir� la combinaci�n para abrirla. Si no\r\n"
//				+ "acertamos, se nos mostrar� el mensaje �Lo siento, esa no es la combinaci�n�\r\n"
//				+ "y si acertamos se nos dir� �La caja fuerte se ha abierto satisfactoriamente�.\r\n"
//				+ "Tendremos cuatro oportunidades para abrir la caja fuerte.");
		Scanner sc = new Scanner(System.in);
		final int correctPass = 4433;
		int intentos = 0;
		
		while(intentos < 4) {
			System.out.print("Introduce los 4 n�meros de la caja fuerte: ");
			int passEntered = Integer.parseInt(sc.nextLine());
			if(passEntered == correctPass) {
				System.out.println("La caja fuerte se ha abierto correctamente.");
			}else {
				System.out.println("No has introducido la combinaci�n correcta.");
			}
			intentos += 1;
		}

	}

}
