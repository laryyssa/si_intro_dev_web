<%-- 
    Document   : tabela_produtos
    Created on : 28 de mai. de 2024, 18:50:40
    Author     : laryssa.paiva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Fornecedores</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>

    <body>
        <div class="container">
            <div class="col sm 6 mt 5">

                <div class="col-sm-6 mt-5">
                    <form action="" method="post">

                        <div class="mb-3">
                            <label for="nome_produto">
                                <div class="mb-3">
                                    <label for="nome_produto" class="form-label">Nome Produto</label>
                                    <input 
                                        required
                                        maxlength="100"
                                        minlength="3"
                                        type="text" 
                                        class="form-control" 
                                        name="nome_produto" 
                                        id="nome_produto" 
                                        aria-describedby="helpId"
                                        placeholder="produtin" />
                                    <small id="helpId" class="form-text text-muted">Digite a Nome Produto</small>
                                </div>
                            </label>
                        </div>

                        <div class="mb-3">
                            <label for="descricao">
                                <div class="mb-3">
                                    <label for="descricao" class="form-label">Descricao</label>
                                    <input 
                                        required
                                        maxlength="255"
                                        type="text" 
                                        class="form-control" 
                                        name="descricao" 
                                        id="descricao" 
                                        aria-describedby="helpId"
                                        placeholder="blablabla" />
                                    <small id="helpId" class="form-text text-muted">Digite a Descricao</small>
                                </div>
                            </label>
                        </div>

                        <div class="mb-3">
                            <label for="preco_venda">
                                <div class="mb-3">
                                    <label for="preco_venda" class="form-label">Preco da Venda</label>
                                    <input 
                                        required
                                        maxlength="50"
                                        minlength="3"
                                        step="0.01"
                                        type="number" 
                                        class="form-control" 
                                        name="preco_venda" 
                                        id="preco_venda" 
                                        aria-describedby="helpId" 
                                        />
                                    <small id="helpId" class="form-text text-muted">Digite o preço da venda</small>
                                </div>
                            </label>
                        </div>   

                        <div class="mb-3">
                            <label for="quantidade_disponivel">
                                <div class="mb-3">
                                    <label for="quantidade_disponivel" class="form-label">Quantidade Disponível</label>
                                    <input 
                                        required
                                        maxlength="5"
                                        minlength="1"
                                        type="number" 
                                        class="form-control" 
                                        name="quantidade_compra" 
                                        id="quantidade_compra" 
                                        aria-describedby="helpId"
                                        />
                                    <small id="helpId" class="form-text text-muted">Digite a Quantidade Disponível</small>
                                </div>
                            </label>
                        </div>  

                        <div class="mb-3">
                            <label for="liberado_venda">
                                <div class="mb-3">
                                    <label for="liberado_venda" class="form-label">Liberado Venda</label>
                                    <input 
                                        required
                                        maxlength="1"
                                        type="text" 
                                        class="form-control" 
                                        name="liberado_venda" 
                                        id="liberado_venda" 
                                        aria-describedby="helpId"
                                        placeholder="Lojinha" />
                                    <small id="helpId" class="form-text text-muted">Digite a liberação da Venda</small>
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
