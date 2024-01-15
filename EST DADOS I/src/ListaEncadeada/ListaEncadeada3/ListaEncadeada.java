package ListaEncadeada.ListaEncadeada3;

public class ListaEncadeada {
    private No cabeca = new No();
    private No cauda = cabeca;
    private No elemento;

    public int tamanho = 0;
    
    public void addInicio(Veiculos p){
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
    public void addFim(Veiculos p){
        if (tamanho==0)
            addInicio(p);
        else{
            elemento = new No(p,null,null);
            cauda.proximo = elemento;
            cauda = elemento;
            tamanho++;
        }
    }   
    public void print(){
        No el = cabeca.proximo;
        while (el!=null){
            System.out.println("Placa: " + el.elemento.placa);
            System.out.println("Marca: " + el.elemento.marca);
            System.out.println("Modelo: " + el.elemento.modelo);
            System.out.println("Valor: " + el.elemento.valor);
            
            el = el.proximo;
        }
    }
    public int tamanho(){
        return tamanho;
    }
}

