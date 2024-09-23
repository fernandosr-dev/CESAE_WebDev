import java.util.ArrayList;

class Curso
{
    private ArrayList<Aluno> turmaDoCurso;
    float mediaDaTurma;
    float notaDaTurma;
    //String listaAleatoriaDeAlunos = new Random().nextLine();
    Curso()
    {
        turmaDoCurso = new ArrayList<>();
        System.out.println("Bem-vindo/a à Aplicação de operações sobre o curso!");
    }
    
    // Metodo inserir aluno
    
    public void inserirAluno(String nome, float nota)
    {
        // a variável novoFuncionario irá guardar a instancia de um novo funcionario
        Aluno novoAluno= new Aluno(nome, nota);
        Aluno notaAluno;
        // .add Adiciona o objeto novoFuncionario no arraylist funcionarios
        turmaDoCurso.add(novoAluno);
    }
    
    // Metodo ordenação aleatória de alunos
    
    public void ordenacaoAleatoriaDeAlunos()
    {
        if (turmaDoCurso.size() == 0)
        {
            System.out.println("Não existem ainda alunos no curso!");
        }
        else
        {
            for (int i = 0; i < turmaDoCurso.size(); i++)
            {
                Aluno aluno = turmaDoCurso.get(i);
                System.out.println("Aluno: " + aluno.getNome() + ", Nota: " + aluno.getNota());
            }
        }
    }
    
    // Metodo média de notas da turma
    public void mediaNotasDaTurma()
    {
        if (turmaDoCurso.size() == 0)
        {
            System.out.println("Não existem ainda alunos no curso!");
        }
        else
        {
                   
            for (int i = 0; i < turmaDoCurso.size(); i++)
            {
            notaDaTurma += turmaDoCurso.get(i).getNota();

            mediaDaTurma = notaDaTurma / turmaDoCurso.size();
                           
            System.out.println(" A média da turma é: " + mediaDaTurma);
        
            
            }
        }
    }

}