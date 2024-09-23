import java.util.ArrayList;

//Subclasse de Utilizador 
//extends é uma keyword que implementa o conceito de Herança (Inheritance)
class Jogador extends Utilizador
{
    //Pontos nunca podem ser negativos
    private int pontos;
    
    String nomeNoJogo;
    Carta cartaDoJogador;
    ArrayList<Carta> cartasNaMao;
    
    Jogador()
    {
        cartasNaMao = new ArrayList();
        pontos = 0;
    }
    
    //Regra de casino que não permite pontos inferior a zero
    //Setter
    public void setPontos(int paramPontos)
    {
        if(paramPontos<0)
        {
            pontos = 0;
        }
        else
        {
            pontos = paramPontos;
        }
    }
    
    //Getter - Apenas serve para leitura do atributo
   public int getPontos()
    {
      return pontos;
    }
    
    
    
    void comprarCarta(Carta paramCarta)
    {
        cartasNaMao.add(paramCarta);
    }
    
    void descartarCarta()
    {
        if(cartasNaMao.size()>0)
        {
            cartasNaMao.remove(0);
        }
        else
        {
            System.out.println("O " + nomeNoJogo + " não tem cartas na mão!");
        }
    }
    
    void mostrarMao()
    {
        if(cartasNaMao.size()<=0)
        {
            System.out.println("O " + nomeNoJogo + " não tem cartas na mão!");
        }
        else
        {
            System.out.println("O " + nomeNoJogo + " tem a seguinte mão:");
            for(int i=0; i<cartasNaMao.size(); i++)
            {
                System.out.println(cartasNaMao.get(i).escritaCompletaDaCarta());
            }
        }
    }

}
