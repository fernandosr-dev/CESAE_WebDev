// Seleciona o formulário e a lista
const animalForm = document.getElementById('animalForm');
const animalInput = document.getElementById('animalInput');
const animalList = document.getElementById('animalList');

// Adiciona um ouvinte de evento para o formulário
animalForm.addEventListener('submit', function(event) {
    // Evita o recarregamento da página
    event.preventDefault();

    // Obtém o valor do campo de entrada
    const newAnimal = animalInput.value.trim();

    // Verifica se o valor não está vazio
    if (newAnimal !== '') {
        // Cria um novo elemento de lista
        const newListItem = document.createElement('li');
        newListItem.textContent = newAnimal;

        // Adiciona o novo item à lista
        animalList.appendChild(newListItem);

        // Limpa o campo de entrada
        animalInput.value = '';
    }
});