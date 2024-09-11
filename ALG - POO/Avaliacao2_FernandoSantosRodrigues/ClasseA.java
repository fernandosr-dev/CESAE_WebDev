import java.util.Scanner;
class ClasseA
{   
    Scanner objetoScanner = new Scanner(System.in);
    ClasseA()
    {
        System.out.println("Informe sua idade: ");
        int idade = objetoScanner.nextInt();
        final int idadeMinima = 18;
        int idadeFaltante = idadeMinima - idade;
        if(idade >= idadeMinima)
            System.out.println("Já pode tirar a carta de condução!");
            
            else
            {
                if(idade < idadeMinima)
                System.out.println("Faltam " + idadeFaltante + " anos para tirar a carta de condução!");
            }
    }
}
