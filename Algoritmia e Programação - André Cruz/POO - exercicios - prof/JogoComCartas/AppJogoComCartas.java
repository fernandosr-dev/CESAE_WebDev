import java.util.Random;
import java.util.ArrayList;

class AppJogoComCartas
{

    Random valorAleatorio = new Random();
    
    Carta instanciaCarta;
    //Criação de um ArrayList, que é uma coleção de elementos dinâmica
    ArrayList<Carta> baralho = new ArrayList<>();
    
    
    AppJogoComCartas()
    {
        //instanciaCarta = new Carta("Espadas", "Ás"); // instanciação do objeto
        //instanciaCarta.naipe = "Espadas";
        //instanciaCarta.rank = "Valete";
        //System.out.println(instanciaCarta.rank + " de " + instanciaCarta.naipe);
        
    }
    
    void criarNovoBaralho()
    {
        baralho = new ArrayList<>();       
        
        for(int i=0; i < Carta.arrayNaipes.length; i++)
        {
            for(int j=0; j < Carta.arrayRanks.length; j++)
            {
                instanciaCarta = new Carta(i, j);
                //System.out.println(instanciaCarta.rank + " de " + instanciaCarta.naipe);
                baralho.add(instanciaCarta);
            }
        }
    }
    
    void comprarCartas(int numeroDeCartasComprar)
    {
        for(int i=0; i < numeroDeCartasComprar; i++)
        {
            if(baralho.size() > 0)
            {
                int indexAleatorio = valorAleatorio.nextInt(baralho.size());
                
                System.out.println(baralho.get(indexAleatorio).rank + " de " + baralho.get(indexAleatorio).naipe);
                
                baralho.remove(indexAleatorio);
            }
            else
            {
                System.out.println("Não existem mais cartas no baralho");
                break;
            }
        }
    }

    void tirarUmaCarta()
    {
        int naipeAleatorio = valorAleatorio.nextInt(4);
        int rankAleatorio = valorAleatorio.nextInt(13);
        instanciaCarta = new Carta(naipeAleatorio, rankAleatorio);
        System.out.println("Baralhar e vai ser dada uma carta:");
        System.out.println(instanciaCarta.rank + " de " + instanciaCarta.naipe);
    }

}