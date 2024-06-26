package entidade;
import java.util.Date;


public class Venda {
    private int id;
    private int quantidadeVenda;
    private Date dataVenda;
    private double valorVenda;
    private int idCliente;
    private int idProduto;
    private int idFuncionario;

    // Construtor
    public Venda(int id, int quantidadeVenda, Date dataVenda, double valorVenda, int idCliente, int idProduto, int idFuncionario) {
        this.id = id;
        this.quantidadeVenda = quantidadeVenda;
        this.dataVenda = dataVenda;
        this.valorVenda = valorVenda;
        this.idCliente = idCliente;
        this.idProduto = idProduto;
        this.idFuncionario = idFuncionario;
    }
    
    public Venda() {
        this.id = 0;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidadeVenda() {
        return quantidadeVenda;
    }

    public void setQuantidadeVenda(int quantidadeVenda) {
        this.quantidadeVenda = quantidadeVenda;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
}
