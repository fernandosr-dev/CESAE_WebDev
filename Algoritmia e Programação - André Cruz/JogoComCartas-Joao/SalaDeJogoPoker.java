import java.util.Random;
import java.util.ArrayList;

public class SalaDeJogoPoker
{
    public Jogador jogador;
    public ArrayList<Jogador> listaJogador = new ArrayList<Jogador>();
    
    public SalaDeJogoPoker()
    {
        
    }
    
    public void adicionarJogador()
    {
        jogador = new Jogador();
        jogador.nomeNoJogador = "Player_" + listaJogador.size() + 1;
        
        listaJogador.add(jogador);
        
        //pensar remover
    }
    
    public void contarJogadores()
    {
        System.out.println("Existem " + listaJogador.size() + " jogadores");
    }
    
    public void adicionarJogadores(int nrJogadores)
    {
        for(int i = 0; i < nrJogadores; i++)
        {
            if(listaJogador.size() == 0)
            {
                this.adicionarJogador();
            }
            else
            {
                jogador = new Jogador();
                jogador.nomeNoJogador = "Player_" + (i + 1);
        
                listaJogador.add(jogador);
            }
        }
    }
    
    public void removerJogador(Jogador j)
    {
        listaJogador.remove(jogador);
    }
}