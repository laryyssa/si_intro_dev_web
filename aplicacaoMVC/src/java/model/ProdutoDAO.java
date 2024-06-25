package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import entidade.Produto;

public class ProdutoDAO implements Dao<Produto> {

    @Override
    public Produto get(int id) {
        Conexao conexao = new Conexao();
        Produto produto = new Produto();
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement("SELECT * FROM produtos WHERE ID = ? ");
            sql.setInt(1, id);
            ResultSet resultado = sql.executeQuery();

            if (resultado != null) {
                while (resultado.next()) {
                    produto.setId(resultado.getInt("ID"));
                    produto.setNome_produto(resultado.getString("NOME_PRODUTO"));
                    produto.setDescricao(resultado.getString("DESCRICAO"));
                    produto.setPreco_compra(resultado.getDouble("PRECO_COMPRA"));
                    produto.setPreco_venda(resultado.getDouble("PRECO_VENDA"));
                    produto.setQuantidade_disponivel(resultado.getInt("QUANTIDADE_DISPONÍVEL"));
                    produto.setLiberado_venda(resultado.getString("LIBERADO_VENDA"));
                    produto.setId_categoria(resultado.getInt("ID_CATEGORIA"));
                }
            }
        } catch (SQLException e) {
            System.err.println("Query de select (get produto) incorreta");
        } finally {
            conexao.closeConexao();
        }
        return produto;
    }

    @Override
    public void insert(Produto p) {
        Conexao conexao = new Conexao();
        try {
            // Prepare SQL query with all the fields of Produto
            String query = "INSERT INTO produtos (nome_produto, descricao, preco_compra, preco_venda, quantidade_disponível, liberado_venda, id_categoria) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement sql = conexao.getConexao().prepareStatement(query);

            // Set the parameters for the query
            sql.setString(1, p.getNome_produto());
            sql.setString(2, p.getDescricao());
            sql.setDouble(3, p.getPreco_compra());
            sql.setDouble(4, p.getPreco_venda());
            sql.setInt(5, p.getQuantidade_disponivel());
            sql.setString(6, p.getLiberado_venda());
            sql.setInt(7, p.getId_categoria());

            // Execute the update
            sql.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Query de insert (produto) incorreta: " + e.getMessage());
        } finally {
            conexao.closeConexao();
        }
    }

    @Override
    public void update(Produto t) {
        Conexao conexao = new Conexao();
        try {
            // Prepare SQL query with all the fields of Produto
            String query = "UPDATE produtos SET nome_produto = ?, descricao = ?, preco_compra = ?, preco_venda = ?, quantidade_disponível = ?, liberado_venda = ?, id_categoria = ? WHERE ID = ?";
            PreparedStatement sql = conexao.getConexao().prepareStatement(query);

            // Set the parameters for the query
            sql.setString(1, t.getNome_produto());
            sql.setString(2, t.getDescricao());
            sql.setDouble(3, t.getPreco_compra());
            sql.setDouble(4, t.getPreco_venda());
            sql.setInt(5, t.getQuantidade_disponivel());
            sql.setString(6, t.getLiberado_venda());
            sql.setInt(7, t.getId_categoria());
            sql.setInt(8, t.getId());

            // Execute the update
            sql.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Query de update (alterar produto) incorreta: " + e.getMessage());
        } finally {
            conexao.closeConexao();
        }
    }

    @Override
    public void delete(int id) {
        Conexao conexao = new Conexao();
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement("DELETE FROM produtos WHERE ID = ? ");
            sql.setInt(1, id);
            sql.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Query de delete (excluir produto) incorreta");
        } finally {
            conexao.closeConexao();
        }
    }

    @Override
    public ArrayList<Produto> getAll() {

        ArrayList<Produto> meusProdutos = new ArrayList();
        Conexao conexao = new Conexao();
        try {
            String selectSQL = "SELECT * FROM produtos";
            PreparedStatement preparedStatement;
            preparedStatement = conexao.getConexao().prepareStatement(selectSQL);
            ResultSet resultado = preparedStatement.executeQuery();
            if (resultado != null) {
                while (resultado.next()) {
                    Produto produto = new Produto(
                            resultado.getInt("id"),
                            resultado.getString("nome_produto"),
                            resultado.getString("descricao"),
                            resultado.getDouble("preco_compra"),
                            resultado.getDouble("preco_venda"),
                            resultado.getInt("quantidade_disponível"),
                            resultado.getString("liberado_venda"),
                            resultado.getInt("id_categoria")
                    );
                    meusProdutos.add(produto);
                }
            }
        } catch (SQLException e) {
            System.err.println("Query de select (GetAll - produtos) incorreta");
        } finally {
            conexao.closeConexao();
        }
        return meusProdutos;
    }

//    @Override
    public ArrayList<Produto> getProdutosDisponiveis() {

        ArrayList<Produto> meusProdutos = new ArrayList();
        Conexao conexao = new Conexao();
        try {
            String selectSQL = "SELECT * FROM produtos WHERE quantidade_disponível > 0 AND liberado_venda = 'S'";
            PreparedStatement preparedStatement;
            preparedStatement = conexao.getConexao().prepareStatement(selectSQL);
            ResultSet resultado = preparedStatement.executeQuery();
            if (resultado != null) {
                while (resultado.next()) {
                    Produto produto = new Produto(
                            resultado.getInt("id"),
                            resultado.getString("nome_produto"),
                            resultado.getString("descricao"),
                            resultado.getDouble("preco_compra"),
                            resultado.getDouble("preco_venda"),
                            resultado.getInt("quantidade_disponível"),
                            resultado.getString("liberado_venda"),
                            resultado.getInt("id_categoria")
                    );
                    meusProdutos.add(produto);
                }
            }
        } catch (SQLException e) {
            System.err.println("Query de select (GetAll - produtos) incorreta");
        } finally {
            conexao.closeConexao();
        }
        return meusProdutos;
    }
}
