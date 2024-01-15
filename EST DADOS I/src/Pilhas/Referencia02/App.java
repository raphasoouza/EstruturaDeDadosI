
package Pilhas.Referencia02;
import java.util.Scanner;
import java.util.Stack;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho da sequência Iccanobif:");
        int tamanhoSequencia = scanner.nextInt();

        Stack<Integer> sequencia = gerarIccanobif(tamanhoSequencia);

        System.out.println("Sequência Iccanobif de tamanho " + tamanhoSequencia + ":");
        imprimirSequencia(sequencia);

        scanner.close();
    }

    public static Stack<Integer> gerarIccanobif(int tamanho) {
        Stack<Integer> pilha = new Stack<>();

        for (int i = 1; i <= tamanho; i++) {
            if (i <= 2) {
                pilha.push(1);
            } else {
                int termo = pilha.get(i - 2) + pilha.get(i - 3);
                pilha.push(termo);
            }
        }

        return pilha;
    }

    public static void imprimirSequencia(Stack<Integer> sequencia) {
        while (!sequencia.isEmpty()) {
            System.out.print(sequencia.pop() + " ");
        }
        System.out.println();
    }
}
