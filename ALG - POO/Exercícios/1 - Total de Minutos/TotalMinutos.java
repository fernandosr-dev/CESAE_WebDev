// Importação da classe Scanner para ler a entrada do usuário
import java.util.Scanner;

// 1 - Total de Minutos 
// Objetivo: Desenvolver um programa que transforme um determinado número de dias em 
// minutos. 
// Requisitos: 
// • Pedir ao utilizador que forneça um determinado número de dias. Para este exercício não 
// serão necessárias validações. Assuma que o utilizador vai fornecer um número inteiro 
// positivo. 
// • Em seguida, o programa deverá apresentar o número total de minutos que todos esses 
// dias têm. 

class TotalMinutos
{
    // Criando um objeto Scanner para ler a entrada do usuário
    Scanner scanner = new Scanner(System.in);
    
    TotalMinutos()
    {
        // Pedir ao usuário para fornecer o número de dias
        System.out.println("Seja bem vindo ao conversor de dias para minutos");
        System.out.println("Informe o número de dias que deseja converter para minutos:");
        int dias = scanner.nextInt();
        
        // Converter dias em minutos
        int minutos = dias * 24 * 60;
        
        // Exibir o resultado
        System.out.println("O total de minutos em " + dias + " dias é: " + minutos);   
        
        //Fechar o Scanner
        scanner.close();
    }
}


// Explicação do Código:

	// 1.	Importação da classe Scanner:
	// •	import java.util.Scanner; é necessário para usar a classe Scanner, que permite ler a entrada do usuário.
	// 2.	Criação do objeto Scanner:
	// •	Scanner scanner = new Scanner(System.in); cria um novo objeto Scanner que lê a entrada do console.
	// 3.	Entrada do usuário:
	// •	System.out.print("Digite o número de dias: "); exibe uma mensagem pedindo ao usuário para digitar o número de dias.
	// •	int dias = scanner.nextInt(); lê a entrada do usuário e a armazena na variável dias.
	// 4.	Conversão de dias em minutos:
	// •	int minutos = dias * 24 * 60; calcula o total de minutos multiplicando o número de dias por 24 (horas em um dia) e por 60 (minutos em uma hora).
	// 5.	Exibição do resultado:
	// •	System.out.println("O total de minutos em " + dias + " dias é: " + minutos); imprime o resultado no console.
	// 6.	Fechamento do Scanner:
	// •	scanner.close(); fecha o objeto Scanner para liberar os recursos.
