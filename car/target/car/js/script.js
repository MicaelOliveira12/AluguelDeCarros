// Elemento <select> onde os itens serão exibidos
var selectElement = document.getElementById("mySelect");

// URL do arquivo JSON
var jsonFileUrl = "car/src/main/java/br/com/cars/JSON/Marcas.json";

// Função para preencher o <select> com os dados do JSON
function populateSelect(jsonData) {
  // Iterar sobre os itens do JSON
  jsonData.forEach(function(item) {
    // Criar uma nova opção
    var option = document.createElement("option");
    // Definir o valor e o texto da opção com base nos dados do JSON
    option.value = item.id;
    option.text = item.nome;
    // Adicionar a opção ao <select>
    selectElement.appendChild(option);
  });
}

// Fazer a requisição para obter o arquivo JSON
fetch(jsonFileUrl)
  .then(function(response) {
    return response.json();
  })
  .then(function(data) {
    // Chamar a função para preencher o <select> com os dados do JSON
    populateSelect(data);
  })
  .catch(function(error) {
    console.log("Erro ao ler o arquivo JSON: " + error);
  });