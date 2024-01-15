package Pilhas.Exer02;

public class Pilha {
    private static final int TAM_MAX = 100;
    private char[] pilha = new char[TAM_MAX];
    private int topo = -1;

    public boolean isVazia() {
        return topo == -1;
    }

    public void push(char elemento) throws Exception {
        if (topo == TAM_MAX - 1) {
            throw new Exception("Pilha cheia");
        }
        pilha[++topo] = elemento;
    }

    public char pop() throws Exception {
        if (isVazia()) {
            throw new Exception("Pilha vazia");
        }
        return pilha[topo--];
    }
}
