
// Função para realizar a operação com base no valor selecionado
function calculate() {
    const num1 = parseFloat(document.getElementById('num1').value);
    const num2 = parseFloat(document.getElementById('num2').value);
    const operation = document.getElementById('operation').value;
    let result;

    switch (operation) {
        case 'add':
            result = num1 + num2;
            break;
        case 'subtract':
            result = num1 - num2;
            break;
        case 'multiply':
            result = num1 * num2;
            break;
        case 'divide':
            result = num1 / num2;
            break;
        default:
            result = 'Operação inválida';
    }

    // Exibir o resultado
    document.getElementById('result').textContent = 'Total: ' + result;
}

// Evento de clique no botão de calcular
document.getElementById('calculateBtn').addEventListener('click', calculate);
