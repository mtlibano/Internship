package aula03;

import javax.swing.JOptionPane;

public class Votacao {

    public static void main(String[] args) {

        double qtdDeputados = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de deputados"));
        if (qtdDeputados >= 100) {
            double qtdVotos = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de votos favoráveis"));

            int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção:\n1 - Maioria Simples\n2 - Maioria Qualificada"));
            switch (opcao) {
                case 1:
                    double calcSimples = (qtdVotos * 100) / qtdDeputados;
                    if (calcSimples > 50) {
                        System.out.println("LEI APROVADA!");
                    } else {
                        System.out.println("LEI REPROVADA!");
                    }
                    break;
                case 2:
                    double calcQualificada = qtdDeputados * 2 / 3;
                    if (calcQualificada < qtdVotos) {
                        System.out.println("LEI APROVADA!");
                    } else {
                        System.out.println("LEI REPROVADA");
                    }
                    break;
            }
        } else {
            System.out.println("Sessão cancelada!");
        }
    }
}