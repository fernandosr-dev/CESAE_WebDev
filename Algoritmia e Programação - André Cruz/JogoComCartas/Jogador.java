import java.util.ArrayList;
import java.util.Random;
// Subclasse de Utilizado
// Extends é uma keyword que implementa o conceito de herança (Inheritance)

class Jogador extends Utilizador
{
    // Pontos nunca podem ser negativos ou zero. Depende da regra de negócio.
    private int pontos;
    String nomeNoJogo;
    Carta cartaDoJogador; 
    ArrayList<Carta> cartasNaMao;
    Random valorAleatorio = new Random();
    
    Jogador()
    {
        cartasNaMao = new ArrayList();
        pontos = 0;
    }
    
    // Regra de casino/negócio que não permite valores inferiores a zero.
    // Setter!!
    public void setPontos(int paramPontos)
    {
        if(paramPontos < 0)
        {
            pontos = 0;
        }
        else
        {
            pontos = paramPontos;
        }
    }
    
    // Getter - Apenas serve para leitura do atributo.
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
        if(cartasNaMao.size() >= 2)
        {
            int indexAleatorio = valorAleatorio.nextInt(cartasNaMao.size());
            
            Carta cartaDescartada = cartasNaMao.remove(indexAleatorio);
            
            System.out.println("A carta " + cartaDescartada.escritaCompletaDaCarta() + " do " + nomeNoJogo + " foi descartada aleatoriamente.");
            
        }
        else
        {
            System.out.println("Os jogadores possuem menos de 2 cartas e não podem descartar.");
        }
    }
    
    void mostrarMao()
    {
        // Poderia ser substituido por somente um cartasNaMao.remove(0), sem considerar o aleatorio.
        //E também daria erro ao acabar o baralho. index(0) vai sempre remover a carta mais antiga do array.
        if (cartasNaMao.size() <= 0)
        {
            System.out.println("o " + nomeNoJogo + "não tem cartas na mão!");
        }
        else
        {
            System.out.println("o " + nomeNoJogo + "não tem a seguinte mão:");
            for(int i = 0; i < cartasNaMao.size(); i++)
            {
                Carta instanciaCarta = cartasNaMao.get(i);
                System.out.println(instanciaCarta.escritaCompletaDaCarta());
            }
        }
    }
}