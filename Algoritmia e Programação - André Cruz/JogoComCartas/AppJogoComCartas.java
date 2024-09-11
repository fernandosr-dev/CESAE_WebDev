import java.util.Random;
import java.util.ArrayList;

class AppJogoComCartas
{
    Carta instanciaCarta;
    
    Random valorAleatorio = new Random();
    // Criação de um ArrayList, que é uma coleção de elementos dinâmica.
    ArrayList<Carta> baralho = new ArrayList<>();
    
    AppJogoComCartas()
    {
        //instanciaCarta = new Carta("Copas", "Ás"); //instanciação do objeto
        //instanciaCarta.naipe = "Espadas";
        //instanciaCarta.rank = "Valete";
        
        //System.out.println(instanciaCarta.rank + " de " + instanciaCarta.naipe);
    }
    
    void criarNovoBaralho()
    {
        for(int i = 0; i < Carta.arrayNaipes.length; i++)
        {
            for(int j = 0; j < Carta.arrayRanks.length; j++)
            {
                instanciaCarta = new Carta(i, j);
                System.out.println(instanciaCarta.rank + " de " + instanciaCarta.naipe);
                baralho.add(instanciaCarta);
            }
        }
    }
    
    void comprarCartas(int numeroDeCartasComprar)
    {
        for(int i = 0; i < numeroDeCartasComprar; i++)
        {
            if (baralho.size() > 0)
            {
                int indexAleatorio = valorAleatorio.nextInt(baralho.size());
                System.out.println(baralho.get(indexAleatorio).rank + " de " + baralho.get(indexAleatorio).naipe);
                baralho.remove(indexAleatorio);
            }
            else
            {
                System.out.println("O baralho acabou. Inicie um novo baralho!");
                break;
            }
        }
    }
    
    
    void tirarUmaCarta()
    {
        int naipeAleatorio = valorAleatorio.nextInt(4);
        int rankAleatorio = valorAleatorio.nextInt(13);
        instanciaCarta = new Carta(naipeAleatorio, rankAleatorio);
        System.out.println("A baralhar e será dada uma carta:");
        System.out.println(instanciaCarta.rank + " de " + instanciaCarta.naipe);
    }
}
