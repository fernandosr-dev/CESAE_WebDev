
// 1. Crie um script que despolete um alerta com a string “A turma de Web é dinâmica e tem as
// características essenciais para brilhar numa empresa”. Na consola deve imprimir;
// Primeira ocorrência da letra “U” (posição).
// Primeira ocorrência da letra “W”: (posição).
// Tamanho da string

let string = "A turma de Web é dinâmica e tem as características essenciais para brilhar numa empresa";

alert (string);

let posicaoU = string.indexOf('u');
console.log(`Primeira ocorrência da letra “u” ${posicaoU}`);

let posicaoW = string.indexOf('W');
console.log(`Primeira ocorrência da letra “W” ${posicaoW}`);

let tamanhoString = string.length;
console.log(`A string tem ${tamanhoString}`);


// 2. Defina um array chamado myWishList onde coloque a lista das prendas de Natal que pretende
// receber. Usando um ciclo, itere o array e mostre na consola a lista de prendas.
// No final indique quantas prendas tem a lista.

let myWishList = ['sapato', 'camisa', 'perfume']

myWishList.forEach((item, index) => {
    console.log(`${index}: ${item}`);
});

console.log(`A lista de prendas tem ${myWishList.length} itens`);

// 3. Tranforme os items da lista em objectos com as propriedades: nome e preço. Usando os
// métodos dos arrays, crie um novo array com as prendas cujo valor é inferior a 20.



// 4. Escreva uma função chamada multiply que receba dois valores e imprima na consola o
// resultado da multiplicação dos mesmos. 




// 5. O tempo está incerto e eu não sei se deva vestir calções ou calças, ajude-me a decidir. Escreva
// uma função chamada isShortsWeather que aceite um argumento a que podemos chamar
// temperature. Se a temperatura for maior que 25, imprime verdadeiro. Se não, imprime falso.




// 6. Crie um botão no index.html com o texto ‘Diz-me o teu nome e dir-te-ei olá’. Ao clicar nesse
// botão, é despoletado uma caixa de texto perguntar o nome ao utilizador. Quando o user
// responde, é lançado um alerta a dizer ‘olá, nome do User’.




// 7. Escreva uma função chamada sumArray que aceite um array de números. A função deve
// imprimir a soma de todos os números do array



// 8. Crie em HTML com três botões. A cada botão deve ser associada uma função para alterar a cor
// de fundo desse elemento para uma cor aleatória. Deverá apenas usar uma função para os 3
// botões.



// 9. Adicione um botão que, ao ser clicado, adicione ao HTML um paragrafo com o texto ‘É só mais
// um esforço e a seguir serie um programador de renome.
