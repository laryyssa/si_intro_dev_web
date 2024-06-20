package controller.admin;

import entidade.Produto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ProdutoDAO;

@WebServlet(name = "ProdutoController", urlPatterns = {"/admin/ProdutoController"})
public class ProdutoController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // get parametro ação indicando o que fazer
        String acao = (String) request.getParameter("acao");
        Produto produto = new Produto();
        ProdutoDAO produtoDAO = new ProdutoDAO();
        RequestDispatcher rd;

        switch (acao) {
            case "Listar":
                ArrayList<Produto> listaProdutos = produtoDAO.getAll();
                request.setAttribute("listaProdutos", listaProdutos);
                rd = request.getRequestDispatcher("/views/admin/produto/lista_produto.jsp");
                rd.forward(request, response);
                break;

            case "Alterar":
            case "Excluir":
                // get parametro ação indicando sobre qual categoria será a ação
                int id = Integer.parseInt(request.getParameter("id"));
                 {
                    try {
                        produto = produtoDAO.get(id);
                    } catch (Exception ex) {
                        Logger.getLogger(AdministradorController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                request.setAttribute("produto", produto);
                request.setAttribute("msgError", "");
                request.setAttribute("acao", acao);

                rd = request.getRequestDispatcher("/views/admin/produto/tabela_produtos.jsp");
                rd.forward(request, response);
                break;

            case "Incluir":
                request.setAttribute("produto", produto);
                request.setAttribute("msgError", "");
                request.setAttribute("acao", acao);

                rd = request.getRequestDispatcher("/views/admin/produto/tabela_produtos.jsp");
                rd.forward(request, response);

        }

    }

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//        int id = Integer.parseInt(request.getParameter("id"));
//        String nome = request.getParameter("nome");
//        String senha = request.getParameter("senha");
//        String papel = request.getParameter("papel");
//        String cpf = request.getParameter("cpf");
//        String btEnviar = request.getParameter("btEnviar");
//
//        RequestDispatcher rd;
//
//        Funcionario funcionario = new Funcionario();
//
//        if (nome.isEmpty() || senha.isEmpty() ||  cpf.isEmpty()) {
//
//            switch (btEnviar) {
//                case "Alterar":
//                case "Excluir":
//                    try {
//                        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
//                        funcionario = funcionarioDAO.getFuncionario(id);
//
//                    } catch (Exception ex) {
//                        System.out.println(ex.getMessage());
//                        throw new RuntimeException("Falha em uma query para cadastro de funcionario.", ex);
//                    }
//                    break;
//            }
//
//            request.setAttribute("funcionario", funcionario);
//            request.setAttribute("acao", btEnviar);
//
//            request.setAttribute("msgError", "É necessário preencher todos os campos");
//
//            rd = request.getRequestDispatcher("/views/admin/administrador/formFuncionarios.jsp");
//            rd.forward(request, response);
//
//        } else {
//
//            funcionario.setId(id);
//            funcionario.setNome(nome);
//            funcionario.setSenha(senha);
//            funcionario.setCpf(cpf);
//           
//            switch (papel) {
//                case "Administrador":
//                    funcionario.setPapel("0");
//                    break;
//                case "Vendedor":
//                    funcionario.setPapel("1");
//                    break;
//                case "Comprador":
//                    funcionario.setPapel("2");
//                    break;
//                default:
//                    throw new ServletException("Papel inválido: " + papel);
//            }
//
//            FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
//
//            try {
//                switch (btEnviar) {
//                    case "Incluir":
//                        funcionarioDAO.Inserir(funcionario);
//                        request.setAttribute("msgOperacaoRealizada", "Inclusão realizada com sucesso");
//                        break;
//                    case "Alterar":
//                        funcionarioDAO.Alterar(funcionario);
//                        request.setAttribute("msgOperacaoRealizada", "Alteração realizada com sucesso");
//                        break;
//                    case "Excluir":
//                        funcionarioDAO.Excluir(funcionario);
//                        request.setAttribute("msgOperacaoRealizada", "Exclusão realizada com sucesso");
//                        break;
//                }
//
//                request.setAttribute("link", "/aplicacaoMVC/admin/AdministradorController?acao=Listar");
//                rd = request.getRequestDispatcher("/views/comum/showMessage.jsp");
//                rd.forward(request, response);
//
//            } catch (Exception ex) {  
//                System.out.println(ex.getMessage());
//                throw new RuntimeException("Falha em uma query para cadastro de funcionario!", ex);
//            }
//        }
//    }
}
