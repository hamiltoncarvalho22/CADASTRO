<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Contatos :: Listar</title>
    <link
    href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css"
    rel="stylesheet">
</head>
<body>
     <#include "navegar.ftlh" />
    <div class="container col-sm-12 col-md-6 col-md-offset-2">
        <table class="table table-dark">
            <tr>
                <th>nome</th>
                <th>CPF</th>
            </tr>
            <tr th:each="cont : ${lista}">
                <td th:text="${cont.nome}"></td>
                <td th:text="${cont.CPF}"></td>
                <td><a th:href="@{/editarContato(nome=${cont.nome})}">Editar</a>&nbsp;&nbsp;
                    <a th:href="@{/removerContato(nome=${cont.nome})}">Remover</a></td>
            </tr>
        </table>
        <hr/>
    </div>

</body>
</html>