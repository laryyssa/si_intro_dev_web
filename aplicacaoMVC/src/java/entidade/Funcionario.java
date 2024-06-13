package entidade;

public class Funcionario {

    private int id;
    private String nome;
    private String cpf;
    private String senha;
    private int papel;

    public Funcionario(String nome, String cpf, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }

    public Funcionario(String cpf, String senha) {
        this.cpf = cpf;
        this.senha = senha;
    }

    public Funcionario() {
        this.id = 0;
        this.nome = "";
        this.cpf = "";
        this.senha = "";
        this.papel = 0;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
        
    }
    
    public int getPapel() {
        return papel;
    }

    public void setPapel(int papel) {
        this.papel = papel;
        
    }

}
