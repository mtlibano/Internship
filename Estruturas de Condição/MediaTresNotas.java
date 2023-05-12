package aula03;

import javax.swing.JOptionPane;

public class MediaTresNotas {

    public static final int VALOR = 3;

    public static void main(String[] args) {

        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1ª nota"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2ª nota"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 3ª nota"));

        double media = (nota1 + nota2 + nota3) / VALOR;

        if (media <= 10 && media >= 9) {
            System.out.println("Média: " + media + ", aluno conceito A");
        } else if (media < 9 && media >= 7) {
            System.out.println("Média: " + media + ", aluno conceito B");
        } else if (media < 7 && media >= 5) {
            System.out.println("Média: " + media + ", aluno conceito C");
        } else if (media < 5 && media >= 3) {
            System.out.println("Média: " + media + ", aluno conceito D");
        } else if (media < 3 && media >= 0) {
            System.out.println("Média: " + media + ", aluno conceito E");
        } else {
            System.out.println("Média inválida");
        }
    }
}