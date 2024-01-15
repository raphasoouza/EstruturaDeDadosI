import java.util.Scanner;

public class OpVetores4 {

    static int vetor[] = new int[10];
    static int inicio = 0;
    static int fim = -1;  
    static int elemento;
    static int p;

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

    public static void excluirInicio(int[] vetor) throws Exception {
        if (fim == -1)
            throw new Exception("O vetor esta vazio");
        for (int i = 1; i <= fim; ++i)
            vetor[i - 1] = vetor[i];
        --fim;
    }

    public static void excluirFinal(int[] vetor) throws Exception {
        if (fim == -1)
            throw new Exception("O vetor esta vazio");
        --fim;
    }

    public static void excluirElemento(int[] vetor, int p) throws Exception {
        if (fim == -1)
            throw new Exception("O vetor esta vazio");
        if (p > fim)
            throw new Exception("Esta posicao nao esta em uso");
        for (int i = p; i < fim; ++i)
            vetor[i] = vetor[i + 1];
        --fim;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String op = "-1";
       try {
         while (!op.equals("0")) {
            System.out.println("1 - Inserir no início");
            System.out.println("2 - Inserir no final");
            System.out.println("3 - Inserir entre elementos");
            System.out.println("4 - Excluir no início");
            System.out.println("5 - Excluir no final");
            System.out.println("6 - Excluir entre elementos");
            System.out.println("7 - Listar Números");
            System.out.println("0 - Sair");
            op = sc.next();

            if (op.equals("1")) {
                System.out.println("Informe o número:");
                elemento = sc.nextInt();
                insereInicio(vetor, elemento);
            }

            if (op.equals("2")) {
                System.out.println("Informe o número:");
                elemento = sc.nextInt();
                insereFinal(vetor, elemento);
            }

            if (op.equals("3")) {
                System.out.println("Informe o número:");
                elemento = sc.nextInt();
                System.out.println("Informe qual a posição que irá inserir:");
                p = sc.nextInt();
                insereEntreElementos(vetor, elemento, p);
            }

            if (op.equals("4")) {
                excluirInicio(vetor);
            }

            if (op.equals("5")) {
                excluirFinal(vetor);
            }

            if (op.equals("6")) {
                System.out.println("Informe a posição a ser excluída");
                p = sc.nextInt();
                excluirElemento(vetor, p);
            }

            if (op.equals("7")) {
                for (int i = 0; i <= fim; i++) {
                    System.out.print(vetor[i] + " ");
                }
                System.out.println();
            }

            if(op.equals(0))
                System.exit(0);
        }
       } catch (Exception e) {
         System.out.println(e.getMessage());
       }

        sc.close();
    }
}
