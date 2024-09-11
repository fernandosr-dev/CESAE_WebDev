import java.util.Scanner;
class ExemplosWhile
{
    Scanner objetoScanner = new Scanner(System.in);
    ExemplosWhile()
    {   
        System.out.println("Forneça um número entre 30 e 40");

        int valorUtilizador = objetoScanner.nextInt();

        // While repete as operações nas suas chavetas sempre que a condiçao for verdadeira.
        while( valorUtilizador < 30 || valorUtilizador > 40 )
        {
            System.out.println("Não escreveu um valor correcto! Digite novamente: ");
            valorUtilizador = objetoScanner.nextInt();
            System.out.println("Você escreveu: " + valorUtilizador);

        }
        // O Do While vai pelo menos uma vez executar o código que se encontra dentro das chavetas.
        // Só testa a condição depois disso, repetindo também sempre que a condição for verdadeira.
        do
        {
            System.out.println("Teste");
        }
        while( 5 == 8);
        
    }
}