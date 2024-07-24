// 2 - Entrada no Cinema 
// Objetivo: Desenvolver um programa que pergunte a idade e verifique se a pessoa pode entrar no 
// cinema. 
// Requisitos: 
// • Pedir ao utilizador que forneça a sua idade. Para este exercício não serão necessárias 
// validações. Assuma que o utilizador vai fornecer um número inteiro positivo. 
// • No caso da sua idade ser menor que 18 anos, forneça a mensagem de “Proibido Entrar!”. 
// • Caso a sua idade seja maior ou igual que 18 anos, forneça a mensagem “Permitida a Entr 
// ada!”. 

// Passos para resolver o exercício:

	// 1.	Pedir ao usuário para fornecer a sua idade.
	// 2.	Verificar se a idade é menor que 18 anos.
	// 3.	Exibir a mensagem apropriada com base na idade fornecida.

// 1.	Importação da classe Scanner: é necessário para usar a classe Scanner, que permite ler a entrada do usuário.
import java.util.Scanner;

class EntradaCinema
{
    // Criando um objeto Scanner para ler a entrada do usuário
    Scanner scanner = new Scanner(System.in);
    EntradaCinema()
    {   
        // Pedir ao usuário para fornecer a sua idade
        System.out.println("Este cinema é para maiores de 18 anos. Por favor, informe sua idade: ");
        int idade = scanner.nextInt();
        
        // Verificar se a idade é menor que 18 anos
        if(idade < 18 == true)
        {   // Exibir mensagem se a idade for menor que 18
            System.out.println("Proibido Entrar!");
        }
        else
        {   // Exibir mensagem se a idade for 18 ou maior
            System.out.println("Entrada permitida!");
        }
        // Fechar o Scanner
        scanner.close();
    }
}

// Explicação do Código:

	// 1.	Importação da classe Scanner:
	// •	import java.util.Scanner; é necessário para usar a classe Scanner, que permite ler a entrada do usuário.
	// 2.	Criação do objeto Scanner:
	// •	Scanner scanner = new Scanner(System.in); cria um novo objeto Scanner que lê a entrada do console.
	// 3.	Entrada do usuário:
	// •	System.out.print("Digite a sua idade: "); exibe uma mensagem pedindo ao usuário para digitar a sua idade.
	// •	int idade = scanner.nextInt(); lê a entrada do usuário e a armazena na variável idade.
	// 4.	Verificação da idade:
	// •	if (idade < 18) { verifica se a idade fornecida é menor que 18.
	// •	System.out.println("Proibido Entrar!"); exibe a mensagem “Proibido Entrar!” se a idade for menor que 18.
	// •	} else { inicia a parte “senão” do condicional.
	// •	System.out.println("Permitida a Entrada!"); exibe a mensagem “Permitida a Entrada!” se a idade for 18 ou maior.
	// 5.	Fechamento do Scanner:
	// •	scanner.close(); fecha o objeto Scanner para liberar os recursos.