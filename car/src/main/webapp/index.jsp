<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Exemplo de JSP</title>
</head>
<body>
    <select id="marcas"></select>

    <script>
    $(document).ready(function () {
        var jsonData = '';

        // Função para ler o conteúdo do arquivo JSON
        function readJSONFile(file, callback) {
            var rawFile = new XMLHttpRequest();
            rawFile.overrideMimeType("application/json");
            rawFile.open("GET", file, true);
            rawFile.onreadystatechange = function () {
                if (rawFile.readyState === 4 && rawFile.status == "200") {
                    callback(rawFile.responseText);
                }
            }
            rawFile.send(null);
        }

        // Obter o caminho do arquivo JSON relativo ao diretório atual
        var jsonFile = '<%= request.getRequestURI().replaceFirst(request.getServletPath(), "/") %>marcas.json';

        // Ler o arquivo JSON e processar os dados
        readJSONFile(jsonFile, function (data) {
            jsonData = data;
            var options = '<option value="">Escolha uma marca</option>';
            var parsedData = JSON.parse(jsonData);

            $.each(parsedData[0], function (key, val) {
                options += '<option value="' + key + '">' + val + '</option>';
            });

            $("#marcas").html(options);
        });
    });
    </script>

    <!-- Importar jQuery -->
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</body>
</html>
