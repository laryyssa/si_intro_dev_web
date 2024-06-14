<%@page import="java.util.ArrayList"%>
<%@page import="entidade.Funcionario"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Funcionários</title>
        <link href="http://localhost:8080/aplicacaoMVC/views/bootstrap/bootstrap.min.css"  rel="stylesheet">
    </head>

    <body>
        <div class="container">
            <jsp:include page="../../comum/menu.jsp" />
            <div class="row mt-5">
                <%
                    Funcionario funcionario = (Funcionario) request.getAttribute("funcionario");
                    String acao = (String) request.getAttribute("acao");
                    switch (acao) {
                        case "Incluir":
                            out.println("<h1>Incluir Funcionário</h1>");
                            break;
                        case "Alterar":
                            out.println("<h1>Alterar Funcionário</h1>");
                            break;
                        case "Excluir":
                            out.println("<h1>Excluir Funcionário</h1>");
                            break;
                    }

                    String msgError = (String) request.getAttribute("msgError");
                    if ((msgError != null) && (!msgError.isEmpty())) {%>
                <div class="alert alert-danger" role="alert">
                    <%= msgError%>
                </div>
                <% }%>

                <div class="col-sm-6 mt-5">
                    <form action="/aplicacaoMVC/admin/AdministradorController?acao=Incluir" method="post">
                        <input type="hidden" name="id" value="<%=funcionario.getId()%>" class="form-control">
                        <div class="mb-3">
                            <label for="nome">
                                <div class="mb-3">
                                    <label for="nome" class="form-label">Nome</label>
                                    <input 
                                        required
                                        maxlength="50"
                                        minlength="3"
                                        type="text" 
                                        class="form-control" 
                                        name="nome" 
                                        id="nome" 
                                        aria-describedby="helpId"
                                        <%= acao.equals("Excluir") ? "Readonly" : ""%>
                                        value="<%=funcionario.getNome()%>"/>
                                    <small id="helpId" class="form-text text-muted">Digite seu Nome</small>
                                </div>
                            </label>
                        </div>

                        <div class="mb-3">
                            <label for="cpf">
                                <div class="mb-3">
                                    <label for="cpf" class="form-label">CPF</label>
                                    <input 
                                        required
                                        maxlength="14"
                                        minlength="14"
                                        type="text" 
                                        class="form-control" 
                                        name="cpf" 
                                        id="cpf" 
                                        aria-describedby="helpId"
                                        placeholder="999.999.999" 
                                        <%= acao.equals("Excluir") ? "Readonly" : ""%>
                                        value="<%=funcionario.getCpf()%>"/>
                                    <small id="helpId" class="form-text text-muted">Digite seu CPF</small>
                                </div>
                            </label>
                        </div>         

                        <div class="mb-3">
                            <label for="papel" class="form-label">Papel Funcionário</label>
                            <select name="papel" id="papel" class="form-control" <%= acao.equals("Excluir") ? "disabled" : ""%>>
                                <option value="Administrador" <%=funcionario.getPapel() == 0 ? "selected" : ""%>>Administrador</option>
                                <option value="Vendedor" <%=funcionario.getPapel() == 1 ? "selected" : ""%>>Vendedor</option>
                                <option value="Comprador" <%=funcionario.getPapel() == 2 ? "selected" : ""%>>Comprador</option>
                            </select>
                        </div>


                        </label>
                </div>

                <div class="mb-3">
                    <label for="senha" class="form-label" <%= acao.equals("Excluir") ? "Readonly" : ""%> value="<%=funcionario.getSenha()%>">Senha</label>
                    <input type="password" name="senha" value="111" class="form-control">
                </div>

                <button
                    type="submit"
                    class="btn btn-primary"
                    >
                    Enviar
                </button>

                </form>
            </div>
        </div>
    </div>

    <script></script>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>
