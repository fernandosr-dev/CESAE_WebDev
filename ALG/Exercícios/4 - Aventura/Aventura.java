// 4 - Aventura 
// Objetivo: Desenvolver um programa que apresente uma breve história de uma personagem num 
// local e que permita o utilizador escolher uma direção, descrevendo o que acontece a seguir a essa 
// escolha. 
// Requisitos: 
// • Logo desde início, apresentar um texto descritivo de uma personagem e do local onde esta 
// se encontra. Utilize a sua vasta imaginação! 
// • Pedir ao utilizador que escolha uma das seguintes opções: “norte”, “sul”, “este” ou 
// “oeste”. Para este exercício não serão necessárias validações. Assuma que o utilizador vai 
// escrever corretamente uma destas opções. 
// • O programa deverá estar preparado para apresentar uma narrativa diferente para cada 
// opção. Em função da escolha do utilizador, apresente o texto respetivo. 

// 1.    Importação da classe Scanner:
import java.util.Scanner;

class Aventura
{   
    // Criando um objeto Scanner para ler a entrada do usuário
    Scanner scanner = new Scanner (System.in);
    Aventura()
    {   
        // Apresentação da personagem e do local
        System.out.println("Você é um explorador em uma floresta misteriosa. O sol está se pondo, e você precisa encontrar um abrigo.");
        System.out.println("À sua volta, você vê caminhos que levam ao norte, sul, leste e oeste. Cada direção parece promissora, mas também pode esconder perigos.");
        
        // Pedir ao usuário que escolha uma direção
        System.out.print("Para qual direção você deseja ir? (norte, sul, leste, oeste): ");
        String direcao = scanner.nextLine().toLowerCase();
        
        // Apresentar a narrativa baseada na escolha do usuário
        if (direcao.equals("norte")) {
            System.out.println("Você segue para o norte e encontra um lago tranquilo. A água é cristalina e há peixes nadando. Você decide acampar por ali.");
        } else if (direcao.equals("sul")) {
            System.out.println("Você caminha para o sul e encontra uma caverna escura. Você ouve sons estranhos vindos de dentro. Apesar do medo, você entra para investigar.");
        } else if (direcao.equals("leste")) {
            System.out.println("Indo para o leste, você encontra um antigo templo abandonado. Há inscrições nas paredes e um baú no centro. Você abre o baú e encontra um tesouro.");
        } else if (direcao.equals("oeste")) {
            System.out.println("Você escolhe ir para o oeste e encontra uma aldeia escondida. Os moradores são amigáveis e oferecem abrigo e comida para a noite.");
        } else {
            System.out.println("Direção inválida. Por favor, escolha entre norte, sul, leste ou oeste.");
        }
        
        // Fechar o Scanner
        scanner.close();
    }
}

// Explicação do Código:

    // 1.    Importação da classe Scanner:
    // •    import java.util.Scanner; é necessário para usar a classe Scanner, que permite ler a entrada do usuário.
    // 2.    Apresentação da história:
    // •    System.out.println(...) é usado para imprimir a história introdutória da personagem e do local.
    // 3.    Entrada do usuário:
    // •    System.out.print("Para qual direção você deseja ir? (norte, sul, leste, oeste): "); solicita ao usuário que escolha uma direção.
    // •    String direcao = scanner.nextLine().toLowerCase(); lê a entrada do usuário e a converte para letras minúsculas para facilitar a comparação.
    // 4.    Estrutura de controle if/else:
    // •    A estrutura if/else é usada para verificar a direção escolhida pelo usuário e executar a narrativa correspondente.
    // •    if (direcao.equals("norte")) verifica se a direção é “norte” e executa o bloco de código correspondente.
    // •    else if (direcao.equals("sul")) verifica se a direção é “sul” e executa o bloco de código correspondente.
    // •    else if (direcao.equals("leste")) verifica se a direção é “leste” e executa o bloco de código correspondente.
    // •    else if (direcao.equals("oeste")) verifica se a direção é “oeste” e executa o bloco de código correspondente.
    // •    else é usado para lidar com entradas inválidas, embora o exercício assuma que o usuário fornecerá uma entrada válida.
    // 5.    Fechamento do Scanner:
    // •    scanner.close(); fecha o objeto Scanner para liberar os recursos.
