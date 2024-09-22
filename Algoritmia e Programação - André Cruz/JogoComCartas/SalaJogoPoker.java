import java.util.ArrayList;
import java.util.Random;
class SalaJogoPoker
{
    Jogador jogadorPoker;
    ArrayList<Jogador> listaJogadores;
    int numeroIdentificadorDeControle = 0;
    
    Carta instanciaCartaPoker;
    ArrayList<Carta> baralhoPoker;
    
    Random valorAleatorio = new Random();

    
    SalaJogoPoker()
    {
        listaJogadores = new ArrayList<>();
    }
    
    void adicionarJogador()
    {
        numeroIdentificadorDeControle ++;
        jogadorPoker = new Jogador();
        jogadorPoker.setPontos(10);
        
        System.out.println(jogadorPoker.getPontos());
        
        jogadorPoker.nomeNoJogo = "Player_" + numeroIdentificadorDeControle;
        listaJogadores.add(jogadorPoker);
        
        System.out.println("Entrou na sala o: " + jogadorPoker.nomeNoJogo);
        
        
    }
    
    void contarJogadores()
    {
        System.out.println("Existem " + listaJogadores.size() + " jogadores na sala");
    }
    
    void jogadoresAtivos()
    {        
        for (int i = 0; i < listaJogadores.size(); i++ )
        {
            System.out.println("Os jogadores ativos na sala são: " + listaJogadores.get(i).nomeNoJogo);    
        }
        
        if (listaJogadores.size() <= 0)
            {
                System.out.println("Não há jogadores ativos na sala.");     
            }            
    }
    
    void criarNovoBaralho()
    {
        baralhoPoker = new ArrayList<>();
        
        for(int i = 0; i < Carta.arrayNaipes.length; i++)
        {
            for(int j = 0; j < Carta.arrayRanks.length; j++)
            {
                instanciaCartaPoker = new Carta(i, j);
                //System.out.println(instanciaCartaPoker.rank + " de " + instanciaCartaPoker.naipe);
                baralhoPoker.add(instanciaCartaPoker);
            }
        }
        System.out.println("Um novo baralho foi colocado na mesa.");
    
    }
    
    void flopComprar3CartasComunidade()
    {
        System.out.println("O Flop (3 cartas da comunidade) é então o seguinte: ");
        
        for (int i = 0; i < 3; i++)
        {
            // int indexCartaQueSaiuNaSorte = valorAleatorio.nextInt(baralhoPoker.size());
            
            // Carta cartaComprada = baralhoPoker.get(indexCartaQueSaiuNaSorte);
            
            // baralhoPoker.remove(indexCartaQueSaiuNaSorte);
            
            Carta cartaComprada = tirarCartaDoBaralho();
            System.out.println(cartaComprada.rank + " de " + cartaComprada.naipe);
            
        }
    }
    
    void todosJogadoresCompramUmaCarta()
    {
        for (int i = 0; i < listaJogadores.size(); i++)
        {
            // int indexCartaQueSaiuNaSorte = valorAleatorio.nextInt(baralhoPoker.size());
            
            // Carta cartaComprada = baralhoPoker.get(indexCartaQueSaiuNaSorte);
            
            // baralhoPoker.remove(indexCartaQueSaiuNaSorte);
            
            
            
            listaJogadores.get(i).comprarCarta(tirarCartaDoBaralho());
        }
        
        System.out.println("Todos os jogadores compraram uma carta! ");
    }
    
    private Carta tirarCartaDoBaralho()
    {
        int indexCartaQueSaiuNaSorte = valorAleatorio.nextInt(baralhoPoker.size());
            
        Carta cartaComprada = baralhoPoker.get(indexCartaQueSaiuNaSorte);
            
        baralhoPoker.remove(indexCartaQueSaiuNaSorte);
        
        return cartaComprada;
    }
    
    void todosOsJogadooresMostramASuaMao()
    {
        for(int i = 0; i < listaJogadores.size(); i++)
        {
            listaJogadores.get(i).mostrarMao();
        }
    }
    
    void todosOsJogadoresDescartamUmaCarta()
    {
        for(int i = 0; i < listaJogadores.size(); i++)
        {
            listaJogadores.get(i).descartarCarta();
        }
    }
}




