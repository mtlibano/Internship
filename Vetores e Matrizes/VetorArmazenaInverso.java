package aula07.exe01;

import javax.swing.JOptionPane;

public class VetorArmazenaInverso {
	
	public static void main(String[] args) {
		
		int[] numero = new int[10];
		
		for(int i = (numero.length - 1); i > -1; i--) {
			numero[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
		}
		
		for (int j = 0; j < numero.length; j++) {
			System.out.print(numero[j] + " ");
		}
	}
}