import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
class Marcacao
{
    Random diaAleatorio = new Random();
    Random horaAleatoria = new Random();
    Scanner scanner = new Scanner(System.in);
    ArrayList <String> diasUteisDaSemana = new ArrayList<String>();
    ArrayList <String> horarios = new ArrayList<>();
    
    String[] diasUteis = {"Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira"};
    String[] diasComSabado = {"Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sabado"};
    
    
    Marcacao()
    {
        System.out.println("Bem vindo/a à Aplicação de Marcação Aleatória");
        System.out.println("Pretende incluir o sábado em sua marcação? Escreva sim ou não");
        
        Random diaUteis = new Random();
        
        String respostaUsuario = scanner.nextLine();
        
        // String respostaUsuario = scanner.nextLine(); 
        
        // Random diaAleatorio = new Random();
        // String resultadoDiaInputUsuario = diaAleatorio.nextLine(diasUteis);
        
        
        
        
        
        
        // int resultadoDiaInputUsuario = diaAleatorio.nextInt();
        // int resultadoHoraInputUsuario = horaAleatoria.nextInt();
        
        // float quilometros = scanner.nextFloat(); 
    }
}
