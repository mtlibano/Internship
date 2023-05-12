package aula04;

import javax.swing.JOptionPane;

public class Caixa {

    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número IMPAR"));

        if (numero % 2 != 0) {
            for (int i = 1; i <= numero; i++) {
                for (int j = 1; j <= numero; j++) {
                    if (i == 1) {
                        if (j == i)
                            System.out.print(i + " ");
                        if (j != i && j < numero)
                            System.out.print("* ");
                        if (j == numero && i != numero)
                            System.out.println("*");
                    } else if (i > 1 && i < numero) {
                        if (i > 1 && j == 1)
                            System.out.print("* ");
                        if (i == j)
                            System.out.print(i + " ");
                        if (i != j && j < numero && j > 1)
                            System.out.print("  ");
                        if (j == numero)
                            System.out.println("*");
                    } else if (i == numero) {
                        if (j != i)
                            System.out.print("* ");
                        if (j == i)
                            System.out.print(i);
                    }
                }
            }
        }
    }
}