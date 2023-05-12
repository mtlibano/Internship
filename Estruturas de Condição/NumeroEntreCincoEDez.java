package aula03;

import javax.swing.JOptionPane;

public class NumeroEntreCincoEDez {

    public static final int VALOR = 2;

    public static void main(String[] args)  {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 5 e 10"));

        if (numero >= 5 && numero <= 10) {
            int calc = numero * VALOR;
            System.out.println(calc);
        } else if (numero < 5) {
            System.out.println("Número pequeno");
        } else if (numero > 10) {
            System.out.println("Número muito grande");
        }
    }
}