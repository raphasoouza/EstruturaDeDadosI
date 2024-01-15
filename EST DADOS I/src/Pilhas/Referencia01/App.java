package Pilhas.Referencia01;

import java.util.Scanner;
import java.util.Stack;

public class App {
    public static void main(String[] args) {
        Stack<Integer> jogador1 = new Stack<>();
        Stack<Integer> jogador2 = new Stack<>();

        Scanner scanner = new Scanner(System.in);

        jogarRodada(jogador1, scanner, "Jogador 1");
        jogarRodada(jogador2, scanner, "Jogador 2");

        int pontuacaoJogador1 = calcularPontuacao(jogador1);
        int pontuacaoJogador2 = calcularPontuacao(jogador2);

        System.out.println("Pontuação do Jogador 1: " + pontuacaoJogador1);
        System.out.println("Pontuação do Jogador 2: " + pontuacaoJogador2);

        if (pontuacaoJogador1 > 21 && pontuacaoJogador2 > 21) {
            System.out.println("Não há vencedor.");
        } else if (pontuacaoJogador1 > 21) {
            System.out.println("Jogador 2 venceu!");
        } else if (pontuacaoJogador2 > 21) {
            System.out.println("Jogador 1 venceu!");
        } else {
            int diferenca1 = 21 - pontuacaoJogador1;
            int diferenca2 = 21 - pontuacaoJogador2;

            if (diferenca1 < diferenca2) {
                System.out.println("Jogador 1 venceu!");
            } else if (diferenca2 < diferenca1) {
                System.out.println("Jogador 2 venceu!");
            } else {
                System.out.println("Empate!");
            }
        }

        scanner.close();
    }

    private static void jogarRodada(Stack<Integer> jogador, Scanner scanner, String nomeJogador) {
        System.out.println(nomeJogador + ", é sua vez.");

        int carta;
        do {
            carta = (int) (Math.random() * 13) + 1;
            System.out.println("Carta sorteada: " + carta);
            jogador.push(carta);

            System.out.println("Deseja pegar mais uma carta? (s/n)");
        } while (scanner.next().equalsIgnoreCase("s"));
    }

    private static int calcularPontuacao(Stack<Integer> jogador) {
        int pontuacao = 0;
        int numCartas = jogador.size();

        while (!jogador.isEmpty()) {
            int carta = jogador.pop();
            pontuacao += carta;

            if (pontuacao > 21) {
                System.out.println("Você ultrapassou 21! Descartando a última carta e aplicando penalidade de 5 pontos.");
                pontuacao -= 5;
            }
        }

        System.out.println("Número de cartas: " + numCartas);
        System.out.println("Pontuação final: " + pontuacao);

        return pontuacao;
    }
}
