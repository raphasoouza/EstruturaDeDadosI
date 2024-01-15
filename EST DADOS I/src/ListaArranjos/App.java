package ListaArranjos;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ListaFilmes lista = new ListaFilmes();
        Scanner sc = new Scanner(System.in);
        String op = "6";
        int codigo;
        String nome, genero;

        try {
            while (!op.equals("0")) {
                System.out.println("1 - Inserir Filme");
                System.out.println("2 - Listar Filmes");
                System.out.println("3 - Aumentar Lista");
                System.out.println("4 - Localizar Filme");
                System.out.println("5 - Excluir Filme");
                System.out.println("0 - Sair");
                op = sc.next();

                if (op.equals("1")) {
                    System.out.println("Informe o código: ");
                    codigo = sc.nextInt();
                    System.out.println("Informe o nome: ");
                    sc.nextLine(); 
                    nome = sc.nextLine();
                    System.out.println("Informe o gênero: ");
                    genero = sc.nextLine();
                    Filmes filme = new Filmes(codigo, nome, genero);
                    lista.add(filme);
                }
                if (op.equals("2")){
                    lista.listar();
                }
                if (op.equals("3")){
                    System.out.println("Informe o novo tamanho: ");
                    int tam = sc.nextInt();
                    lista.aumentar(tam);
                }
                if (op.equals("4")){
                    System.out.println("Informe o nome que deseja: ");
                    sc.nextLine(); 
                    nome = sc.nextLine();
                    System.out.println("----------------------");
                    lista.procura(nome);
                }
                if(op.equals("5")){
                    System.out.println("Informe o código que deseja deletar: ");
                    sc.nextLine(); 
                    codigo = sc.nextInt();
                    lista.remove(codigo);
                }
                if(op.equals(0))
                    System.exit(0);
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
