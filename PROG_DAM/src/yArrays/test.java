package yArrays;

public class test {

	public static void main(String[] args) {
		int fil = 4; // Genera random filas para la matriz
		int col = 4; // Genera random columnas para la matriz
		int[][] matriz = new int[fil][col]; // Matriz principal
		int[] array = {9,3,2,1,2}; // Array para pruebas
		
		yArrays.generarMatriz(matriz);
		yArrays.mostrarMatriz(matriz);
		System.out.println();
		System.out.println();
		
//		System.out.println();
//		System.out.println();
//		if (matriz[0].length == array.length) {
//			for (int i = 0; i < array.length; i++) {
//				 matriz[1][i] = array[i];
//			}
//		} else {
//			System.out.println("TONTOO");
//		}
//		
//		
//		yArrays.mostrarMatriz(matriz);
		
		
		
		
//			for (int i = 0; i < matriz[0].length; i++) {
//				matriz[i][1] = array[i];
//			}
//			
//			System.out.println();
//			System.out.println();
//			
//			yArrays.mostrarMatriz(matriz);
//		

	}

}
