package controller.admin;

import entidade.Funcionario;
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
import model.FuncionarioDAO;

@WebServlet(name = "AdministradorController", urlPatterns = {"/admin/AdministradorController"})
public class AdministradorController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // get parametro ação indicando o que fazer
        String acao = (String) request.getParameter("acao");
        Funcionario funcionario = new Funcionario();
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        RequestDispatcher rd;

        switch (acao) {
            case "Listar":

                ArrayList<Funcionario> listaFuncionarios = funcionarioDAO.ListaDeFuncionarios();
                request.setAttribute("listaFuncionarios", listaFuncionarios);

                rd = request.getRequestDispatcher("/views/admin/administrador/listaFuncionarios.jsp");
                rd.forward(request, response);

                break;

            case "Alterar":
            case "Excluir":

                // get parametro ação indicando sobre qual categoria será a ação
                int id = Integer.parseInt(request.getParameter("id"));
                 {
                    try {
                        funcionario = funcionarioDAO.getFuncionario(id);
                    } catch (Exception ex) {
                        Logger.getLogger(AdministradorController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                request.setAttribute("funcionario", funcionario);
                request.setAttribute("msgError", "");
                request.setAttribute("acao", acao);

                rd = request.getRequestDispatcher("/views/admin/administrador/formFuncionarios.jsp");
                rd.forward(request, response);
                break;

            case "Incluir":
                request.setAttribute("funcionario", funcionario);
                request.setAttribute("msgError", "");
                request.setAttribute("acao", acao);

                rd = request.getRequestDispatcher("/views/admin/administrador/formFuncionarios.jsp");
                rd.forward(request, response);

        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String nome = request.getParameter("nome");
        String senha = request.getParameter("senha");
        String papel = request.getParameter("papel");
        String cpf = request.getParameter("cpf");

        String btEnviar = request.getParameter("btEnviar");

        RequestDispatcher rd;

        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        Funcionario funcionario = new Funcionario();

        if (nome.isEmpty() || senha.isEmpty() || papel.isEmpty()) {
            if (!btEnviar.equals("Incluir")) {
                try {
                    funcionario = funcionarioDAO.getFuncionario(id);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                    throw new RuntimeException("Falha em uma query para cadastro de usuario", ex);
                }
            }
            request.setAttribute("funcionario", funcionario);
            request.setAttribute("acao", btEnviar);
            request.setAttribute("msgError", "É necessário preencher todos os campos");
            rd = request.getRequestDispatcher("/views/admin/administrador/formFuncionarios.jsp");
            rd.forward(request, response);
            return; // Adicionado para evitar execução do restante do código
        }

        funcionario = new Funcionario(nome, cpf, senha);

        switch (papel) {
            case "Administrador":
                funcionario.setPapel(0);
                break;
            case "Vendedor":
                funcionario.setPapel(1);
                break;
            case "Comprador":
                funcionario.setPapel(2);
                break;
            default:
                throw new ServletException("Papel inválido: " + papel);
        }

        try {
            switch (btEnviar) {
                case "Incluir":
                    funcionarioDAO.Inserir(funcionario);
                    request.setAttribute("msgOperacaoRealizada", "Inclusão realizada com sucesso");
                    break;
                case "Alterar":
                    funcionarioDAO.Alterar(funcionario);
                    request.setAttribute("msgOperacaoRealizada", "Alteração realizada com sucesso");
                    break;
                case "Excluir":
                    funcionarioDAO.Excluir(funcionario);
                    request.setAttribute("msgOperacaoRealizada", "Exclusão realizada com sucesso");
                    break;
                default:
                    throw new ServletException("Operação inválida: " + btEnviar);
            }

            request.setAttribute("link", "/admin/AdministradorController?acao=Listar");
            rd = request.getRequestDispatcher("/views/comum/showMessage.jsp");
            rd.forward(request, response);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw new RuntimeException("Falha em uma query para cadastro de usuario", ex);
        }
    }
}
