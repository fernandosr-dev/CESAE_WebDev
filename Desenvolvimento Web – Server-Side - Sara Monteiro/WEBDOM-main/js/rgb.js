
const button = document.querySelector('#btn')
const button1 = document.querySelector('#btn1')
const button2 = document.querySelector('#btn2')

button.addEventListener('click', newColor);
button1.addEventListener('click', newColor);
button2.addEventListener('click', newColor);

function newColor () {
    const newColor = makeRandColor();
    document.body.style.backgroundColor = newColor;}


const makeRandColor = () => {
    const r = Math.floor(Math.random() * 256);
    const g = Math.floor(Math.random() * 256);
    const b = Math.floor(Math.random() * 256);
    return `rgb(${r}, ${g}, ${b})`
}




// const colorBtn = document.getElementById('colorBtn');
// const colorDisplay = document.getElementById('color-display');

// colorBtn.addEventListener('click', function() {
//     const newColor = getRandomColor();
//     document.body.style.backgroundColor = newColor;
//     colorDisplay.textContent = newColor;
// });