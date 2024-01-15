package Pilhas.Exer01;

public class Pilha {
    static final int TAM_MAX = 100; 
    Processo[] pilha = new Processo[TAM_MAX]; 
    int topo = -1;

    public boolean isVazia() {
        return topo == -1;
    }

    public int getTamanho() {
        return topo + 1;
    }

    public void push(Processo p) throws Exception {
        if (topo == TAM_MAX - 1) { 
            throw new Exception("Não há espaço disponível");
        }
        pilha[++topo] = p;
    }

    public Processo pop() throws Exception {
        if (isVazia())
            throw new Exception("Lista Vazia");
        return pilha[topo--];
    }

    public int encontrarProcesso(int codigo) throws Exception {
        for (int i = 0; i <= topo; i++) {
            if (pilha[i].codigo == codigo) {
                return i;
            }
        }
        throw new Exception("Processo não encontrado na pilha");
    }
}
