import java.util.Scanner;

public class OpVetores3 {

    static String vetor[] = new String[10];
    static int vagas = 0;
    static int fim = -1;
    static String nome;
    static int p;

    public static void insereFinal(String[] vetor, String nome) throws Exception {
        if (fim == vetor.length - 1)
            throw new Exception("Nao ha posicoes livres");
        vetor[++fim] = nome;
    }

    public static void excluirElemento(String[] vetor, int p) throws Exception {
        if (fim == -1)
            throw new Exception(" O vetor esta vazio . ");
        if (p > fim)
            throw new Exception("Esta posicao nao esta em uso.");
        for (int i = p; i < fim; ++i)
            vetor[i] = vetor[i + 1];
        --fim;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String op = "5";
       try {
         while (!op.equals("0")) {
            System.out.println("1 - Cadastrar Convidado");
            System.out.println("2 - Listar Convidados");
            System.out.println("3 - Excluir Convidado");
            System.out.println("4 - Verificar Vagas");
            System.out.println("0 - Sair");
            op = sc.next();

            if (op.equals("1")) {
                System.out.println("Informe o nome do convidado:");
                sc.nextLine(); 
                nome = sc.nextLine();
                insereFinal(vetor, nome);
            }

            if (op.equals("2")) {
                for (int i = 0; i <= fim; i++) {
                    System.out.print(vetor[i] + " ");
                }
                System.out.println();
            }

            if (op.equals("3")) {
                System.out.println("Informe a posição a ser excluída");
                p = sc.nextInt();
                excluirElemento(vetor, p);
            }

            if (op.equals("4")) {
                vagas = 10 - (fim+1);
                System.out.println(fim);
                System.out.println("Há " + vagas + " vagas disponíveis.");
            }

            if (op.equals("0")) {
                System.exit(0);
            }
        }
       } catch (Exception e) {
         System.out.println(e.getLocalizedMessage());
       }
        sc.close();
    }
}
