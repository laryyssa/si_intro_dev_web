<%@page import="entidade.Venda"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="shortcut icon" href="#">
        <title>Lista Categorias</title>
        <link href="http://localhost:8080/aplicacaoMVC/views/bootstrap/bootstrap.min.css"  rel="stylesheet">

    </head>
    <body>
        <div class="container">
            <jsp:include page="../../comum/menu.jsp" />
            <div class="mt-5">

                <h1>Área Restrita</h1>
                <h2>Lista de Vendas</h2>

                <a href="/aplicacaoMVC/admin/VendaController?acao=Incluir" class="mb-2 btn btn-primary">Incluir</a>
                <div class="table-responsive">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th scope="col">Id</th>
                                <th scope="col">Quantidade Venda</th>
                                <th scope="col">Data Venda</th>
                                <th scope="col">Valor Venda</th>
                                <th scope="col">Id Cliente</th>
                                <th scope="col">Id Produto</th>
                                <th scope="col">Id Funcionario</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                ArrayList<Venda> listaVendas = (ArrayList<Venda>) request.getAttribute("listaVendas");

                                for (Venda venda : listaVendas) {
                            %>
                            <tr>
                                <td><%= venda.getId()%></td>
                                <td><%= venda.getQuantidadeVenda()%></td>
                                <td><%= venda.getDataVenda()%></td>
                                <td><%= venda.getValorVenda()%></td>
                                <td><%= venda.getIdCliente()%></td>
                                <td><%= venda.getIdProduto()%></td>
                                <td><%= venda.getIdFuncionario()%></td>
                            </tr>
                        <td>
                            <a href="/aplicacaoMVC/admin/VendaController?acao=Alterar&id=<%=venda.getId()%>" class="btn btn-warning">Alterar</a>
                            <a href="/aplicacaoMVC/admin/VendaController?acao=Excluir&id=<%=venda.getId()%>" class="btn btn-danger">Excluir</a></td>

                        <%   out.println("</tr>");
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

