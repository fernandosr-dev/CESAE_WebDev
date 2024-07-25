import java.util.Scanner;
class ClasseA
{   
    final float TAXA_CONVERSAO = 0.62f;
    Scanner scanner = new Scanner(System.in);
    ClasseA()
    {
        System.out.println("Informe a quantidade de quilómetros que deseja conventer: ");
        float quilometros = scanner.nextFloat(); 
        
        float milhas = quilometros * TAXA_CONVERSAO;
        System.out.println( "O resultado da conversão para milhas é: " + milhas );
    }
}