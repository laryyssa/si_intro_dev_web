package entidade;

// Definição da classe RelatorioVendasDia
public class RelatorioVendasDia {
    
    // Atributos da classe
    private String data_venda;
    private int count_produto;

    // Construtor da classe
    public RelatorioVendasDia(String data_venda, int count_produto) {
        this.data_venda = data_venda;
        this.count_produto = count_produto;
    }

    // Getters e Setters para os atributos, se necessário
    public String getData_venda() {
        return data_venda;
    }

    public void setData_venda(String data_venda) {
        this.data_venda = data_venda;
    }

    public int getCount_produto() {
        return count_produto;
    }

    public void setCount_produto(int count_produto) {
        this.count_produto = count_produto;
    }

}
