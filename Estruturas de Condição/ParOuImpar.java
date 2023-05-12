package aula03;

import javax.swing.JOptionPane;

public class ParOuImpar {

    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

        if (numero % 2 == 0)
            System.out.println("O " + numero + " número é PAR");
        else
            System.out.println("O " + numero + " número é ÍMPAR");
    }
}