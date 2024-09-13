// Classe mãe ou superclasse de jogador
class Utilizador
{
    int id;
    String username;
    String email;
    String password;
    boolean autenticado = false; 
    
    Utilizador()
    {
        username = "visitante";
    }
    
    void fazerLogin (String usernameInput, String passwordInput)
    {
        // Supondo um eventual acesso à base de dados
        username = "fernandosr";
        password = "1234";
        
        if (username.equals(usernameInput) && password.equals(passwordInput))
        {
            System.out.println("Usuário autenticado com sucesso!");
            autenticado = true;

        }
        else
        {
            System.out.println("As credenciais estão erradas.");
        }
    }
    
    void fazerLogout()
    {
        
    }
    
    
    void fazerRegisto()
    {
        
    }
}