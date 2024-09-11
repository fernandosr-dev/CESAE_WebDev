import java.util.Random;
class NumerosDaSorte
{   
    // int valor = 6 (variável global)
    
    NumerosDaSorte()
    {
    // variável local à função
    // int teste = 7;
        System.out.println("O 1o número sorteado é: " + lancarDado() );
        System.out.println("O 2o número sorteado é: " + lancarDado() );
        System.out.println("O 3o número sorteado é: " + lancarDado() );
        System.out.println("O 4o número sorteado é: " + lancarDado() );
        System.out.println("O 5o número sorteado é: " + lancarDado() );
        
    }
    
    int lancarDado()
    {
        Random numeroAleatorio = new Random();
        int resultadoDoDado = numeroAleatorio.nextInt(6) +1;
        return resultadoDoDado;
    
    }
    
}