package ListaEncadeada.ListaEncadeada3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Veiculos v;
        ListaEncadeada lst = new ListaEncadeada();
        String placa, marca, modelo, op;
        double valor;

        try {
            do {
                System.out.println("1 - Cadastrar Veículos");
                System.out.println("2 - Listar Veículos");
                System.out.println("0 - Sair");
                op = sc.next();

                if (op.equals("1")) {
                    System.out.println("Informe a placa do veículo: ");
                    sc.nextLine();
                    placa = sc.nextLine();
                    System.out.println("Informe a marca do veículo: ");
                    marca = sc.nextLine();
                    System.out.println("Informe o modelo do veículo:");
                    modelo = sc.nextLine();
                    System.out.println("Informe o valor do veículo:");
                    valor = sc.nextDouble();
                    v = new Veiculos(placa, marca, modelo, valor);
                    lst.addFim(v);
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
