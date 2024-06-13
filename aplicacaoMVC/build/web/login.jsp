<%-- 
    Document   : login
    Created on : 28 de mai. de 2024, 18:49:45
    Author     : laryssa.paiva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>

    <body>
        <div class="container">
            <div class="col sm 6 mt 5">

                <div class="col-sm-6 mt-5">
                    <form action="" method="post">

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
                                    <small id="helpId" class="form-text text-muted">CPF ai</small>
                                </div>
                            </label>
                        </div>

                        <div class="mb-3">
                            <label for="cpf">
                                <div class="mb-3">
                                    <label for="senha" class="form-label">senha</label>
                                    <input 
                                        required
                                        type="password" 
                                        class="form-control" 
                                        name="senha" 
                                        id="senha"
                                        aria-describedby="helpId" 
                                        placeholder="uma senha" />
                                    <small id="helpId" class="form-text text-muted">Senha ai</small>
                                </div>
                            </label>
                        </div>

                        <button type="submit" class="bnt bnt-primary">Envia po</button>

                    </form>
                </div>
            </div>
        </div>

        <script></script>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    </body>
</html>
