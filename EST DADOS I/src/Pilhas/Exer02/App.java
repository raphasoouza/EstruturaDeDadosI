package Pilhas.Exer02;

import java.util.Scanner;

public class App {
    private Pilha pilha;

    public App() {
        pilha = new Pilha();
    }

    public boolean verifica(String expressao) {
        try {
            for (char caractere : expressao.toCharArray()) {
                if (caractere == '(') {
                    pilha.push(caractere);
                } else if (caractere == ')') {
                    try {
                        pilha.pop();
                    } catch (Exception e) {
                        return false;
                    }
                }
            }

            return pilha.isVazia();
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        App verificador = new App();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma expressão matemática:");
        String expressao = scanner.nextLine();

        boolean resultado = verificador.verifica(expressao);

        if (resultado) {
            System.out.println("Os parênteses na expressão estão corretos.");
        } else {
            System.out.println("Os parênteses na expressão estão incorretos.");
        }

        scanner.close();
    }
}
