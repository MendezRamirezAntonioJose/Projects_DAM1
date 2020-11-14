package models;

public class Alumno {

	private String dni;
	private String nombre;
	private String apellidos;
	private double estatura;
	private int edad;
	protected char sexo;
	
	/**
	 * Constructor de Alumno
	 * @param dni
	 * @param nombre
	 * @param apellidos
	 * @param estatura
	 * @param edad
	 * @param sexo
	 */
	public Alumno(String dni, String nombre, String apellidos, double estatura, int edad, char sexo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.estatura = estatura;
		this.edad = edad;
		this.sexo = sexo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", estatura=" + estatura
				+ ", edad=" + edad + ", sexo=" + sexo + "]";
	}

}
