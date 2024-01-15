package ListaArranjos;

public class Filmes {
    public int codigo;
    public String nome;
    public String genero;
    public Filmes(int codigo, String nome, String genero) {
        this.codigo = codigo;
        this.nome = nome;
        this.genero = genero;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }
}
