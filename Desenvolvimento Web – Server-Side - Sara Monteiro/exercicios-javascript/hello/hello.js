
// Seleciona os botões
const helloBtn = document.getElementById('helloBtn');
const byeBtn = document.getElementById('byeBtn');

// Adiciona evento ao botão Hello
helloBtn.addEventListener('click', function() {
    alert('olá');
});

// Adiciona evento ao botão Bye
byeBtn.addEventListener('click', function() {
    alert('Adeus');
});
