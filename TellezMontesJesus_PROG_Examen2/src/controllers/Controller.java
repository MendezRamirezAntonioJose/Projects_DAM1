package controllers;

import models.Tienda;
import utils.ConsoleHelper;

public class Controller {
	static Tienda tienda = new Tienda();

	/**
	 * Arranca la l�gica principal del programa.
	 */
	public void run() {
		mainMenu();
	}

	/**
	 * L�gica Menu Principal.
	 */
	private void mainMenu() {
		int opc = 0;
		do {
			System.out.println("- Menu Tienda Musica - \n");
			System.out.println(
					"1.- A�adir instrumento \n2.- Listar instrumentos \n3.- Vender instrumento \n4.- Mostrar caja \n5.- Salir \n");
			System.out.print("Elige una opci�n: ");
			opc = ConsoleHelper.elegirOpcion(1, 5);

			switch (opc) {
			case 1:
				tienda.anyadirInstrumento();
				break;
			case 2:
				tienda.listarInstrumentos();
				break;
			case 3:
				tienda.venderInstrumento();
				break;
			case 4:
				tienda.mostrarCaja();
				break;
			case 5:
				System.out.println("�Gracias por venir Socio!");
				break;

			default:
				System.out.println("[ERROR] Opci�n no v�lida.");
				opc = 0;
			}

		} while (opc != 5);
	}
}
