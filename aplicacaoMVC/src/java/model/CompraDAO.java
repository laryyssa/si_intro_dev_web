package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import entidade.Compra;

/*
--
-- Estrutura da tabela `compras`
--

CREATE TABLE IF NOT EXISTS `compras` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome_categoria` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


 */
public class CompraDAO implements Dao<Compra> {

    @Override
    public Compra get(int id) {
        Conexao conexao = new Conexao();
        Compra compra = new Compra();
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement("SELECT * FROM compras WHERE ID = ? ");
            sql.setInt(1, id);
            ResultSet resultado = sql.executeQuery();

            if (resultado != null) {
                while (resultado.next()) {
                    compra.setId(Integer.parseInt(resultado.getString("id")));
                    compra.setQuantidadeCompra(Integer.parseInt(resultado.getString("quantidade_compra")));
                    compra.setDataCompra(resultado.getString("data_compra"));
                    compra.setValorCompra(Double.parseDouble(resultado.getString("valor_compra")));
                    compra.setIdFornecedor(Integer.parseInt(resultado.getString("id_fornecedor")));
                    compra.setIdProduto(Integer.parseInt(resultado.getString("id_produto")));
                    compra.setIdComprador(Integer.parseInt(resultado.getString("id_comprador")));
                }
            }
        } catch (SQLException e) {
            System.err.println("Query de select (get compra) incorreta");
        } finally {
            conexao.closeConexao();
        }
        return compra;
    }

    @Override
    public void insert(Compra compra) {

        Conexao conexao = new Conexao();
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement("INSERT INTO compras (quantidade_compra, data_compra, valor_compra, id_fornecedor, id_produto, id_comprador) VALUES (?, ?, ?, ?, ?, ?)");

            sql.setInt(1, compra.getQuantidadeCompra());
            sql.setString(2, compra.getDataCompra());
            sql.setDouble(3, compra.getValorCompra());
            sql.setInt(4, compra.getIdFornecedor());
            sql.setInt(5, compra.getIdProduto());
            sql.setInt(6, compra.getIdComprador());

            sql.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Query de insert (compra) incorreta");
        } finally {
            conexao.closeConexao();
        }
    }

    @Override
    public void update(Compra compra) {
        Conexao conexao = new Conexao();
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement("UPDATE compras SET quantidade_compra = ?, data_compra = ?, valor_compra = ?, id_fornecedor = ?, id_produto = ?, id_comprador = ? WHERE ID = ?");

            sql.setInt(1, compra.getQuantidadeCompra());
            sql.setString(2, compra.getDataCompra());
            sql.setDouble(3, compra.getValorCompra());
            sql.setInt(4, compra.getIdFornecedor());
            sql.setInt(5, compra.getIdProduto());
            sql.setInt(6, compra.getIdComprador());
            sql.setInt(7, compra.getId());

        } catch (SQLException e) {
            System.err.println("Query de update (alterar compra) incorreta");
        } finally {
            conexao.closeConexao();
        }
    }

    @Override
    public void delete(int id) {
        Conexao conexao = new Conexao();
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement("DELETE FROM compras WHERE ID = ? ");
            sql.setInt(1, id);
            sql.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Query de delete (excluir compra) incorreta");
        } finally {
            conexao.closeConexao();
        }
    }

    @Override
    public ArrayList<Compra> getAll() {

        ArrayList<Compra> minhasCompras = new ArrayList();
        Conexao conexao = new Conexao();
        try {
            String selectSQL = "SELECT * FROM compras";
            PreparedStatement preparedStatement;
            preparedStatement = conexao.getConexao().prepareStatement(selectSQL);
            ResultSet resultado = preparedStatement.executeQuery();
            if (resultado != null) {
                while (resultado.next()) {
                    int id = resultado.getInt("id");
                    int quantidadeCompra = resultado.getInt("quantidade_compra");
                    String dataCompra = resultado.getString("data_compra");
                    double valorCompra = resultado.getDouble("valor_compra");
                    int idFornecedor = resultado.getInt("id_fornecedor");
                    int idProduto = resultado.getInt("id_produto");
                    int idComprador = resultado.getInt("id_comprador");

                    Compra compra = new Compra(id, quantidadeCompra, dataCompra, valorCompra, idFornecedor, idProduto, idComprador);
                    minhasCompras.add(compra);
                }
            }
        } catch (SQLException e) {
            System.err.println("Query de select (GetAll - compras) incorreta");
        } finally {
            conexao.closeConexao();
        }
        return minhasCompras;
    }
}
