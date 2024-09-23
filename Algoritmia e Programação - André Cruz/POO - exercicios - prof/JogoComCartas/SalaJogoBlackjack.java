import java.util.ArrayList;
import java.util.Random;

class SalaJogoBlackjack extends SalaJogoPoker
{
    SalaJogoBlackjack()
    {
    
    }
    
    //Exemplo de Override
    void criarNovoBaralho()
    {
        baralhoPoker  = new ArrayList<>();
       
        for(int b=0; b<6; b++)
        {
            for(int i=0; i < Carta.arrayNaipes.length; i++)
            {
                for(int j=0; j < Carta.arrayRanks.length; j++)
                {
                    instanciaCartaPoker = new Carta(i, j);
                    baralhoPoker.add(instanciaCartaPoker);
                    
                    System.out.println(instanciaCartaPoker.escritaCompletaDaCarta());
                }
            }
        }
    
    }
    
    void chamarFuncaoClasseMae()
    {
        super.criarNovoBaralho();
        
    }
}