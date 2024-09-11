
class ExemplosA
{
    String username = new String("abc");
    String password = new String ("xyz");
    ExemplosA()
    {
        // O "== true" é opcional para deixar o código mais legível (true é igual true?)
        // O operador AND (&&) pode comparar duas expressões. O retorno vai ser boleano; true or false.
        // Para o && ser verdadeiro, todas as expressoes precisam ser verdadeiras.
        if( username.equals("abc") == true && password.equals("xyz") == true )

        // Encadeamento de IFs é possível e comum. Pode fazer tudo dentro um IF, inclusive chamar funções.
        {
            System.out.println("Username e Password corretas!");
        }
        else
        {
            System.out.println("Alguma coisa falhou!");
        }

        //O && tem precedência nos operadores lógicos. Será analisado primeiro.if( 6 > 9 || 4 == 3 && 9 <= 0 || 3 > 1 )
        //Para priorizar uma expressao deve-se coloca-la entre parenteses if( 6 > 9 || 4 == 3 && 9 <= 0 || 3 > 1 )
        //Sempre colocar as expressoes entre paresentes se quiser organizar e entender melhor a ordem dos operadores.
        if( (6 > 9 || 4 == 3) && (9 <= 0 || 3 > 1) || retornoBool() == true )
        {
            System.out.println("Aprendizagem sobre precedencia do &&");
        }    
    }

    boolean retornoBool()
    {
        return true;
    }
}

// if( username.equals("trw") == true )
// {
// // Encadeamento de IFs é possível e comum. Pode fazer tudo dentro um IF, inclusive chamar funções.
// if( password.equals("xyz") == true )
// {
// System.out.println("Username e Password corretas!");
// }

// }