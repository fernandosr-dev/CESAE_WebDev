import java.util.Scanner;
import java.util.Random;

class Checkout
{
    
    int precoDoPerfumeAleatorio = new Random().nextInt(1,21);
    Scanner scanner = new Scanner(System.in);
    //System.out.println();
    
    Checkout()
    {
        System.out.println("O preço do perfume é: " + precoDoPerfumeAleatorio + " euros.");
        System.out.println("Quanto de dinheiro irá entregar?");
        int respostaUsuario = scanner.nextInt();
        int saldoUsuario = respostaUsuario;
        int troco;
        
        if (saldoUsuario >= precoDoPerfumeAleatorio)
        {
            System.out.println("O seu perfume foi pago.");
            
            if (saldoUsuario > precoDoPerfumeAleatorio )
            {
            troco = saldoUsuario - precoDoPerfumeAleatorio;
            System.out.println("O seu troco é de " + troco + " euros");
            }
        }
        
        do
        {
            System.out.println("Quanto de dinheiro irá entregar?");
            respostaUsuario = scanner.nextInt();
            saldoUsuario += respostaUsuario;
            System.out.println(saldoUsuario);
        } while (saldoUsuario < precoDoPerfumeAleatorio);
        
        System.out.println("O seu perfume foi pago.");        
    }
}
