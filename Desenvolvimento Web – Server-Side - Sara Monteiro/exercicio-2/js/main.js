// Array fornecido no exercício
const fullNames = [
    { first: 'Albus', last: 'Dumbledore' },
    { first: 'Harry', last: 'Potter' },
    { first: 'Hermione', last: 'Granger' },
    { first: 'Ron', last: 'Weasley' },
    { first: 'Rubeus', last: 'Hagrid' },
    { first: 'Minerva', last: 'McGonagall' },
    { first: 'Severus', last: 'Snape' }
];

// Criando um novo array para armazenar os primeiros nomes
const firstNames = [];

// Utilizando o forEach para iterar sobre o array fullNames
fullNames.forEach(function(person) {
    // Adiciona o valor da chave 'first' de cada objeto ao array firstNames
    firstNames.push(person.first);
});

// Exibindo o array com os primeiros nomes
console.log(firstNames);

const greet = (username) => {
    return `Hey, ${username}`
}

console.log(greet("Fernando"));


// const users = validUserNames([
//     'joao', 
//     'francisco@2024', 
//     'gustavo@25874', 
//     'ana@2024', 
//     'cintia',
//     'fernando@87',
//     'maria00'
// ]);

function validUserNames(usernames) {
    
    const validNames = usernames.filter(
        element => element.length < 10
    )
    // return usernames = users.filter(function(usernames) {
        
    // })
    console.log(validNames);
}


function allEvens(numberArr){
    return numberArr.every(myNumber => myNumber % 2 === 0)
}

let media = (notes.reduce((accumulator, currentVal) => ))