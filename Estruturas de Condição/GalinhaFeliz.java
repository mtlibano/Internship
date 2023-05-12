package aula03;

import javax.swing.JOptionPane;

public class GalinhaFeliz {

    public static void main(String[] args) {

        double totalPg = 0;
        int qtdOvos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de ovos"));

        if (qtdOvos >= 30) {
            int qtdBandejas = qtdOvos/30;
            qtdOvos -= qtdBandejas * 30;
            totalPg += qtdBandejas * 21;
        } if (qtdOvos >= 12) {
            int qtdDuzias = qtdOvos/12;
            qtdOvos -= qtdDuzias * 12;
            totalPg += qtdDuzias * 10;
        } if (qtdOvos >= 6) {
            qtdOvos -= 6;
            totalPg += 6;
        } if (qtdOvos > 0) {
            totalPg += qtdOvos * 1.5;
        }
        System.out.printf("Total a pagar R$ %.2f" , totalPg);
    }
}