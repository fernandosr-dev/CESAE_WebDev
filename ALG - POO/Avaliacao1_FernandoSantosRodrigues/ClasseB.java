import java.util.Scanner;

class ClasseB
{
    Scanner scanner = new Scanner(System.in);
    ClasseB()
    {
        System.out.println("Olá! Este programa permite realizar somas e subtrações.");
        System.out.println("Por favor informe qual operação deseja realizar: ");
        System.out.println("Escreva `soma´ para somar ou qualquer outra coisa para subtrair.");
        String resposta = scanner.nextLine().toLowerCase();
        
        System.out.println("Informe o primeiro número que deseja calcular: ");
        int numero1 = scanner.nextInt();
        System.out.println("Informe o segundo número que deseja calcular: ");
        int numero2 = scanner.nextInt();
        
        if(resposta.equals("soma"))
        {
            int resultado = numero1 + numero2;
            System.out.println("o resultado da operação é: " + resultado);
        }
        else
        {
            int resultado = numero1 - numero2;
            System.out.println("O resultado da operação é: " + resultado);
        }       
    }
}