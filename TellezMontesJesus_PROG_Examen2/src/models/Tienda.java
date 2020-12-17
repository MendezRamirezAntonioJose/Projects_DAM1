package models;

import java.util.ArrayList;

import utils.ConsoleHelper;

public class Tienda {
	protected ArrayList<InstrumentoMusical> instrumentosStock;
	double caja;

	/**
	 * Constructor v�cio de la tienda. Inicializa y reserva la memoria del Array de
	 * todos los instrumentos
	 */
	public Tienda() {
		this.caja = 0;
		instrumentosStock = new ArrayList<InstrumentoMusical>();
	}

	/**
	 * M�todo para Conseguir el dinero que hay en la caja de la tienda
	 * 
	 * @return la cantidad de dinero que hay en la caja
	 */
	public double getCaja() {
		return caja;
	}

	/**
	 * M�todo para Pone el dinero (no lo suma) que hay en la caja
	 * 
	 * @param caja dinero que habr� en la caja.
	 */
	public void setCaja(double caja) {
		this.caja = caja;
	}

	/**
	 * M�todo para a�adir dinero a la caja de la tienda
	 * 
	 * @param cantidad cantidad a a�adir a la caja
	 */
	public void anyadirCaja(double cantidad) {
		this.caja += cantidad;
	}

	/**
	 * M�todo que a�ade un instrumento al ArrayList de instrumentos en stock.
	 */
	public void anyadirInstrumento() {
		System.out.println("�Qu� quieres a�adir? \n1.- Bateria \n2.- Guitarra");
		int opcion;
		double precio;
		String marca;
		String modelo;

		opcion = ConsoleHelper.elegirOpcion(1, 2);

		switch (opcion) {
		case 1:
			precio = ConsoleHelper.leerDoublePositivo("Introduce el precio: ");
			marca = ConsoleHelper.leerString("Introduce la marca: ");
			modelo = ConsoleHelper.leerString("Introduce el modelo: ");

			Bateria bateria = new Bateria(precio, marca, modelo);
			instrumentosStock.add(bateria);
			System.out.println("Has a�adido una bateria.");
			break;

		case 2:
			precio = ConsoleHelper.leerDoublePositivo("Introduce el precio: ");
			marca = ConsoleHelper.leerString("Introduce la marca: ");
			modelo = ConsoleHelper.leerString("Introduce el modelo: ");

			Guitarra guitarra = new Guitarra(precio, marca, modelo);
			instrumentosStock.add(guitarra);
			System.out.println("Has a�adido una guitarra.");
			break;
		}

	}

	/**
	 * M�todo que lista cada instrumento que hay en el ArrayList de instrumentos en
	 * stock junto a una id "�nica"
	 */
	public void listarInstrumentos() {
		int id = 0;
		if (!instrumentosStock.isEmpty()) {
			for (InstrumentoMusical instrumentoMusical : instrumentosStock) {
				System.out.print(++id + " ");
				System.out.println(instrumentoMusical + "");
			}

			System.out.println();
		} else {
			System.out.println("No nos quedan m�s instrumentos para vender :(");
		}

	}

	/**
	 * M�todo para vender un instrumento. Lo quita de la lista, avisa al cliente y
	 * suma la venta a la caja.
	 */
	public void venderInstrumento() {
		int opc;
		InstrumentoMusical instrumentoEscogido;

		listarInstrumentos();

		if (!instrumentosStock.isEmpty()) {
			opc = ConsoleHelper.leerInt("�Qu� instrumento deseas?: ");

			instrumentoEscogido = instrumentosStock.get(opc - 1);

			if (instrumentoEscogido != null) {
				anyadirCaja(instrumentoEscogido.getPrecio());
				System.out.println("Te acabas de comprar una " + instrumentoEscogido + ", suena as�: "
						+ instrumentoEscogido.tocarInstrumento() + " �Disfrutala!");

				instrumentosStock.remove(instrumentoEscogido);
			} else {
				System.out.println("No has seleccionado un instrumento v�lido.");
				venderInstrumento();
			}
		}
	}

	/**
	 * M�todo para mostrar el dinero que hay en la caja. (STRING)
	 */
	public void mostrarCaja() {
		System.out.println("En la caja hay de momento: " + getCaja() + "�");
	}

}
