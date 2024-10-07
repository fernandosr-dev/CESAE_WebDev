// Seleciona o formulário e a lista
const groceryForm = document.getElementById('groceryForm');
const productInput = document.getElementById('productInput');
const quantityInput = document.getElementById('quantityInput');
const groceryList = document.getElementById('groceryList');

// Adiciona um ouvinte de evento para o formulário
groceryForm.addEventListener('submit', function(event) {
    // Evita o recarregamento da página
    event.preventDefault();

    // Obtém os valores dos campos de entrada
    const product = productInput.value.trim();
    const quantity = quantityInput.value.trim();

    // Verifica se os valores não estão vazios
    if (product !== '' && quantity !== '') {
        // Cria um novo elemento de lista
        const newListItem = document.createElement('li');
        newListItem.textContent = `${quantity} x ${product}`;

        // Adiciona o novo item à lista
        groceryList.appendChild(newListItem);

        // Faz o reset dos campos de entrada
        groceryForm.reset();
    }
});