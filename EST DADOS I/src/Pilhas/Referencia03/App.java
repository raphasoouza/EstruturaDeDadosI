package Pilhas.Referencia03;

public @interface App {
    public class DuasPilhasEmUmArray {

        private int tamanhoMax;
        private int topo1, topo2;
        private int[] vetor;
    
        public DuasPilhasEmUmArray(int tamanhoMax) {
            this.tamanhoMax = tamanhoMax;
            this.topo1 = -1;
            this.topo2 = tamanhoMax;
            this.vetor = new int[tamanhoMax];
        }
    
        public void pushPilha1(int valor) {
            if (topo1 < topo2 - 1) {
                vetor[++topo1] = valor;
            } else {
                System.out.println("Estouro da pilha 1. Não é possível adicionar mais elementos.");
            }
        }
    
        public void pushPilha2(int valor) {
            if (topo1 < topo2 - 1) {
                vetor[--topo2] = valor;
            } else {
                System.out.println("Estouro da pilha 2. Não é possível adicionar mais elementos.");
            }
        }
    
        public int popPilha1() {
            if (topo1 >= 0) {
                return vetor[topo1--];
            } else {
                System.out.println("A pilha 1 está vazia.");
                return -1; // Valor inválido para indicar que a pilha está vazia
            }
        }
    
        public int popPilha2() {
            if (topo2 < tamanhoMax) {
                return vetor[topo2++];
            } else {
                System.out.println("A pilha 2 está vazia.");
                return -1; // Valor inválido para indicar que a pilha está vazia
            }
        }
    
        public static void main(String[] args) {
            DuasPilhasEmUmArray duasPilhas = new DuasPilhasEmUmArray(10);
    
            duasPilhas.pushPilha1(1);
            duasPilhas.pushPilha1(2);
            duasPilhas.pushPilha1(3);
    
            duasPilhas.pushPilha2(10);
            duasPilhas.pushPilha2(9);
            duasPilhas.pushPilha2(8);
    
            System.out.println("Elementos removidos da pilha 1:");
            System.out.println(duasPilhas.popPilha1());
            System.out.println(duasPilhas.popPilha1());
            System.out.println(duasPilhas.popPilha1());
    
            System.out.println("\nElementos removidos da pilha 2:");
            System.out.println(duasPilhas.popPilha2());
            System.out.println(duasPilhas.popPilha2());
            System.out.println(duasPilhas.popPilha2());
        }
    }
    
}
