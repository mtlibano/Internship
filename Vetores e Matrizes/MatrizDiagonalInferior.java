package aula07.exe02;

public class MatrizDiagonalInferior {

	public static void main(String[] args) {
		
		int[][] matriz = new int[][] {{1, 3, 6}, {2, 5, 7}, {9, 8, 3}};
		int[] resultado = new int[3];
		int contador = 0;
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " ");
				
				if (i > 0 && j < 2 && (i-j) > 0) {
					resultado[contador] = matriz[i][j];
					contador++;
				}
			}
			System.out.print("\n");
		}
		System.out.println("=====");
		for(int k = 0; k < resultado.length; k++) {
			System.out.print(resultado[k] + " ");
		}

		
	}

}
