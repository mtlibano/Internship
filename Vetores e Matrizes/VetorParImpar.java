package aula07.exe01;

import javax.swing.JOptionPane;

public class VetorParImpar {
	
	public static void main(String[] args) {
		
		
		int[] numero = new int[10];
		
		for(int i = 0; i < numero.length; i++) {
			numero[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º numero"));			
		}
		
		int contadorPar = 0;
		int contadorImpar = 0;
		
		for(int j = 0; j < numero.length; j++) {
			if (numero[j] % 2 == 0) {
				contadorPar++;
			} else
				contadorImpar++;
		}
		System.out.println("Total números PAR: " + contadorPar);
		System.out.println("Total números ÍMPAR: " + contadorImpar);
	}
}