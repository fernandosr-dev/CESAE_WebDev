// Criar uma função para calcular

function calcularSoma() {
  //Variavel do valor A
  let valorA = parseInt(document.getElementById("inputValorA").value);
  //Variavel do valor B
  let valorB = parseInt(document.getElementById("inputValorB").value);
  //Variavel resultado
  let resultadoSoma = valorA + valorB;

  document.getElementById("textoResultado").innerText =
    "O resultado é " + resultadoSoma;

  // alert(resultadoSoma);
}

function calcularSubtracao() {
  let valorA = parseInt(document.getElementById("inputValorA").value);
  let valorB = parseInt(document.getElementById("inputValorB").value);
  let resultadoSubtracao = valorA - valorB;
  document.getElementById("textoResultado").innerText =
    "O resultado é " + resultadoSubtracao;
}

function calcularMultiplicacao() {
  let valorA = parseInt(document.getElementById("inputValorA").value);
  let valorB = parseInt(document.getElementById("inputValorB").value);
  let resultadoMultiplicacao = valorA * valorB;
  document.getElementById("textoResultado").innerText =
    "O resultado é " + resultadoMultiplicacao;
}

function calcularDivisao() {
  let valorA = parseInt(document.getElementById("inputValorA").value);
  let valorB = parseInt(document.getElementById("inputValorB").value);
  let resultadoDivisao = valorA / valorB;
  document.getElementById("textoResultado").innerText =
    "O resultado é " + resultadoDivisao;
}

//Função que irá comparar o tipo de dado que recebe para poder calcular.
function compararOpe() {
  //Guardar o dado recebido numa variável
  let tipoOpe = document.getElementById("tipoOperation").value;

  //Fazer comparação
  if (tipoOpe === "+") {
    calcularSoma();
  }

  if (tipoOpe === "-") {
    calcularSubtracao();
  }

  if (tipoOpe === "*") {
    calcularMultiplicacao();
  }

  if (tipoOpe === "/") {
    calcularDivisao();
  } else {
    document.getElementById("textoResultado").innerText =
      "Escolha uma operação válida";
  }
}
