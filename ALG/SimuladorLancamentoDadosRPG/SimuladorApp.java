// Importação da classe que nos permite gerar numeros aleatorios.
import java.util.Random;
// Importação da classe que nos permite receber input do utilizador.
import java.util.Scanner;

class SimuladorApp
{   
    // Variáveis globais da classe, também denominadas de propriedades ou atributos. 
    Scanner scanNumeroUtilizador = new Scanner(System.in);
    Scanner scanTextoUtilizador = new Scanner(System.in);
    Random objetoNumeroAleatorio = new Random();
    //boolean comecouPrograma == true; 
    SimuladorApp() 
    {     
        boasVindas();
        pedidoLancamento();
    }
    
    void boasVindas() 
    {
        System.out.println("Bem-vindo/a ao Simulador de Lançamentos!");
        System.out.println("Este programa permite lançar dados de 4, 6 ou 8 lados");
    }
    
    void pedidoLancamento() 
    {
    //    if (comecouPrograma == true) 
    //    {
    //    System.out.println("Bem-vindo/a ao Simulador de Lançamentos!");
    //    System.out.println("Este programa permite lançar dados de 4, 6 ou 8 lados");
    //    comecouPrograma == false
    //    }
        System.out.println("Por favor escreva 4, 6 ou 8 para determinar o gênero de dado a lançar:");
        
        //Guardar valor que o utilizador escreveu,
        int valorUtilizadorGuardado = scanNumeroUtilizador.nextInt();
        
        if( valorUtilizadorGuardado == 4 || valorUtilizadorGuardado == 6 || valorUtilizadorGuardado == 8)
        {
            escreveResultado(valorUtilizadorGuardado);
        }
        else
        {
            System.out.println("Não escolheu um gênero de dado suportado!");
            pedidoLancamento();
        }
    }

    void escreveResultado(int generoDeDadoALancar)
    {
        int resultadoDoLancamento = objetoNumeroAleatorio.nextInt(generoDeDadoALancar) + 1;
        
        System.out.println("O resultado do lançamento foi: " + resultadoDoLancamento);
        System.out.println("Deseja fazer mais algum lançamento? Escreva sim para lançar outro dado");
        System.out.println("Caso contrário, escreva outra coisa qualquer");
        
        String escritaUtilizador = new String(); 
        //scanNumeroUtilizador.nextLine();
    
        escritaUtilizador = scanTextoUtilizador.nextLine();
        
        if( escritaUtilizador.equals("sim") == true)
        {
            pedidoLancamento();
        }
        else
        {
            System.out.println("Obrigado por utilizar o nosso simulador. Fechar programa!");
        }
    }
    
}