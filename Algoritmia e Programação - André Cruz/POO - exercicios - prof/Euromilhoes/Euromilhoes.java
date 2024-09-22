import java.util.ArrayList;
import java.util.Random;

class Euromilhoes
{
    ArrayList<Integer> grelhaNumeros;
    ArrayList<Integer> grelhaEstrelas;
    
    Random valorAleatorio = new Random();
    
    Euromilhoes()
    {
        grelhaNumeros = new ArrayList();
        grelhaEstrelas = new ArrayList();
        
        // Preencher a tômbola (ArrayList) com números
        for(int i=0; i<50; i++)
        {
            grelhaNumeros.add(i+1);
        }
        
        System.out.println("A Grelha de Números é:");
        // Ciclo para retirar números da tômbola
        for(int i=0; i<5; i++)
        {
            int indexSorte = valorAleatorio.nextInt( grelhaNumeros.size() );
            System.out.println(grelhaNumeros.get(indexSorte));
            grelhaNumeros.remove(indexSorte);
        }
        
        
        
        // Preencher a tômbola (ArrayList) com estrelas
        for(int i=0; i<12; i++)
        {
            grelhaEstrelas.add(i+1);
        }
        
        System.out.println("A Grelha de Estrelas é:");
        // Ciclo para retirar estrelas da tômbola
        for(int i=0; i<2; i++)
        {
            int indexSorte = valorAleatorio.nextInt( grelhaEstrelas.size() );
            System.out.println(grelhaEstrelas.get(indexSorte));
            grelhaEstrelas.remove(indexSorte);
        }
        
    }
}