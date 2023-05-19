package aula07.exe01;

public class Diagonal5x5 {
	
	public static void main(String[] args) {
		
		int[][] numero = new int [][] {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
		
		for(int i = 0; i < numero.length; i++) {
			for(int j = 0; j < numero[0].length; j++) {
				if (i == j || (i+j) == (numero.length-1)) {
					System.out.print(numero[i][j] + " ");		
				} else if (i != j) {
					System.out.print("  ");
				}				
			}
			System.out.print("\n");
		}		
	}
}