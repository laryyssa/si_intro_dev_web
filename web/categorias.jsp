<%-- 
    Document   : categorias
    Created on : 28 de mai. de 2024, 18:38:34
    Author     : laryssa.paiva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Categorias</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>

    <body>
        <div class="container">
            <div class="col sm 6 mt 5">

                <div class="col-sm-6 mt-5">
                    <form action="" method="post">

                        <div class="mb-3">
                            <label for="nome_categoria">
                                <div class="mb-3">
                                    <label for="nome_categoria" class="form-label">Nome Categoria:</label>
                                    <input 
                                        required
                                        maxlength="50"
                                        minlength="3"
                                        type="text" 
                                        class="form-control" 
                                        name="nome_categoria" 
                                        id="nome_categoria" 
                                        aria-describedby="helpId"
                                        />
                                    <small id="helpId" class="form-text text-muted">Nome Categoria ai</small>
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
