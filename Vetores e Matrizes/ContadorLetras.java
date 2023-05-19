package aula07.exe01;

import javax.swing.JOptionPane;

public class ContadorLetras {
	
	public static void main(String[] args) {
		
		String palavra = JOptionPane.showInputDialog("Digite a palavra");
		
		int contador = 0;
		
		for (int i = 0; i < palavra.length(); i++) {
			if ( palavra.charAt(i) == 'a' ) {
				contador++;
			}
		}
		System.out.println("Total de letras A: " + contador);
	}
}