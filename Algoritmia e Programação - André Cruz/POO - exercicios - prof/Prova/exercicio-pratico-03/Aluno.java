
class Aluno
{
    private String nome;
    private float nota;
    
    Aluno(String nome, float nota)
    {
    
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome()
    {
        return nome;
    }
    
    public float getNota()
    {
        return nota;
    }
}