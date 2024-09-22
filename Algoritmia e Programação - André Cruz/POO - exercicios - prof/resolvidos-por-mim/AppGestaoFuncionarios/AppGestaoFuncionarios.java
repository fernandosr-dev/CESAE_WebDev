import java.util.ArrayList;

public class AppGestaoFuncionarios
{
    // Lista de funcionários:
    private ArrayList<Funcionario> funcionarios;
    
    // Construtor que inicializa a lista de funcionários:
    public AppGestaoFuncionarios()
    {
        // variável que guardará a lista de funcionários. Por isso está no plural.
        funcionarios = new ArrayList<>();
        System.out.println("Bem-vindo/a à Aplicação Gestão de Funcionários");
    }
    
    // Metodo para inserir um novo funcionário
    public void inserirFuncionario(String nome, float salario)
    {
        // a variável novoFuncionario irá guardar a instancia de um novo funcionario
        Funcionario novoFuncionario = new Funcionario(nome, salario);
        // .add Adiciona o objeto novoFuncionario no arraylist funcionarios
        funcionarios.add(novoFuncionario);
    }
    
    // Metodo para listar todos os funcionarios
    public void listarFuncionarios()
    {
        if (funcionarios.size() == 0)
        {
            System.out.println("Não existem funcionários cadastrados");
        }
        else
        {
            for (int i = 0; i < funcionarios.size(); i++)
            {
                Funcionario funcionario = funcionarios.get(i);
                System.out.println("Funcionário: " + funcionario.getNome() + ", Salário: " + funcionario.getSalario());
            }
        }
    }
    
    // Metodo para calcular o total dos salários dos funcionários
    
    public float totalSalarios()
    {
        if (funcionarios.size() == 0)
        {
            System.out.println("Não existem funcionários");
            // Retorna zero quando a lista está vazia.
            return 0;
        }
        else
        {
            float total = 0;
            for (int i = 0; i < funcionarios.size(); i++)
            {
                float salarioFuncionario = funcionarios.get(i).getSalario();
                total += salarioFuncionario;
            }
            
            System.out.println("Total dos salários de todos os funcionários cadastrados: " + total);
            return total;
        }
    }
}
