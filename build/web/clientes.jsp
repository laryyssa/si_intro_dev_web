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
        <title>Clientes</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>

    <body>
        <div class="container">
            <div class="col sm 6 mt 5">

                <div class="col-sm-6 mt-5">
                    <form action="" method="post">

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
                            <label for="endereco">
                                <div class="mb-3">
                                    <label for="endereco" class="form-label">Endereco</label>
                                    <input 
                                        required
                                        maxlength="50"
                                        minlength="3"
                                        type="text" 
                                        class="form-control" 
                                        name="endereco" 
                                        id="endereco" 
                                        aria-describedby="helpId"
                                        placeholder="Av Paulista" />
                                    <small id="helpId" class="form-text text-muted">Digite seu endereço</small>
                                </div>
                            </label>
                        </div>

                        <div class="mb-3">
                            <label for="bairro">
                                <div class="mb-3">
                                    <label for="bairro" class="form-label">Bairro</label>
                                    <input 
                                        required
                                        maxlength="50"
                                        minlength="3"
                                        type="text" 
                                        class="form-control" 
                                        name="bairro" 
                                        id="bairro" 
                                        aria-describedby="helpId"
                                        placeholder="Limoeiro" />
                                    <small id="helpId" class="form-text text-muted">Digite seu bairro</small>
                                </div>
                            </label>
                        </div>

                        <div class="mb-3">
                            <label for="cidade">
                                <div class="mb-3">
                                    <label for="cidade" class="form-label">Cidade</label>
                                    <input 
                                        required
                                        maxlength="50"
                                        minlength="3"
                                        type="text" 
                                        class="form-control" 
                                        name="cidade" 
                                        id="cidade" 
                                        aria-describedby="helpId"
                                        placeholder="São Paulo" />
                                    <small id="helpId" class="form-text text-muted">Digite sua cidade</small>
                                </div>
                            </label>
                        </div>

                        <div class="mb-3">
                            <label for="uf">
                                <div class="mb-3">
                                    <label for="uf" class="form-label">UF</label>
                                    <input 
                                        required
                                        maxlength="2"
                                        minlength="2"
                                        type="text" 
                                        class="form-control" 
                                        name="uf" 
                                        id="uf" 
                                        aria-describedby="helpId"
                                        placeholder="SP" />
                                    <small id="helpId" class="form-text text-muted">Digite a UF</small>
                                </div>
                            </label>
                        </div>

                        <div class="mb-3">
                            <label for="cep">
                                <div class="mb-3">
                                    <label for="cep" class="form-label">Cep</label>
                                    <input 
                                        required
                                        maxlength="9"
                                        minlength="3"
                                        type="text" 
                                        class="form-control" 
                                        name="cep" 
                                        id="cep" 
                                        aria-describedby="helpId"
                                        placeholder="99999-999" />
                                    <small id="helpId" class="form-text text-muted">Digite o CEP</small>
                                </div>
                            </label>
                        </div>

                        <div class="mb-3">
                            <label for="telefone">
                                <div class="mb-3">
                                    <label for="telefone" class="form-label">Telefone</label>
                                    <input 
                                        required
                                        maxlength="20"
                                        type="tel" 
                                        class="form-control" 
                                        name="telefone" 
                                        id="telefone" 
                                        aria-describedby="helpId"
                                        placeholder="(99)99999-9999" />
                                    <small id="helpId" class="form-text text-muted">Digite seu telefone</small>
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
