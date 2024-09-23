
//Classe mãe ou Superclasse de Jogador 
class Utilizador
{
    int id;
    String username;
    String email;
    String password;
    
    boolean autenticado = false;
     
    Utilizador()
    {
        username = "Visitante";
    }
    
    void fazerLogin(String paramUsername, String paramPassword)
    {
        // Supondo um eventual acesso à BD
        username = "Grims";
        password = "1234";
        
        if( username.equals(paramUsername) == true && password.equals(paramPassword) == true )
        {
            System.out.println("Autenticado com sucesso!");
            autenticado = true;
        }
        else
        {
            System.out.println("As credenciais estão erradas!");
        }
        
        
    }
    
    void fazerLogout()
    {
        autenticado = false;
    }
    
    void fazerRegisto()
    {
    
    }

}