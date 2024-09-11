// 6 - Username e PasswordObjetivo: Desenvolver um programa que autentique o utilizador 
// através de username e password.Informação adicional: O username é “utilizador” e a 
// password é “abz”.Requisitos:• Pedir ao utilizador que escreva a palavra para username
// e em seguida a palavra para apassword.• Se o utilizador escrever corretamente o username
 // e a password, deverá aparecer amensagem “Autenticação Completa”.• Caso contrário 
 // (username ou password incorrecta), deverá ser apresentada a mensagem“Autenticação Inválida”.• 
 // O utilizador só terá 3 tentativas para acertar no username e password. Se as tentativasforem esgotadas, 
 // não serão permitidas mais introduções de texto e deverá serapresentada a mensagem “Este computador 
 // será autodestruído em 5 segundos!”.

 // Passos para resolver o exercício:

	// 1.	Definir as credenciais corretas para autenticação (username e password).
	// 2.	Criar um laço que permita até 3 tentativas de autenticação.
	// 3.	Em cada tentativa, solicitar ao usuário que forneça o username e a password.
	// 4.	Verificar se o username e a password estão corretos.
	// 5.	Exibir a mensagem apropriada com base no resultado da verificação.
	// 6.	Se o usuário esgotar as 3 tentativas sem sucesso, exibir a mensagem de autodestruição.

import java.util.Scanner;
class AppLogin
{   
    // Criando um objeto Scanner para ler a entrada do usuário
    Scanner scanner = new Scanner(System.in);
    // Definindo as credenciais corretas
    final String USERNAME_CORRETO = "utilizador";
    final String PASSWORD_CORRETO = "abz";
    // Definindo o máximo de tentativas
    int tentativas = 3;
    AppLogin()
    {
        autenticar();
    }
    
    void autenticar()
    {
        if (tentativas > 0)
        {
            // Solitica o username ao usuário:
            System.out.println("Indique o username: ");
            // Salva o username digitado pelo usuário na variável username:
            String username = scanner.nextLine();
            // Solitica a password ao usuário:
            System.out.println("Indique a  password: ");
            // Salva a password digitada pelo usuário na variável password:
            String password = scanner.nextLine();
            // Compara se o username e a password digitadas pelo usuário são iguais ao determinado.
            if(username.equals(USERNAME_CORRETO) && password.equals(PASSWORD_CORRETO))
            {
                // Se o que foi digitado corresponder ao determinado, imprime "Autenticação completa"
                System.out.println("Autenticação completa");
            }
            else 
            {
                // Se o que foi digitado não corresponder ao determinado, imprime "Autenticação inválida"
                System.out.println("Autenticação inválida");
                // Decresce em 1 a quantidade de tentativas inicialmente defina em 3
                tentativas --;
                // Recomeça a função autenticar
                autenticar();
            }
        }
        else
        {   // Imprime na tela 
            System.out.println("Este computador será autodestruído em 5 segundos!");
        }        
    }
}


// import java.util.Scanner;

// public class Autenticacao {
    // public static void main(String[] args) {
        // // Definindo as credenciais corretas
        // final String USERNAME_CORRETO = "utilizador";
        // final String PASSWORD_CORRETO = "abz";
        
        // // Criando um objeto Scanner para ler a entrada do usuário
        // Scanner scanner = new Scanner(System.in);
        
        // // Variável para contar as tentativas
        // int tentativas = 0;
        
        // // Laço para permitir até 3 tentativas
        // while (tentativas < 3) {
            // // Pedir ao usuário para fornecer o username
            // System.out.print("Digite o username: ");
            // String username = scanner.nextLine();
            
            // // Pedir ao usuário para fornecer a password
            // System.out.print("Digite a password: ");
            // String password = scanner.nextLine();
            
            // // Verificar se o username e a password estão corretos
            // if (username.equals(USERNAME_CORRETO) && password.equals(PASSWORD_CORRETO)) {
                // System.out.println("Autenticação Completa");
                // // Fechar o Scanner e sair do programa
                // scanner.close();
                // return;
            // } else {
                // System.out.println("Autenticação Inválida");
                // tentativas++;
            // }
        // }
        
        // // Se as tentativas forem esgotadas
        // System.out.println("Este computador será autodestruído em 5 segundos!");
        
        // // Fechar o Scanner
        // scanner.close();
    // }
// }