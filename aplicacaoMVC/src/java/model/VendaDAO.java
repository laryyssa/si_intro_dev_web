package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import entidade.Venda;

public class VendaDAO implements Dao<Venda> {

    @Override
    public Venda get(int id) {
        Conexao conexao = new Conexao();
        Venda venda = new Venda();
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement("SELECT * FROM vendas WHERE id = ?");
            sql.setInt(1, id);
            ResultSet resultado = sql.executeQuery();

            if (resultado != null) {
                while (resultado.next()) {
                    venda.setId(resultado.getInt("id"));
                    venda.setQuantidadeVenda(resultado.getInt("quantidade_venda"));
                    venda.setDataVenda(resultado.getString("data_venda"));
                    venda.setValorVenda(resultado.getDouble("valor_venda"));
                    venda.setIdCliente(resultado.getInt("id_cliente"));
                    venda.setIdProduto(resultado.getInt("id_produto"));
                    venda.setIdFuncionario(resultado.getInt("id_funcionario"));
                }
            }
        } catch (SQLException e) {
            System.err.println("Erro ao executar query de select (get venda): " + e.getMessage());
        } finally {
            conexao.closeConexao();
        }
        return venda;
    }

    @Override
    public void insert(Venda venda) {
        Conexao conexao = new Conexao();
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement("INSERT INTO vendas (quantidade_venda, data_venda, valor_venda, id_cliente, id_produto, id_vendedor) VALUES (?, ?, ?, ?, ?, ?)");

            sql.setInt(1, venda.getQuantidadeVenda());
            sql.setString(2, venda.getDataVenda());
            sql.setDouble(3, venda.getValorVenda());
            sql.setInt(4, venda.getIdCliente());
            sql.setInt(5, venda.getIdProduto());
            sql.setInt(6, venda.getIdFuncionario());

            sql.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Erro ao executar query de insert (venda): " + e.getMessage());
        } finally {
            conexao.closeConexao();
        }
    }

    @Override
    public void update(Venda venda) {
        Conexao conexao = new Conexao();
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement("UPDATE vendas SET quantidade_venda = ?, data_venda = ?, valor_venda = ?, id_cliente = ?, id_produto = ?, id_vendedor = ? WHERE id = ?");

            sql.setInt(1, venda.getQuantidadeVenda());
            sql.setString(2, venda.getDataVenda());
            sql.setDouble(3, venda.getValorVenda());
            sql.setInt(4, venda.getIdCliente());
            sql.setInt(5, venda.getIdProduto());
            sql.setInt(6, venda.getIdFuncionario());
            sql.setInt(7, venda.getId());

            sql.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Erro ao executar query de update (alterar venda): " + e.getMessage());
        } finally {
            conexao.closeConexao();
        }
    }

    @Override
    public void delete(int id) {
        Conexao conexao = new Conexao();
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement("DELETE FROM vendas WHERE id = ?");
            sql.setInt(1, id);
            sql.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Erro ao executar query de delete (excluir venda): " + e.getMessage());
        } finally {
            conexao.closeConexao();
        }
    }

    @Override
    public ArrayList<Venda> getAll() {
        ArrayList<Venda> minhasVendas = new ArrayList<>();
        Conexao conexao = new Conexao();
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement("SELECT * FROM vendas");
            ResultSet resultado = sql.executeQuery();

            while (resultado.next()) {
                int id = resultado.getInt("id");
                int quantidadeVenda = resultado.getInt("quantidade_venda");
                String dataVenda = resultado.getString("data_venda");
                double valorVenda = resultado.getDouble("valor_venda");
                int idCliente = resultado.getInt("id_cliente");
                int idProduto = resultado.getInt("id_produto");
                int idFuncionario = resultado.getInt("id_funcionario");

                Venda venda = new Venda(id, quantidadeVenda, dataVenda, valorVenda, idCliente, idProduto, idFuncionario);
                minhasVendas.add(venda);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao executar query de select (getAll - vendas): " + e.getMessage());
        } finally {
            conexao.closeConexao();
        }
        return minhasVendas;
    }
}
