// 8 - Média de 3 Notas de AvaliaçãoObjetivo: Calcular a média de apenas 3 notas de avaliação
 // fornecidas pelo utilizador.Requisitos:•Pedir ao utilizador que forneça a nota de uma unidade
 // que obteve no curso. Para este exercício não serão necessárias validações. Assuma que o 
 // utilizador vai fornecer um número inteiro positivo entre 0 a 20.•Em seguida, o programa 
 // deverá pedir continuamente por mais notas até atingir o total de 3 notas. Mais uma vez não 
 // será necessário fazer validações.•Por fim, apresente a média final das notas. Não necessita 
 // de arredondamentos.
 
 
 // Passos para resolver o exercício:

	// 1.	Pedir ao usuário para fornecer a primeira nota.
	// 2.	Pedir ao usuário para fornecer a segunda nota.
	// 3.	Pedir ao usuário para fornecer a terceira nota.
	// 4.	Calcular a média das três notas.
	// 5.	Exibir a média final.
	
import java.util.Scanner;

class AppMedia
{   Scanner notaUtilizador = new Scanner(System.in);
    Scanner textoUtilizador = new Scanner(System.in);
    AppMedia()
    {
        notasUtilizador();
    }
    
    void notasUtilizador()
    {
        System.out.println("Indique a sua primeira nota: ");
        int primeiraNotaUtilizador = notaUtilizador.nextInt();
        System.out.println("Indique a sua segunda nota: ");
        int segundaNotaUtilizador = notaUtilizador.nextInt();
        System.out.println("Indique a sua terceira nota: ");
        int terceiraNotaUtilizador = notaUtilizador.nextInt();
        
        int media = (primeiraNotaUtilizador + segundaNotaUtilizador + terceiraNotaUtilizador / 3);
        
        System.out.println("A sua média é de: " + media);
        escritasUtilizador();
    }
    
    void escritasUtilizador()
    {
        System.out.println("Continuar?");
        String escritaUtilizador = new String();
        escritaUtilizador = textoUtilizador.nextLine();
        
        if(escritaUtilizador.equalsIgnoreCase("sim"));
        {
            System.out.println("Escreveste sim!");
            notasUtilizador();
        }
        else
        {
            System.out.println("Não escreveste sim!");
        }
    }
}