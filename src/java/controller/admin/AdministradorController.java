
package controller.admin;

import entidade.Funcionario;
import java.io.IOException;
import java.util.ArrayList;
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
                
                ArrayList <Funcionario> listaFuncionarios = funcionarioDAO.ListaDeFuncionarios();
                request.setAttribute("listaFuncionarios", listaFuncionarios);

                rd = request.getRequestDispatcher("/views/admin/administrador/listaFuncionarios.jsp");
                rd.forward(request, response);

                break;
            
            /*   
            case "Alterar":
            case "Excluir":
                
                // get parametro ação indicando sobre qual categoria será a ação
                //int id = Integer.parseInt(request.getParameter("id"));
                //funcionario = funcionarioDAO.getFuncionario(id);

                request.setAttribute("funcionario", funcionario);
                request.setAttribute("msgError", "");
                request.setAttribute("acao", acao);

                rd = request.getRequestDispatcher("/views/admin/administrador/funcionarios.jsp");
                rd.forward(request, response);
                break;
            */ 
            case "Incluir":
                request.setAttribute("funcionario", funcionario);
                request.setAttribute("msgError", "");
                request.setAttribute("acao", acao);

                rd = request.getRequestDispatcher("/views/admin/administrador/formFuncionarios.jsp");
                rd.forward(request, response);
            
        }

    }
/*
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String descricao = request.getParameter("descricao");
        String btEnviar = request.getParameter("btEnviar");

        RequestDispatcher rd;

        if (descricao.isEmpty()) {
            Categoria categoria = new Categoria();
            switch (btEnviar) {
                case "Alterar":
                case "Excluir":
                    try {
                    CategoriaDAO categoriaDAO = new CategoriaDAO();
                    categoria = categoriaDAO.get(id);

                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                    throw new RuntimeException("Falha em uma query para cadastro de usuario");
                }
                break;
            }

            request.setAttribute("categoria", categoria);
            request.setAttribute("acao", btEnviar);

            request.setAttribute("msgError", "É necessário preencher todos os campos");

            rd = request.getRequestDispatcher("/views/admin/categoria/formCategoria.jsp");
            rd.forward(request, response);

        } else {
            
             Categoria categoria = new Categoria(id,descricao);
             CategoriaDAO categoriaDAO = new CategoriaDAO();

            try {
                switch (btEnviar) {
                    case "Incluir":
                        categoriaDAO.insert(categoria);
                        request.setAttribute("msgOperacaoRealizada", "Inclusão realizada com sucesso");
                        break;
                    case "Alterar":
                        categoriaDAO.update(categoria);
                        request.setAttribute("msgOperacaoRealizada", "Alteração realizada com sucesso");
                        break;
                    case "Excluir":
                        categoriaDAO.delete(id);
                        request.setAttribute("msgOperacaoRealizada", "Exclusão realizada com sucesso");
                        break;
                }

                request.setAttribute("link", "/aplicacaoMVC/admin/CategoriaController?acao=Listar");
                rd = request.getRequestDispatcher("/views/comum/showMessage.jsp");
                rd.forward(request, response);

            } catch (IOException | ServletException ex) {
                System.out.println(ex.getMessage());
                throw new RuntimeException("Falha em uma query para cadastro de usuario");
            }
        }
    }
*/
}
