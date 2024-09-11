import java.util.Scanner;
import java.util.Random;
class ClasseB
{
    Scanner objetoScanner = new Scanner(System.in);
    Random objetoRandom = new Random();
    String nomeClube;
    int golosMeuClube;
    int golosClubeAdeversario;
    ClasseB()
    {
        
        System.out.println("Bem vindo ao simulador de resultados para o próximo jogo!!");
        System.out.println("Indique o nome do clube de futebol que pretende simular o próximo resultado: ");
        nomeClube = objetoScanner.nextLine();
        golosMeuClube = objetoRandom.nextInt(5);
        System.out.println(nomeClube + ": " + golosMeuClube + " golos");
        golosClubeAdeversario = objetoRandom.nextInt(5);
        System.out.println("Adversário: " + golosClubeAdeversario + " golos");
        
        if(golosMeuClube > golosClubeAdeversario)
        {
            System.out.println(nomeClube + " ganhou o jogo!");
        }
        else
        {
            if(golosMeuClube < golosClubeAdeversario)
            {
                System.out.println(nomeClube + " perdeu o jogo!");
            }
            else
            {
                if(golosMeuClube == golosClubeAdeversario)
                System.out.println(nomeClube + " empatou o jogo!");
            }
        }
    }
}