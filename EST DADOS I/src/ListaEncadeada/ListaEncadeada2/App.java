package ListaEncadeada.ListaEncadeada2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Cliente p;
        Lista lst = new Lista();
        String nome;
        int codigo, telefone;
        String op;

        try {
            do {
                System.out.println("1 - Cadastrar Cliente");
                System.out.println("2 - Listar Clientes");
                System.out.println("0 - Sair");
                op = sc.next();

                if (op.equals("1")) {
                    System.out.println("Informe o nome do cliente:");
                    sc.nextLine();
                    nome = sc.nextLine();
                    System.out.println("Informe o código do cliente:");
                    codigo = sc.nextInt();
                    System.out.println("Informe o telefone do cliente:");
                    telefone = sc.nextInt();
                    p = new Cliente(nome, codigo, telefone);
                    lst.add(p);
                } else if (op.equals("2")) {
                    lst.print();
                }

            } while (!op.equals("0"));
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        } finally {
            sc.close();
        }
    }
}
