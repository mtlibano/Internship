package aula07;

import javax.swing.*;

public class VetorMedia {

    public static void main(String[] args) {

        double[] vetor = new double[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (i + 1) + "ª nota"));
        }

        double resultado = calcularMedia(vetor);
        print(resultado, vetor);
    }

    static double calcularMedia(double vetor[]) {
        double acumulador = 0;

        for (int i = 0; i < vetor.length; i++) {
            acumulador += vetor[i];
        }
        double media = acumulador / vetor.length;
        return media;
    }

    static void print(double media, double vetor[]) {

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Nota " + (i + 1) + " = " + vetor[i]);
        }
        System.out.println("Media = " + media);
    }
}