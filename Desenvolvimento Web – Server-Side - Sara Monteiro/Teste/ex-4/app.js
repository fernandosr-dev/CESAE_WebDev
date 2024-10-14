4. Considere o seguinte código:

let passwords = ['1234', 'sara1986', 2023];
let userPassword = prompt('Qual é a sua password');


//4.1.Usando os métodos dos Arrays, adiciona no fim do array uma palavra pass à tua escolha.(1V) 
// Re: passwords.push('fernando1986');


//4.2. Escreva uma condição que, mediante o que o que o user responder, lhe indique através de um alert se acertou numa password que está no array ou não. (1V)
//Re: 
if(passwords.includes(userPassword)){
        alert('Acertou!');
    } else {
        alert('Não acertou!');
    }


4.3. Crie um novo array chamado safePasses que retorne as passwords com mais de 6
caracteres(1V).

// Re: 
let safePasses = passwords.filter(password => password.length > 6);