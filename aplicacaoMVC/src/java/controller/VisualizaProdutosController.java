package controller;

import entidade.Produto;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ProdutoDAO;

/**
 *
 * @author Leonardo
 */
@WebServlet(name = "VisualizaProdutosController", urlPatterns = {"/VisualizaProdutosController"})
public class VisualizaProdutosController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ProdutoDAO produtoDAO = new ProdutoDAO();
        RequestDispatcher rd;
            
        ArrayList<Produto> listaProdutos = produtoDAO.getProdutosDisponiveis();
        request.setAttribute("listaProdutos", listaProdutos);
        rd = request.getRequestDispatcher("/views/lista_produtos_cliente.jsp");
        rd.forward(request, response);

    }

}