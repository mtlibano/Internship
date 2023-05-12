package aula04;

import javax.swing.JOptionPane;

public class Artilheiro {

    public static void main(String[] args) {

        double qtdChutes = 0;
        double qtdGols = 0;
        int maiorSequencia = 0;
        int sequencia = 0;

        double qtdPartidas = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de partidas"));

        for (int i = 1; i <= qtdPartidas; i++) {
            double chutes = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de chutes a gol na " + i + "ª partida"));
            qtdChutes += chutes;
            double gols = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de gols na " + i + "ª partida"));
            qtdGols += gols;

            if (gols != 0) {
                if (sequencia > maiorSequencia) {
                    maiorSequencia = sequencia;
                }
                sequencia = 0;
            } else if (gols == 0 && sequencia == 0) {
                sequencia++;
                if (maiorSequencia == 0) {
                    maiorSequencia++;
                }
            } else if (gols == 0 && sequencia != 0) {
                sequencia++;
                if (sequencia > maiorSequencia) {
                    maiorSequencia = sequencia;
                }
            }
        }

        double mediaChutes = qtdChutes / qtdPartidas;
        double mediaGols = qtdGols / qtdPartidas;

        System.out.println("Total de partidas no ano: " + qtdPartidas);
        System.out.println("Quantidade de chutes a gol no ano: " + qtdChutes);
        System.out.printf("Media de chutes a gol por partida: %.2f\n" , mediaChutes);
        System.out.println("Quantidade de gols no ano: " + qtdGols);
        System.out.printf("Media de gols por partida: %.2f\n" , mediaGols);
        System.out.println("Maior sequência sem marcar gols: " + maiorSequencia);
    }
}