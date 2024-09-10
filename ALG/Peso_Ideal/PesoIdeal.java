import java.util.Scanner;

class PesoIdeal
{
    Scanner scanner = new Scanner(System.in);
    String sexo;
    double altura, pesoIdeal = 0;
    PesoIdeal()
    {
        while(true)
        {
            System.out.print("Você é homem ou mulher? ");
            sexo = scanner.nextLine().toLowerCase();
            
            if (sexo.equals("homem") || sexo.equals("mulher"))
            {
                break;
            }
            else
            {
                System.out.println("Entrada inválida. Por favor, digite 'homem' ou 'mulher'. ");
            }
        }
        
        System.out.print("Digite sua altura em metros (ex: 1.75): ");
        altura = scanner.nextDouble();
        
        if (sexo.equals("homem"))
        {
            pesoIdeal = (72.7 * altura) - 58;
        }
        else if (sexo.equals("mulher"))
        {
            pesoIdeal = (62 * altura) - 44.7;
        }
        
        System.out.printf("Seu peso ideal é: %.2f kg /n", pesoIdeal);
        
        scanner.close();
    }
}
