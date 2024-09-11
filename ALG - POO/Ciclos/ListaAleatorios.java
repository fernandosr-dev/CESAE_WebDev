import java.util.Random;

class ListaAleatorios
{
    Random objetoAleatorio = new Random();
    
    ListaAleatorios()
    {
        System.out.println("Este programa vai apresentar 74 números aleatórios: ");
        
        for( int i = 0; i < 74; i++)
        {
            int resultado = objetoAleatorio.nextInt(101);
            int posicao = i + 1;
            System.out.println(" O aleatório nº " + posicao + " é: " + resultado);            
        }
    
    }
}
