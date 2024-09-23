import java.util.ArrayList;
import java.util.Random;

class SalaJogoPoker
{
    Jogador jogadorPoker;
    ArrayList<Jogador> listaJogadores;
    
    int numeroIdentificadorDeControlo = 0;
    
    Carta instanciaCartaPoker;
    
    ArrayList<Carta> baralhoPoker;
    
    Random valorAleatorio = new Random();
    
    SalaJogoPoker()
    {
        listaJogadores = new ArrayList<>();
    }
    
    
    void adicionarJogador()
    {
        numeroIdentificadorDeControlo ++;
        jogadorPoker = new Jogador();
        jogadorPoker.setPontos(-10);
        
        //System.out.println(jogadorPoker.getPontos());
        
        jogadorPoker.nomeNoJogo = "Player_" + numeroIdentificadorDeControlo;
        listaJogadores.add(jogadorPoker);
        
        System.out.println("Entrou na sala o: " + jogadorPoker.nomeNoJogo);
    }
    
    void contarJogadores()
    {
        System.out.println("Existem " + listaJogadores.size() + " na sala");
    }
    
    void apresentarJogadoreNaSala()
    {
        for(int i=0; i<listaJogadores.size(); i++)
        {
            System.out.println(listaJogadores.get(i).nomeNoJogo);
        }
        
        if(listaJogadores.size() <= 0)
        {
            System.out.println("Não existem jogadores nesta sala");
        }
    }
    
    void criarNovoBaralho()
    {
       baralhoPoker  = new ArrayList<>();
       
        for(int i=0; i < Carta.arrayNaipes.length; i++)
        {
            for(int j=0; j < Carta.arrayRanks.length; j++)
            {
                instanciaCartaPoker = new Carta(i, j);
                baralhoPoker.add(instanciaCartaPoker);
            }
        }
        
        System.out.println("Um baralho novo foi colocado na mesa!");
    }
    
    void flopComprar3CartasComunidade()
    {
        System.out.println("O Flop (3 cartas da comunidade) é então o seguinte:");
        
        for(int i=0; i<3; i++)
        {
            //int indexCartaQueSaiuNaSorte = valorAleatorio.nextInt(baralhoPoker.size());
            //Carta cartaComprada = baralhoPoker.get(indexCartaQueSaiuNaSorte);
            //baralhoPoker.remove(indexCartaQueSaiuNaSorte);
            
            Carta cartaComprada = tirarCartaDoBaralho(); 
            
            System.out.println(cartaComprada.rank + " de " + cartaComprada.naipe);
        }
    }
    
    void todosJogadoresCompramUmaCarta()
    {
        for(int i=0; i<listaJogadores.size(); i++)
        {
            //int indexCartaQueSaiuNaSorte = valorAleatorio.nextInt(baralhoPoker.size());
            //Carta cartaComprada = baralhoPoker.get(indexCartaQueSaiuNaSorte);
            //baralhoPoker.remove(indexCartaQueSaiuNaSorte);
            
            
            listaJogadores.get(i).comprarCarta(tirarCartaDoBaralho());
        }
        
        System.out.println("Todos os jogadores compraram uma carta!");
        
    }
    
    private Carta tirarCartaDoBaralho()
    {
        int indexCartaQueSaiuNaSorte = valorAleatorio.nextInt(baralhoPoker.size());
            
        Carta cartaComprada = baralhoPoker.get(indexCartaQueSaiuNaSorte);
            
        baralhoPoker.remove(indexCartaQueSaiuNaSorte);
        
        return cartaComprada;
    }
    
    void todosOsJogadoresMostramASuaMao()
    {
        for(int i=0; i<listaJogadores.size(); i++)
        {
            listaJogadores.get(i).mostrarMao();
        }
    }
    
    void todosOsJogadoresDiscartamUmaCarta()
    {
        System.out.println("Todos os jogadores descartaram uma carta");
        
        for(int i=0; i<listaJogadores.size(); i++)
        {
            listaJogadores.get(i).descartarCarta();
        }
    }
    
}