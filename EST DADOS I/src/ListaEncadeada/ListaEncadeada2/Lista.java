package ListaEncadeada.ListaEncadeada2;

public class Lista {
    private No cabeca = new No();
    private No cauda = cabeca;
    private No elemento;
    public int tamanho = 0;

    public void add(Cliente p) {
        No novoNo = new No(p, null);

        if (cabeca.proximo == null || p.codigo < cabeca.proximo.cliente.codigo) {
            novoNo.proximo = cabeca.proximo;
            cabeca.proximo = novoNo;
        } else {
            No el = cabeca.proximo;

            while (el.proximo != null && el.proximo.cliente.codigo < p.codigo) {
                el = el.proximo;
            }

            novoNo.proximo = el.proximo;
            el.proximo = novoNo;
        }

        tamanho++;
    }

    public void print() {
        No el = cabeca.proximo;
        while (el != null) {
            System.out.println("Nome: " + el.cliente.nome);
            System.out.println("Codigo: " + el.cliente.codigo);
            System.out.println("Telefone: " + el.cliente.telefone);
            el = el.proximo;
        }
    }
}
