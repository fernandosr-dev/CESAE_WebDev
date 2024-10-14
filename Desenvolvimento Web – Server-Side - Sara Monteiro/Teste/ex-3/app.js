//3. Tendo em conta o seguinte código:

let num1= '5';
let num2= '3';
let jsDone = true;

function helloStudent(name, age){
    console.log('Olá ' + name);
    return age;
}

let hello = helloStudent('Rita', 31);
let age = helloStudent('Rita', 31);

//Considere que o seguinte é escrito na consola do browser:
//1.1 num1 + num2 = 8? (1V)
// Re: Não. num1 e num2 foram declarados como strings. Portanto será retornado na consola 53.

//1.2 helloStudent(‘Rita’, 31) retorna olá Rita, 31? (1V)
// Re: Não. Retorna Olá Rita

//1.3 hello retorna olá Rita, 31? (1V)
// Resposta: Não. Retorna 31

//1.4 age retorna 31? (1V)
// Resposta: Sim.

//1.5 Se eu acrescentar no código num2 = 15 que valor recebo em num2? (1V)
// Resposta: Retorna 15 pois o valor de num2 foi alterado para o numero inteiro 15.

//1.6 num1 + num2 é agora 20? (1V)
// Resposta: Não, num1 + num2 é 515

//1.7 Para que num1+num2 seja 16, como coloco no código o num1? (1V)
// Resposta: num1 = 1;

//1.8 Qual é o tipo de dados da variável jsDone? (1V)
// Resposta: Boolean