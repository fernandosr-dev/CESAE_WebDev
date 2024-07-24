// 3 - Conversão de Euros para Reais 
// Objetivo: Desenvolver um programa que converta um determinado número de euros para reais. 
// Informação adicional: 1 euro equivale a 6.04 reais neste momento. 
// Para este exercício, não é para fazer arredondamentos de valores. 
// Requisitos: 
// • Pedir ao utilizador que forneça um determinado número de euros. Para este 
// exercício não serão necessárias validações. Assuma que o utilizador vai fornecer um 
// número real positivo. 
// • Em seguida, o programa deverá apresentar o número de reais respetivo. 

// Passos para resolver o exercício:

    // 1.    Pedir ao usuário para fornecer o número de euros.
    // 2.    Converter o valor fornecido de euros para reais.
    // 3.    Exibir o valor convertido em reais.
// Importação da classe Scanner:
import java.util.Scanner;

class ConversaoEurosParaReais
{   // Criando um objeto Scanner para ler a entrada do usuário
    Scanner scanner = new Scanner(System.in);
    
    ConversaoEurosParaReais()
    {
        // Definindo a taxa de conversão como uma constante. Neste exemplo vamos utilizar Float, mas poderia ser double.
        final float TAXA_CONVERSAO = 6.04f;
        
        // Pedir ao usuário para fornecer o número de euros
        System.out.println("Bem vindo ao conversor de moedas de Euros para Reais.");
        System.out.println("Por favor, informe o valor em Euros que deseja converter para Reais: ");
        float euros = scanner.nextFloat(); 
        
        // Converter euros para reais
        float reais = euros * TAXA_CONVERSAO;
        
        // Exibir o resultado
        System.out.println(euros + " euros equivalem a R$ " + reais + " reais.");
        
        // Fechar o Scanner
        scanner.close();
    }
}

// Explicação do Código:

    // 1.    Importação da classe Scanner:
    // •    import java.util.Scanner; é necessário para usar a classe Scanner, que permite ler a entrada do usuário.
    // 2.    Definição da taxa de conversão:
    // •    final double TAXA_CONVERSAO = 6.04; define a taxa de conversão de euros para reais.
    // 3.    Criação do objeto Scanner:
    // •    Scanner scanner = new Scanner(System.in); cria um novo objeto Scanner que lê a entrada do console.
    // 4.    Entrada do usuário:
    // •    System.out.print("Digite a quantidade de euros: "); exibe uma mensagem pedindo ao usuário para digitar a quantidade de euros.
    // •    double euros = scanner.nextDouble(); lê a entrada do usuário e a armazena na variável euros.
    // 5.    Conversão de euros para reais:
    // •    double reais = euros * TAXA_CONVERSAO; calcula o valor em reais multiplicando a quantidade de euros pela taxa de conversão.
    // 6.    Exibição do resultado:
    // •    System.out.println(euros + " euros equivalem a " + reais + " reais."); imprime o resultado no console.
    // 7.    Fechamento do Scanner:
    // •    scanner.close(); fecha o objeto Scanner para liberar os recursos.
    
    
    // Passo a Passo:

	// 1.	Definindo a constante de conversão:
	// •	final double TAXA_CONVERSAO = 6.04;: Define a taxa de conversão como uma constante.
	// 2.	Criando um objeto Scanner:
	// •	Scanner scanner = new Scanner(System.in);: Cria um objeto Scanner para ler a entrada do console.
	// 3.	Solicitando a entrada do usuário:
	// •	System.out.print("Digite a quantidade de euros: ");: Exibe uma mensagem para o usuário, solicitando que ele digite a quantidade de euros.
	// 4.	Lendo a entrada do usuário:
	// •	double euros = scanner.nextDouble();: Lê a quantidade de euros que o usuário digitou. Este valor é um número de ponto flutuante e é armazenado na variável euros.
	// 5.	Conversão e exibição:
	// •	double reais = euros * TAXA_CONVERSAO;: Converte o valor de euros para reais multiplicando pela taxa de conversão.
	// •	System.out.println(euros + " euros equivalem a " + reais + " reais.");: Exibe o valor convertido para o usuário.
	// 6.	Fechando o Scanner:
	// •	scanner.close();: Fecha o objeto Scanner para liberar os recursos.