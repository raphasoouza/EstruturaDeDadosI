package ListaEncadeada;
public class ListaEncadeada {
    private No cabeca = new No();
    private No cauda = cabeca;
    private No elemento;

    public int tamanho = 0;
    
    public void addInicio(Pessoa p){
        elemento = new No(p, null,null);
        if (tamanho == 0){
            cabeca.proximo = elemento;
            cauda = elemento;
            elemento.anterior = cabeca;
        } else {
            elemento.proximo = cabeca.proximo;
            elemento.anterior = cabeca;
            cabeca.proximo.anterior = elemento;
            cabeca.proximo = elemento;
        }
        tamanho++;
    }
    public void addFim(Pessoa p){
        if (tamanho==0)
            addInicio(p);
        else{
            elemento = new No(p,null,null);
            cauda.proximo = elemento;
            cauda = elemento;
            tamanho++;
        }
        
    }

    public void add(int posicao, Pessoa p) {
        if (posicao >= tamanho)
            addFim(p);
        else if (posicao == 0)
            addInicio(p);
        else {
            No novoNo = new No(p, null, null);
            No el = cabeca.proximo;
    
            for (int i = 1; i < posicao; ++i) {
                el = el.proximo;
            }
    
            novoNo.proximo = el.proximo;
            novoNo.anterior = el;
            el.proximo.anterior = novoNo;
            el.proximo = novoNo;
    
            tamanho++;
        }
    }
    
    public void removeInicio() throws Exception {
        if (tamanho == 0)
            throw new Exception("Lista vazia");
    
        cabeca.proximo = cabeca.proximo.proximo;
        if (cabeca.proximo != null) {
            cabeca.proximo.anterior = null;
        } else {
            cauda = null;
        }
    
        tamanho--;
    }
    
    public void removeFim() throws Exception {
        if (tamanho == 0)
            throw new Exception("Lista vazia");
    
        if (tamanho == 1) {
            removeInicio();
        } else {
            No el = cabeca.proximo;
    
            while (el.proximo != null) {
                el = el.proximo;
            }
    
            el.anterior.proximo = null;
            cauda = el.anterior;
    
            tamanho--;
        }
    }
    
    public void remove(int posicao) throws Exception {
        if (tamanho == 0)
            throw new Exception("Lista vazia.");
        if (posicao >= tamanho)
            throw new Exception("O elemento especificado não existe.");
        if (posicao == 0)
            removeInicio();
        else if (posicao == tamanho - 1)
            removeFim();
        else {
            No el = cabeca.proximo;
            for (int i = 1; i < posicao; ++i)
                el = el.proximo;
            el.proximo.proximo.anterior = el;
            el.proximo = el.proximo.proximo;
    
            tamanho--;
        }
    }

    public void print(){
        No el = cabeca.proximo;
        while (el!=null){
            System.out.println("Nome: " + el.elemento.nome);
            System.out.println("Idade: " + el.elemento.idade);

            el = el.proximo;
        }
    }
    public int tamanho(){
        return tamanho;
    }
}
