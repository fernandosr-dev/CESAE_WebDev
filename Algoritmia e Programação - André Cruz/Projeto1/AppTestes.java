
// Definição da classe AppTestes.
class AppTestes 
{
    //Definição da função construtora (Constructor)
    AppTestes()
    {
        // Declaracao, atribuição e inicializacao da variáveis locais)
        int preco = 12 + 3;
        double numeroRealDouble = 3.4555464664648923;
        float numeroRealFloat = 3.45f; 
        char letra = 'A';
        boolean estado = true;
        
        // Declaracao, atribuição e instaciação de uma string com a invocação de seu construtor)
        String texto = new String("Este é o texto");
        // Fazer escrita de informação no ecrã
        System.out.println("Inicio do Construtor");
        
        System.out.println(preco + letra);
        
        int resultadoDaFuncao = funcaoQueRetornaValor();
        
        System.out.println(resultadoDaFuncao);
        
        feriasAgosto();
    }
    
    void feriasAgosto()
    {
        System.out.println("Estou à espera das férias de Agosto");
    }
    
    int funcaoQueRetornaValor()
    {
        int valor1 = 7;
        int valor2 = 3;
        int valorFinal = valor1 + valor2 - 1;
        
        return valorFinal;
        
    }
    
    
    
    
}