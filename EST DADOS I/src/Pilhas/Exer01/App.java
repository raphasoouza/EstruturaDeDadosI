package Pilhas.Exer01;

public class App {
    public static void main(String[] args) throws Exception {
        Pilha p = new Pilha();
        Pilha pRosimere = new Pilha(); 
        Pilha pAfonso = new Pilha();  
        Pilha pAna = new Pilha();     

        p.push(new Processo(1, "Rosimere", "Acme"));
        p.push(new Processo(2, "Afonso", "Samsung"));  
        p.push(new Processo(3, "Rosimere", "Lenovo"));
        p.push(new Processo(4, "Ana", "Lenovo"));
        p.push(new Processo(5, "Afonso", "Acme"));
        p.push(new Processo(6, "Rosimere", "Lenovo"));

        System.out.println("Lista de processos a serem executados: ");
        while (!p.isVazia()) {
            Processo proc = p.pop();  
            System.out.printf("Responsavel: %s\t\t Código: %d\tCliente: %s\n", proc.responsavel, proc.codigo, proc.cliente);
            
            if (proc.responsavel.equals("Rosimere")) {
                pRosimere.push(proc);
            } else if (proc.responsavel.equals("Afonso")) {
                pAfonso.push(proc);
            } else if (proc.responsavel.equals("Ana")) {
                pAna.push(proc);
            }
        }

        System.out.println("\nPilha de Rosimere:");
        imprimirPilha(pRosimere);

        System.out.println("\nPilha de Afonso:");
        imprimirPilha(pAfonso);

        System.out.println("\nPilha de Ana:");
        imprimirPilha(pAna);
    }

    public static void imprimirPilha(Pilha pilha) throws Exception {
        while (!pilha.isVazia()) {
            Processo proc = pilha.pop();
            System.out.printf("Código: %d\tCliente: %s\n", proc.codigo, proc.cliente);
        }
    }
}
