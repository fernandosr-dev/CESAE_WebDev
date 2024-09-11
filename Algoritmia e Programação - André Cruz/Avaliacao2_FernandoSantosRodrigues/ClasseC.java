import java.util.Scanner;
import java.util.Random;
class ClasseC
{
    Scanner objetoScanner = new Scanner(System.in);
    Random objetoRandom = new Random();
    int numeroUtilizador;
    int numeroAleatorio;
    ClasseC()
    {
        System.out.println("Informe um número de 1 a 7: ");
        numeroUtilizador = objetoScanner.nextInt();
        Random numeroAleatorio = new Random();
        if(numeroUtilizador > 7 )
        {
            System.out.println("O número digitado não é suportado. Informe um número de 1 a 7: ");
            numeroUtilizador = objetoScanner.nextInt();
        }
        else
        {
            if(numeroUtilizador <= 7)
            for( int i = numeroUtilizador; i < numeroUtilizador; i++ )
            {
                
                
            }
        }

    }
}