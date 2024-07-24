// 5 -Índice de Massa Corporal 
// Objetivo: Desenvolver um programa que apresente o índice de massa corporal em função do peso 
// e altura fornecidos. 
// Informação adicional: O índice de massa corporal é calculado através da divisão do peso de uma 
// pessoa pelo quadrado da sua altura, ou seja, peso / (altura * altura). 
// Requisitos: 
// • Pedir ao utilizador que forneça o seu peso em quilogramas e em seguida a sua altura em 
// metros. Para este exercício não serão necessárias validações. Assuma que o utilizador vai 
// fornecer números reais positivos. 
// • Em seguida, o programa deverá apresentar o cálculo final do índice de massa corporal. 

// Passos para resolver o exercício:

	// 1.	Pedir ao usuário para fornecer o seu peso em quilogramas.
	// 2.	Pedir ao usuário para fornecer a sua altura em metros.
	// 3.	Calcular o Índice de Massa Corporal (IMC) usando a fórmula: IMC = peso / (altura * altura).
	// 4.	Apresentar o resultado do cálculo do IMC.
	
import java.util.Scanner;

class IndiceMassaCorporal
{   
    // Criando um objeto Scanner para ler a entrada do usuário
    Scanner scanner = new Scanner(System.in);
    IndiceMassaCorporal()
    {
        // Pedir ao usuário para fornecer o seu peso
        System.out.println("Bem vindo! Vamos calcular o seu Índice de Massa Corporal!");
        System.out.println("Por favor informe seu peso em KGs: ");
        float peso = scanner.nextFloat();
        
        // Pedir ao usuário para fornecer a sua altura
        System.out.println("Por favor informe sua altura: ");
        float altura = scanner.nextFloat();
        
        // Calcular o índice de massa corporal (IMC)
        float imc= peso / (altura * altura);
        
        // Apresentar o resultado
        System.out.println("O seu índice de massa corporal (IMC) é: " + imc);
        
        // Fechar o Scanner
        scanner.close();
    }
}

// Explicação do Código:

	// 1.	Importação da classe Scanner:
	// •	import java.util.Scanner; é necessário para usar a classe Scanner, que permite ler a entrada do usuário.
	// 2.	Criação do objeto Scanner:
	// •	Scanner scanner = new Scanner(System.in); cria um novo objeto Scanner que lê a entrada do console.
	// 3.	Entrada do usuário para peso:
	// •	System.out.print("Digite o seu peso em quilogramas: "); solicita ao usuário que forneça o seu peso.
	// •	double peso = scanner.nextDouble(); lê o peso fornecido pelo usuário e armazena na variável peso.
	// 4.	Entrada do usuário para altura:
	// •	System.out.print("Digite a sua altura em metros: "); solicita ao usuário que forneça a sua altura.
	// •	double altura = scanner.nextDouble(); lê a altura fornecida pelo usuário e armazena na variável altura.
	// 5.	Cálculo do IMC:
	// •	double imc = peso / (altura * altura); calcula o IMC dividindo o peso pelo quadrado da altura.
	// 6.	Exibição do resultado:
	// •	System.out.println("O seu índice de massa corporal (IMC) é: " + imc); imprime o valor do IMC no console.
	// 7.	Fechamento do Scanner:
	// •	scanner.close(); fecha o objeto Scanner para liberar os recursos.