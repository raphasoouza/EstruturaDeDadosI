import java.util.Scanner;

public class ExerRevisao {
    static int vetor1[] = new int[10];
    static int vetor2[] = new int[10];
    static int vetor3[] = new int[20];
    static int tam1 = 0;
    static int tam2 = 0;
    static int tam3 = 0;

    public static void inserir(int[] vetor, int elemento, int tam) throws Exception {
        if (tam >= vetor.length)
            throw new Exception("Não há posições livres");
        int p = 0;

        while (p < tam && vetor[p] <= elemento) {
            p++;
        }

        for (int i = tam - 1; i >= p; i--) {
            vetor[i + 1] = vetor[i];
        }

        vetor[p] = elemento;
        tam++;
    }

    public static void unirOrdenado(int[] vetor1, int tam1, int[] vetor2, int tam2, int[] vetor3) {
        int i = 0, j = 0, k = 0;

        while (i < tam1 && j < tam2) {
            if (vetor1[i] <= vetor2[j]) {
                vetor3[k++] = vetor1[i++];
            } else {
                vetor3[k++] = vetor2[j++];
            }
        }

        while (i < tam1) {
            vetor3[k++] = vetor1[i++];
        }

        while (j < tam2) {
            vetor3[k++] = vetor2[j++];
        }

        tam3 = k;
    }

    public static void listar(int[] vetor1, int tam1, int[] vetor2, int tam2, int[] vetor3, int tam3) {
        System.out.print("Vetor 1: ");
        for (int i = 0; i < tam1; i++) {
            System.out.print(vetor1[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor 2: ");
        for (int i = 0; i < tam2; i++) {
            System.out.print(vetor2[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor 3: ");
        for (int i = 0; i < tam3; i++) {
            System.out.print(vetor3[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int op = 6;

        while (op != 0) {
            System.out.println("1 - Inserir elemento");
            System.out.println("2 - Listar Vetores");
            System.out.println("3 - Unir os Vetores");
            System.out.println("0 - Sair");
            op = sc.nextInt();

            if (op == 1) {
                System.out.println("Informe o número:");
                int elemento = sc.nextInt();
                System.out.println("Deseja incluir em qual vetor? 1 ou 2");
                int esc = sc.nextInt();
                if (esc == 1)
                    inserir(vetor1, elemento, tam1++);
                else if (esc == 2)
                    inserir(vetor2, elemento, tam2++);
            } else if (op == 2) {
                listar(vetor1, tam1, vetor2, tam2, vetor3, tam3);
            } else if (op == 3) {
                unirOrdenado(vetor1, tam1, vetor2, tam2, vetor3);
            } else if (op == 0) {
                break;
            }
        }

        sc.close();
    }
}
