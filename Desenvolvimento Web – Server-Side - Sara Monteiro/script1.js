
// Função para gerar uma cor aleatória
function getRandomColor() {
    const r = Math.floor(Math.random() * 256);
    const g = Math.floor(Math.random() * 256);
    const b = Math.floor(Math.random() * 256);
    return `rgb(${r}, ${g}, ${b})`;
}

// Seleciona o botão e o elemento onde o RGB será mostrado
const colorBtn = document.getElementById('colorBtn');
const colorDisplay = document.getElementById('color-display');

// Adiciona o evento de clique ao botão
colorBtn.addEventListener('click', function() {
    const newColor = getRandomColor();
    document.body.style.backgroundColor = newColor;
    colorDisplay.textContent = newColor;
});
