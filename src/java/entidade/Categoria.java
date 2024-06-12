package entidade;

public class Categoria {

    private int id;
    private String nome_categoria;

    public Categoria() {
        this.id = 0;
        this.nome_categoria = "";
    }

    public Categoria(int id, String nome_categoria) {
        this.id = id;
        this.nome_categoria = nome_categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCategoria() {
        return nome_categoria;
    }

    public void setNomeCategoria(String nome_categoria) {
        this.nome_categoria = nome_categoria;
    }

    
    
}
