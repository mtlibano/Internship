package aula07;

import javax.swing.JOptionPane;
import java.util.Random;

public class VetorVerificarVazio {

    public static void main(String[] args) {

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            Random random = new Random();
            vetor[i] = random.nextInt(10);
            System.out.print("[" + vetor[i] + "] ");
        }
        System.out.println("");

        posicoesVazias(vetor);
    }

    static void posicoesVazias(int vetor[]) {
        int contador = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == 0) {
                System.out.println("Posição vazia encontrada! Índice vetor: " + i);
                contador++;
            }
        }

        for (int j = 0; j < contador; j++) {
            int indice = Integer.parseInt(JOptionPane.showInputDialog("Digite o índice do vetor que deseja alterar"));
            vetor[indice] = Integer.parseInt(JOptionPane.showInputDialog("Digite o novo valor"));
        }

        for (int k = 0; k < vetor.length; k++) {
            System.out.print("[" + vetor[k] + "] ");
        }
    }
}