package ListaArranjos;

public class ListaFilmes {
    public int tamanho = 2;
    private Filmes filmes[] = new Filmes[tamanho];
    public int fim = -1;

    public ListaFilmes() {
    }

    public void add(Filmes filme) throws Exception {
        if (fim == tamanho - 1)
            throw new Exception("Nao ha posicoes livres");

        int i;
        for (i = fim; i >= 0 && filme.codigo < filmes[i].codigo; i--) {
            filmes[i + 1] = filmes[i];
        }
        filmes[i + 1] = filme;
        fim++;
    }

    public void listar() {
        System.out.println("Lista de Filmes:");
        for (int i = 0; i <= fim; i++) {
            System.out.println("Código: " + filmes[i].getCodigo());
            System.out.println("Nome: " + filmes[i].getNome());
            System.out.println("Gênero: " + filmes[i].getGenero());
        }
    }

    public void procura(String nome) {

        for (int i = 0; i <= fim; i++) {
            if (filmes[i].getNome().equals(nome)) {
                System.out.println("Código: " + filmes[i].getCodigo());
                System.out.println("Nome: " + filmes[i].getNome());
                System.out.println("Gênero: " + filmes[i].getGenero());
            }
        }
    }

    public void aumentar(int tam) {
        Filmes aux[] = new Filmes[tam];
        for (int i = 0; i <= fim; i++) {
            aux[i] = filmes[i];
        }
        tamanho = tam;
        filmes = new Filmes[tam];
        for (int i = 0; i <= fim; i++) {
            filmes[i] = aux[i];
        }

    }

    public void remove(int codigo) throws Exception {
        if (fim == -1)
            throw new Exception(" O vetor esta vazio. ");
        int i;
        for (i = 0; i <= fim; i++) {
            if (filmes[i].getCodigo() == codigo) {
                break;
            }
        }
        if (i == fim + 1)
            System.out.println("Esta posicao nao esta em uso.");
        else {
            for (int j = i; j < fim; j++) {
                filmes[j] = filmes[j + 1];
                System.out.println("Posição excluída com sucesso.");
            }
            fim--;
        }

    }

    public int tamanho() {
        return fim;
    }
}
