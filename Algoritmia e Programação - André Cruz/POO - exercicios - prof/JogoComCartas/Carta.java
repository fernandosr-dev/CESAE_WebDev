class Carta
{
    String naipe;
    String rank;
    
    //Criação dos Arrays (não permitem alteração da sua estrutura) que definem os diferentes naipes e ranks
    static String[] arrayNaipes = {"Espadas", "Paus", "Copas", "Ouros"};
    static String[] arrayRanks = {"Ás","2","3","4","5","6","7","8","9","10","Valete","Dama","Rei"};
    
    // Assinatura A
    Carta()
    {
        //naipe = arrayNaipes[3];
        //rank = arrayRanks[8];
    }
    
    // Assinatura B
    Carta(String paramNaipe, String paramRank)
    {   
        naipe = paramNaipe;
        rank = paramRank;
    }
    
    // Assinatura C
    Carta(int inteiroNaipe, int inteiroRank)
    {
        naipe = arrayNaipes[inteiroNaipe];
        rank = arrayRanks[inteiroRank];
    }
    
    String escritaCompletaDaCarta()
    {
        String designacaoCarta = rank + " de " + naipe;
        return designacaoCarta;
    }
    
}