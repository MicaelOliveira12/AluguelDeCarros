<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <link rel="icon" type="image/x-icon" href="img/iconlogoLC.png">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.css"
        integrity="sha512-IJEbgDEF7OeKJRa0MY2PApnyJHRIsgzCveek4ec8VWQ+7KG3ZSKVNYa5xP/Gh0hVP0Mwb+gBsk+GwR3JQGhQNg=="
        crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="styles/styles.css">
    <link rel="stylesheet" href="css/stylesCadastro.css">
    <script type="text/javascript" src="js/script.js"></script>"
    <title>LC IMPORTS</title>
</head>
<header class="cabeçalho">
    <div class="logo">
        <h1>LC IMPORTS</h1>
    </div>
</header>

<body>
    <main class="container">
        <section class="formulario">
            <form action="/create-car" method="post" class="cadastro-formulario" data-formulario-cadastro>
                <div class="formulario__container">
                    <h1 class="formulario__titulo-texto">VE&IacuteCULOS</h1>
                </div>
                <fieldset class="formulario__campo">
                    <label class="campo__etiqueta" for="marca">Marca:</label>
                    <select id="marcas">
                        <option value="marca"></option>
                    </select>
                    <input class="campo__escrita" name="marca" id="marca" type="text" required />
                    <span class="mensagem-erro"></span>
                </fieldset>
                <fieldset class="formulario__campo">
                    <label class="campo__etiqueta" for="modelo">Modelo:</label>
                    <input class="campo__escrita" name="modelo" id="modelo" type="text" required />
                    <span class="mensagem-erro"></span>
                </fieldset>
                <fieldset class="formulario__campo">
                    <label class="campo__etiqueta" for="ano">Ano de Fabrica&ccedil&atildeo:</label>
                    <input class="campo__escrita" name="ano" id="ano" type="text" maxlength="4" required />
                    <span class="mensagem-erro"></span>
                </fieldset>
                <fieldset class="formulario__campo__radio">
                    <label class="container_radio">Manual
                        <input type="radio" checked="checked" name="radio">
                        <span class="checkmark"></span>
                    </label>
                    <label class="container_radio">Autom&aacute;tico
                        <input type="radio" name="radio">
                        <span class="checkmark"></span>
                    </label>
                </fieldset>
                <fieldset class="formulario__campo">
                    <label class="campo__etiqueta" for="opcionais">Opcionais:</label>
                    <input class="campo__escrita" name="opcionais" id="opcionais" type="text" required />
                    <span class="mensagem-erro"></span>
                </fieldset>
                <div>
                    <input value="CADASTRAR" class="formulario__botao" id="cadastrarVeiculo" data-botao-cadastrar
                        type="submit">
                    <span class="mensagem-erro"></span>
                </div>
            </form>
        </section>
    </main>
</body>

</html>