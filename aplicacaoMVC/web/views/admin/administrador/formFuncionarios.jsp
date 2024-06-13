<%-- 
    Document   : clientes
    Created on : 28 de mai. de 2024, 18:46:36
    Author     : laryssa.paiva
--%>

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

                <div class="col-sm-6 mt-5">
                    <form action="/aplicacaoMVC/admin/AdministradorController?acao=Incluir" method="post">

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
                                        placeholder="Fernando Carlos" />
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
                                        placeholder="999.999.999" />
                                    <small id="helpId" class="form-text text-muted">Digite seu CPF</small>
                                </div>
                            </label>
                        </div>

                        <div class="mb-3">
                            <label for="email">
                                <div class="mb-3">
                                    <label for="email" class="form-label">Email</label>
                                    <input 
                                        required
                                        maxlength="50"
                                        type="email" 
                                        class="form-control" 
                                        name="email" 
                                        id="email" 
                                        aria-describedby="helpId"
                                        placeholder="gentefina@email.com" />
                                    <small id="helpId" class="form-text text-muted">Digite seu email</small>
                                </div>
                            </label>
                        </div>

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
                                        placeholder="Fernando Carlos" />
                                    <small id="helpId" class="form-text text-muted">Digite seu Nome</small>
                                </div>
                            </label>
                        </div>

                        <div class="mb-3">
                            <label for="senha" class="form-label">Senha</label>
                            <input type="password" name="senha" value="111" class="form-control">
                        </div>

                        <button
                            type="submit"
                            class="btn btn-primary"
                            >
                            Submit
                        </button>

                    </form>
                </div>
            </div>
        </div>

        <script></script>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    </body>
</html>
