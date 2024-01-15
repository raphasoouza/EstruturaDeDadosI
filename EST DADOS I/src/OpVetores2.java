import java.util.Random;

public class OpVetores2 {

    static int vetor[] = new int[100];
    static Random random = new Random();
    static int inicio = 0;
    static int fim = -1;
    static int elemento;
    static int p;
    static int aux;

    public static void insereInicio(int[] vetor, int elemento) throws Exception {
        if (fim == vetor.length - 1)
            throw new Exception("Nao ha posicoes livres");

        for (int i = fim; i >= 0; i--)
            vetor[i + 1] = vetor[i];

        vetor[0] = elemento;
        fim++;
    }

    public static void insereFinal(int[] vetor, int elemento) throws Exception {
        if (fim == vetor.length - 1)
            throw new Exception("Nao ha posicoes livres");

        vetor[++fim] = elemento;
    }

    public static void insereEntreElementos(int[] vetor, int elemento, int p) throws Exception {
        if (fim == vetor.length - 1)
            throw new Exception("Nao ha posicoes livres");

        if (p > fim)
            insereFinal(vetor, elemento);
        else {
            for (int i = fim; i > p; i--)
                vetor[i + 1] = vetor[i];

            vetor[p] = elemento;
            fim++;
        }
    }

    public static void main(String[] args) {
        int i = 0;
        for (i = 0; i < vetor.length; i++) {
            elemento = random.nextInt(50);
            int op = random.nextInt(3) + 1;
            try {
                if (op == 1)
                    insereInicio(vetor, elemento);
                else if (op == 2)
                    insereFinal(vetor, elemento);
                else if (op == 3) {
                    if (aux == 1)
                        insereInicio(vetor, elemento);
                    else if (aux == 2) {
                        p = fim - 1;
                        insereEntreElementos(vetor, elemento, p);
                    }
                }
                if (i == 0 && op == 2)
                    insereInicio(vetor, elemento);
            } catch (Exception e) {
                 System.out.println(e.getMessage());
            }
            aux = op;
        }

        for (i = 0; i <= fim; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
