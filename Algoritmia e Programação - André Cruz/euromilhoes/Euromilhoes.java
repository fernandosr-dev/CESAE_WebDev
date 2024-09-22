import java.util.ArrayList;
import java.util.Random;

class Euromilhoes
{
    ArrayList<Integer> grelhaNumeros;
    ArrayList<Integer> grelhaEstrelas;
    Random valorAleatorio = new Random();
    
    Euromilhoes()
    {
        // Ciclo para inserir números na tômbola
        grelhaNumeros = new ArrayList();
        grelhaEstrelas = new ArrayList();
        
        for(int i = 0; i < 50; i++)
        {
            grelhaNumeros.add(i + 1);
        }
        
        System.out.println("A grelha de Estrelas é:");
        // Ciclo para retirar números da tômbola
        for (int i = 0; i < 5; i++)
        {
            int indexSorte = valorAleatorio.nextInt(grelhaNumeros.size());
                     
            System.out.println(grelhaNumeros.get(indexSorte));
            
            grelhaNumeros.remove(indexSorte);
        }
    }
}
