// 7 – Acertar Lançamento de DadosObjetivo: Desenvolver um programa que simule o lançamento
// de dois dados, verificando se outilizador acertou no número total que saiu.Informação 
// adicional: Os dados são de seis faces.Requisitos:• Pedir ao utilizador que tente adivinhar 
// o número que irá sair no lançamento dos dados,informando que no mínimo só poderá sair 2 e 
// que no máximo só poderá sair 12.• Assuma que o utilizador escreve um número inteiro, mas 
// faça a validação ao valor fornecido de modo a verificar se é entre 2 a 12. Caso contrário, 
// repetir o pedido até o utilizador fornecer um valor válido!• Simular números aleatórios para
// os dois dados, calculando o seu total. Tudo isto deve serapresentado no ecrã através de 
// texto (valor de cada dado e seu somatório).• Comparar o resultado dos dados com o valor 
// fornecido pelo utilizador. Se o utilizador tiveracertado no número que saiu, apresentar a 
// mensagem: “Ganhou 100 euros!”. Casocontrário, apresentar a mensagem: “Tem de pagar 10 euros!”.

import java.util.Random;
import java.util.Scanner;

class AppDados
{   Scanner respostaUtilizador = new Scanner(System.in);
    Random resultadoDado = new Random();
    AppDados()
    {
        numeroUtilizador();
    }
    
    void numeroUtilizador()
    {
        int dado1 = resultadoDado.nextInt(6) + 1;
        int dado2 = resultadoDado.nextInt(6) + 1;
        int resultado = dados(dado1, dado2);
        
        System.out.println("Qual o número que vai sair no lançamento de dados?");
        int respostaUtilizadorDado = respostaUtilizador.nextInt();
        
        if(respostaUtilizadorDado >+ 2 && respostaUtilizadorDado <+ 12)
        {
            if(respostaUtilizadorDado == resultado)
            {
                System.out.println("Dado 1: " + dado1 + ". Dado2: " + dado2 + ". O teu valor introduzido foi de: " + respostaUtilizadorDado);
                System.out.println("Ganhaste 100 euros!");
            }
            
            else
            {
            System.out.println("Dado 1: " + dado1 + ". Dado2: " + dado2 + ". O teu valor introduzido foi de: " + respostaUtilizadorDado);
            System.out.println("Perdeste 10 euros!");
            }
        }
            else
            {
            System.out.println("Dados incorretos!");
            numeroUtilizador();
            }
    }
    
    int dados(int x, int y)
    {
        int resultadoDados = x + y;
        return resultadoDados;
    }
}





// import java.util.Random;
// import java.util.Scanner;

// public class LançamentoDeDados {
    // public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // Random random = new Random();

        // int palpite = 0;
        
        // // Pedir ao usuário que forneça um palpite válido
        // while (true) {
            // System.out.print("Tente adivinhar o número total que irá sair no lançamento dos dados (2 a 12): ");
            // palpite = scanner.nextInt();
            
            // // Validar se o palpite está entre 2 e 12
            // if (palpite >= 2 && palpite <= 12) {
                // break;
            // } else {
                // System.out.println("Valor inválido! Por favor, forneça um número entre 2 e 12.");
            // }
        // }

        // // Simular o lançamento dos dados
        // int dado1 = random.nextInt(6) + 1; // número entre 1 e 6
        // int dado2 = random.nextInt(6) + 1; // número entre 1 e 6
        // int total = dado1 + dado2;

        // // Mostrar o resultado dos dados
        // System.out.println("Resultado dos dados: Dado 1 = " + dado1 + ", Dado 2 = " + dado2 + ", Total = " + total);

        // // Comparar o palpite do usuário com o resultado
        // if (palpite == total) {
            // System.out.println("Ganhou 100 euros!");
        // } else {
            // System.out.println("Tem de pagar 10 euros!");
        // }

        // // Fechar o Scanner
        // scanner.close();
    // }
// }

// Explicação do Código:

	// 1.	Importação das Classes:
	// •	import java.util.Random; para gerar números aleatórios.
	// •	import java.util.Scanner; para ler a entrada do usuário.
	// 2.	Criação dos Objetos Scanner e Random:
	// •	Scanner scanner = new Scanner(System.in); para ler a entrada do usuário.
	// •	Random random = new Random(); para gerar os números aleatórios.
	// 3.	Entrada e Validação do Palpite:
	// •	O laço while (true) é usado para repetir a solicitação até que o usuário forneça um número válido.
	// •	int palpite = scanner.nextInt(); lê o palpite do usuário.
	// •	A condição if (palpite >= 2 && palpite <= 12) verifica se o palpite está no intervalo válido.
	// •	Se o palpite não estiver no intervalo, uma mensagem de erro é exibida, e o laço continua.
	// 4.	Simulação do Lançamento dos Dados:
	// •	int dado1 = random.nextInt(6) + 1; gera um número aleatório entre 1 e 6 para o primeiro dado.
	// •	int dado2 = random.nextInt(6) + 1; gera um número aleatório entre 1 e 6 para o segundo dado.
	// •	int total = dado1 + dado2; calcula o total dos dois dados.
	// 5.	Exibição do Resultado dos Dados:
	// •	System.out.println("Resultado dos dados: Dado 1 = " + dado1 + ", Dado 2 = " + dado2 + ", Total = " + total); exibe o valor de cada dado e o total.
	// 6.	Comparação e Mensagem Final:
	// •	A condição if (palpite == total) verifica se o palpite do usuário está correto.
	// •	Se o palpite estiver correto, exibe “Ganhou 100 euros!”.
	// •	Se o palpite estiver incorreto, exibe “Tem de pagar 10 euros!”.
	// 7.	Fechamento do Scanner:
	// •	scanner.close(); fecha o objeto Scanner para liberar os recursos.