<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>CADASTRO</title>
 <link
    href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css"
    rel="stylesheet">
</head>
<body>
    <#include "navegar.ftlh" />
            <div class="container col-sm-12 col-md-6 col-mdoffset-2">
                <form action="/salvarContato" th:object=${contato} method="post">
                    <div class="form-group">
                        <label for="nome">Nome</label> <input type="text" th:field="*{nome}"
                            class="form-control" id="nome" placeholder="Nome do contato">
                    </div>
                    <div class="form-group">
                        <label for="data">Data de Nascimento</label> <input type="date" class="form-control"
                            th:field="*{dataNascimento}" />
                    </div>
                    <div class="form-group">
                        <label for="cpf">CPF</label> <input type="CPF" th:field="*{CPF}"
                             class="form-control" id="CPF" placeholder="CPF do contato">
                    </div>

                    <button type="submit" class="btn btn-primary">Enviar</button>
                </form>
            </div>
</body>
</html>