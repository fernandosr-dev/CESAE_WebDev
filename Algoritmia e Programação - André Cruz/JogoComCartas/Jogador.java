import java.util.ArrayList;
// Subclasse de Utilizado
// Extends é uma keyword que implementa o conceito de herança (Inheritance)

class Jogador extends Utilizador
{
    int pontos;
    String nomeNoJogo;
    Carta cartaDoJogador; 
    ArrayList<Carta> cartasNaMao;
    
    Jogador()
    {
        cartasNaMao = new ArrayList();
    }
    
    void comprarCarta(Carta paramCarta)
    {
        cartasNaMao.add(paramCarta);
    }
    
    void descartarCarta()
    {
        
    }
    
    void mostrarMao()
    {
        
    }
}