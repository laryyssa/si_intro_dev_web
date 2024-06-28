<%@page import="entidade.RelatorioVendasProduto"%>
<%@page import="entidade.RelatorioVendasDia"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="shortcut icon" href="#">
        <title>Relatório</title>
        <link href="http://localhost:8080/aplicacaoMVC/views/bootstrap/bootstrap.min.css"  rel="stylesheet">

    </head>
    <body>
        <div class="container">
            <jsp:include page="../../comum/menu.jsp" />
            <div class="mt-5">

                <h2>Relatório Vendas por Dia</h2>

                <div class="table-responsive">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th scope="col">Dia da Venda</th>
                                <th scope="col">Quantidade Vendas</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                ArrayList<RelatorioVendasDia> lista_produtos_dia = (ArrayList<RelatorioVendasDia>) request.getAttribute("listaProdutosDia");

                                for (RelatorioVendasDia produto : lista_produtos_dia) {
                                    out.println("<tr>");
                                    out.println("<td>" + produto.getData_venda() + "</td>");
                                    out.println("<td>" + produto.getCount_produto() + "</td>");
                            %>
                        <td>

                            <%    out.println("</tr>");
                                }
                            %>

                            </tbody>
                    </table>
                </div>

                <h2>Relatório Vendas por Produto</h2>

                <div class="table-responsive">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th scope="col">Id Produto</th>
                                <th scope="col">Nome Produto</th>
                                <th scope="col">Quantidade Vendas</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                ArrayList<RelatorioVendasProduto> lista_produtos = (ArrayList<RelatorioVendasProduto>) request.getAttribute("listaProdutos");

                                for (RelatorioVendasProduto produto : lista_produtos) {
                                    out.println("<tr>");
                                    out.println("<td>" + produto.getId() + "</td>");
                                    out.println("<td>" + produto.getNome_produto() + "</td>");
                                    out.println("<td>" + produto.getContProduto() + "</td>");

                            %>
                        <td>

                            <%    out.println("</tr>");
                                }
                            %>

                            </tbody>
                    </table>
                </div>
            </div>
        </div>



        <script src="http://localhost:8080/aplicacaoMVC/views/bootstrap/bootstrap.bundle.min.js"></script>

    </body>
</html>

