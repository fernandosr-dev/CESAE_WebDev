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
                System.out.println("Por favor escreva um número inteiro");
                int valorInteiro = inputUtilizador.nextInt();
                break;
            }
            catch(Exception mensagemErro)
            {
                System.out.println("Você não escreveu um número!");
                System.out.println(mensagemErro);
                inputUtilizador.nextLine();
            }
        }
         
    }

}