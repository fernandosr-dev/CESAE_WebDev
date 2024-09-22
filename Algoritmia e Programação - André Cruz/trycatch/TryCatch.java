import java.util.Scanner;

class TryCatch
{
    Scanner inputUtilizador = new Scanner(System.in);
    
    TryCatch()
    {
        while(true)
        {
            try
            {
            System.out.println("Por favor escreva um número: ");
            int valorInteiro = inputUtilizador.nextInt();
            break;
            }
            catch(Exception e)
            {
            System.out.println("Você não escreveu um número! Por favor esvreva um número inteiro");
            System.out.println("Por favor esvreva um número inteiro");
            inputUtilizador.nextLine();
            }   
        }
        
    }
}