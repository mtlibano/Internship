package aula03;

import javax.swing.*;

public class NumeroMaiorQueDez {
    
    public static final int VALOR = 2;

    public static void main(String[] args) {
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número maior que 10"));
        
        if (numero > 10) {
            int calc = numero * VALOR;
            System.out.println(calc);
        } else {
            System.out.println("ERRO! Número inválido");
        }
    }
}