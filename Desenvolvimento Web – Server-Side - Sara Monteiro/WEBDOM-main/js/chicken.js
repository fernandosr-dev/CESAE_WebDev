let chickenImg = document.querySelector('img');
chickenImg.src = ‘https://devsprouthosting.com/images/chicken.jpg'

let toggleButton = document.getElementById('toggle-button');

function changeImage() {
    if (chickenImg.src === chickenUrl) {
        chickenImg.src = eggUrl;
    } else {
        chickenImg.src = chickenUrl;
    }
}

toggleButton.addEventListener('click', changeImage);
//console.log(toggleButton);