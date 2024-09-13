import java.util.ArrayList;

class SalaJogoPoker
{
    Jogador jogadorPoker;
    ArrayList<Jogador> listaJogadores;
    int count = 0;
    
    SalaJogoPoker()
    {
        listaJogadores = new ArrayList<>();
    }
    
    void adicionarJogador()
    {
        jogadorPoker = new Jogador();
        jogadorPoker.nomeNoJogo = "Player_";
        listaJogadores.add(jogadorPoker);
        count ++;
        System.out.print(jogadorPoker.nomeNoJogo + count);
        
    }
    
    void contarJogadores()
    {
        System.out.println("Existem " + listaJogadores.size() + " jogadores na sala");
    }
}
