<%-- 
    Document   : compras
    Created on : 28 de mai. de 2024, 18:47:33
    Author     : laryssa.paiva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Compras</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>

    <body>
        <div class="container">
            <div class="col sm 6 mt 5">

                <div class="col-sm-6 mt-5">
                    <form action="" method="post">

                        <div class="mb-3">
                            <label for="quantidade_compra">
                                <div class="mb-3">
                                    <label for="quantidade_compra" class="form-label">Quantidade da Compra</label>
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
                                    <small id="helpId" class="form-text text-muted">Digite a quantidade</small>
                                </div>
                            </label>
                        </div>

                        <div class="mb-3">
                            <label for="data_compra">
                                <div class="mb-3">
                                    <label for="data_compra" class="form-label">Data da Compra</label>
                                    <input 
                                        required
                                        maxlength="10"
                                        minlength="10"
                                        type="date" 
                                        class="form-control" 
                                        name="data_compra" 
                                        id="data_compra" 
                                        aria-describedby="helpId"
                                        />
                                    <small id="helpId" class="form-text text-muted">Digite o dia da compra</small>
                                </div>
                            </label>
                        </div>

                        <div class="mb-3">
                            <label for="valor_compra">
                                <div class="mb-3">
                                    <label for="valor_compra" class="form-label">Valor da Compra</label>
                                    <input 
                                        required
                                        maxlength="50"
                                        minlength="3"
                                        step="0.01"
                                        type="number" 
                                        class="form-control" 
                                        name="valor_compra" 
                                        id="valor_compra" 
                                        aria-describedby="helpId"
                                        />
                                    <small id="helpId" class="form-text text-muted">Digite o valor pago</small>
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
