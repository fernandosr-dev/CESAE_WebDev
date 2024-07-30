import java.util.Scanner;

class Tabuada
{
    Scanner objetoScan = new Scanner(System.in);
    Tabuada()
    {
        System.out.println("Para visualizar a tabuada, digite um número de 1 a 10: ");
        int numeroTabuada = objetoScan.nextInt();
        for(int i = 1; i <= 10; i++)
        {
            int calculo = numeroTabuada * i;
            System.out.println( numeroTabuada +  " x " + i + " = " + calculo );
        }
    }
} 