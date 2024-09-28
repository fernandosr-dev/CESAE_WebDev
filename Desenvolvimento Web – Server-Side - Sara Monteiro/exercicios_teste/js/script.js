
// 1. Crie um script que despolete um alerta com a string “A turma de Web é dinâmica e tem as
// características essenciais para brilhar numa empresa”. Na consola deve imprimir;
// Primeira ocorrência da letra “U” (posição).
// Primeira ocorrência da letra “W”: (posição).
// Tamanho da string

let string = "A turma de Web é dinâmica e tem as características essenciais para brilhar numa empresa";

//alert (string);

let posicaoU = string.indexOf('u');
console.log(`Primeira ocorrência da letra “u” ${posicaoU}`);

let posicaoW = string.indexOf('W');
console.log(`Primeira ocorrência da letra “W” ${posicaoW}`);

let tamanhoString = string.length;
console.log(`A string tem ${tamanhoString} caracteres`);


// 2. Defina um array chamado myWishList onde coloque a lista das prendas de Natal que pretende
// receber. Usando um ciclo, itere o array e mostre na consola a lista de prendas.
// No final indique quantas prendas tem a lista.

let myWishList = ['sapato', 'camisa', 'perfume']

for (let i = 0; i < myWishList.length; i++) {
    console.log(`Prenda ${i +1}`);
}
console.log(`A lista de prendas tem ${myWishList.length} itens`);

// 3. Tranforme os items da lista em objectos com as propriedades: nome e preço. Usando os
// métodos dos arrays, crie um novo array com as prendas cujo valor é inferior a 20.

let myWishList = [
    { nome: 'sapato', preco: 50 },
    { nome: 'camisa', preco: 15 },
    { nome: 'perfume', preco: 18 }
];


// 4. Escreva uma função chamada multiply que receba dois valores e imprima na consola o
// resultado da multiplicação dos mesmos. 


function multiply(value1, value2) {
    return value1 * value2;
}

console.log(multiply(5, 10));

// 5. O tempo está incerto e eu não sei se deva vestir calções ou calças, ajude-me a decidir. Escreva
// uma função chamada isShortsWeather que aceite um argumento a que podemos chamar
// temperature. Se a temperatura for maior que 25, imprime verdadeiro. Se não, imprime falso.

function isShortsWeather(temperature) {
    if (temperature > 25) {
        return true;
    }
    else {
        return false;
    } 
} 

console.log(isShortsWeather(26));
console.log(isShortsWeather(25));



// 6. Crie um botão no index.html com o texto ‘Diz-me o teu nome e dir-te-ei olá’. Ao clicar nesse
// botão, é despoletado uma caixa de texto perguntar o nome ao utilizador. Quando o user
// responde, é lançado um alerta a dizer ‘olá, nome do User’.




// 7. Escreva uma função chamada sumArray que aceite um array de números. A função deve
// imprimir a soma de todos os números do array

function sumArray(numeros) {
    let soma = 0;
    for (let i = 0; i < numeros.length; i++) {
        soma += numeros[i];
    }
    return soma;
}
let resultado = sumArray([5, 10, 15, 20]);
console.log(resultado);

// 8. Crie em HTML com três botões. A cada botão deve ser associada uma função para alterar a cor
// de fundo desse elemento para uma cor aleatória. Deverá apenas usar uma função para os 3
// botões.



// 9. Adicione um botão que, ao ser clicado, adicione ao HTML um paragrafo com o texto ‘É só mais
// um esforço e a seguir serie um programador de renome.


//10. Quando aparece o parágrafo da linha anterior adicione 2 novos botões: um que, ao ser clicado, 
//aumente o tamanho do texto anterior e outro que reduza.



// 11. Tomando em consideração o ponto anterior, quando o tamanho do texto for aumentado deve ser alterado o 
// alinhamento do texto para o centro. Quando o tamanho do texto for reduzido, o alinhamento do texto deve 
// ser definido para a direita.


// 12. No HTML crie uma lista intitulada “O que já aprendi em JS:” que contenha os seguintes itens: 
// Lógica de Código JS, Funções, DOM, Eventos, e um botão “aprendido”.
// Ao clicar no botão, em JS adicione no final de todos os itens “– aprendido”.


// 13. Crie um botão em html que lance um prompt ao utilizador a perguntar uma outra coisa que tenha aprendido. 
// Em JS, adicione o item à lista anterior.