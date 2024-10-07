

let container = document.getElementById('container');



for (let i = 1; i < 101; i++) {
    
     let button = document.createElement('button');
         button.innerText = 'Botão ' + i;
         button.style.backgroundColor='red'
    

     container.appendChild(button);
     }
