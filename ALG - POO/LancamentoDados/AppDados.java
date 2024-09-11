// Importar o package necessário
import java.util.Random;

// Definicao da classe
class AppDados
{
    // Definicao do construtor (constructor)
    AppDados()
    {
        System.out.println("O programa vai lançar um dado:");
        
        Random numeroAleatorio = new Random();
        
        int resultadoDoDado = numeroAleatorio.nextInt(6) +1;
        
        System.out.println("O número sorteado é: "+ resultadoDoDado);
    }
    
    
    
    
    
    
    
}