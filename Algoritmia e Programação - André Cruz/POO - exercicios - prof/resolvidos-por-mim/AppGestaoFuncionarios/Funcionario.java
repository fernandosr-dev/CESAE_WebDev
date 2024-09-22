
public class Funcionario
{
    private String nome;
    private float salario;
    
    Funcionario(String nome, float salario)
    {
        this.nome = nome;
        this.salario = salario;
    }
    
    // Metodos para acessar os atributos
    
    public String getNome()
    {
        return nome;
    }
    
    public float getPreco()
    {
        return salario;
    }
}