import java.util.Scanner;
import java.util.Random;

class ClasseC
{
    Scanner scanner = new Scanner(System.in);
    Random numeroAleatorio = new Random();
    int tentativas = 0;
    ClasseC()
    {
        comparar();
    }
    
    void comparar()
    {
        int aleatorio = numeroAleatorio.nextInt(8); 
        System.out.println("Informe um número entre 2 e 8:");
        int valorUtilizador = scanner.nextInt();
        if(valorUtilizador == aleatorio) 
        {
            System.out.print("Parabéns! Você acertou e utilizou " + tentativas);
            
        // }
        // else
        // {
        }
    }
    
}