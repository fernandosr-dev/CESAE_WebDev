// Passo 3: Criação da Classe AppGestao
// Agora, vamos criar a classe AppGestao, que vai gerenciar os produtos. 
//Ela precisa:
// Armazenar uma lista de produtos.
// Ter três métodos: um para adicionar produtos, um para listar os produtos e outro para somar os preços.

// Refere-se à classe ArrayList dentro do pacote java.util. 
// Gerencia automaticamente o tamanho da lista
import java.util.ArrayList;

class AppGestao
{
    // Atributo: Lista de Produtos;
    // A lista de produtos é armazenada em um ArrayList. Usamos essa estrutura porque é 
    //dinâmica, ou seja, ela cresce conforme inserimos novos produtos.
    private ArrayList<Produto> produtos;
    
    // Construtor
    // Inicializamos a lista e exibimos a mensagem de boas-vindas. 
    // Isso ocorre automaticamente quando criamos uma instância de AppGestao.
    AppGestao()
    {
        // A variável "produtos" será a lista principal onde os itens/produtos serão adicionados no decorrer do programa.
        produtos = new ArrayList<>(); // Inicializamos a lista
        System.out.println("Bem-vindo/a à Aplicação de Gestão!!"); // exibimos a mensagem
    }
    
    // Método para inserir um produto
    // Cria um novo produto utilizando o nome e preço passados como parâmetros.
    // novo produto é adicionado à lista.
    
    public void inserirProduto(String nome, float preco)
    {
        // A variável "novoProduto" será utilizada para criar uma instância do objeto da classe Produto.
        Produto novoProduto = new Produto(nome, preco); // Cria um novo produto com dois parâmetros definidos na classe Produtos
        // O método add adiciona esse "novoProduto"/objeto na lista inicializada no construtor.
        produtos.add(novoProduto); // novo produto é adicionado à lista
    }
    
    // Método para listar os produtos
    // Primeiro, verificamos se a lista está vazia. Se estiver, exibimos a mensagem "Não existem produtos!".
    // Se houver produtos, percorremos a lista com um loop for tradicional e exibimos o nome e o preço de cada produto.
    public void listarProdutos()
    {
        //size(): Este método retorna o número de elementos presentes na lista. Se o tamanho da lista
        //for 0, significa que ela está vazia. 
        //Retorna um inteiro que é o número de elementos na lista. 
        //size() retorna o tamanho da lista (um número inteiro), e você deve compará-lo com 0 para verificar se a lista está vazia.
        
        if (produtos.size() == 0)
        {
            System.out.println("Não existem produtos!");
        }
        else
        {
            // O for tradicional usa um índice (int i = 0) para acessar os elementos da lista um por um.
            for (int i = 0; i < produtos.size(); i++)
            {
                //No for tradicional, usamos produtos.get(i) para obter o produto na posição i.
                Produto produto = produtos.get(i);
                // Aqui estamos chamando os métodos getNome() e getPreco() da classe Produto. 
                // Esses métodos retornam o valor do atributo nome e preco do objeto produto.
                System.out.println("Produto: " + produto.getNome() + ", Preço: " + produto.getPreco());
            }
        }
    }
    
    // Método para calcular o total dos preços
    public void totalPrecos()
    {
        if (produtos.size() == 0)
        {
            System.out.println("Não existem produtos!");
        }
        else
        {
            // float total: Declara uma variável total que pode armazenar números com decimais.
            // = 0: Inicializa a variável com o valor zero, geralmente o ponto de partida em uma soma acumulativa.
            float total = 0;
            // No ArrayList, o método size() retorna o número de elementos presentes na lista, 
            // então usamos isso para definir o limite superior do for.
            for (int i = 0; i < produtos.size(); i++)
            {
                // Primeiro extrai o preço do produto e armazena em uma variável chamada precoProduto
                // usamos produtos.get(i) para obter o produto na posição i. E getPreco para obter o preco do produto.
                float precoProduto = produtos.get(i).getPreco();
                total += precoProduto; // adiciona o preço acumulado ao total
            }
            System.out.println("Total dos preços: " + total);
        }
    }
}

// Objetivo:
// Criar uma instância de AppGestao.
// Chamar o método inserirProduto() para adicionar produtos.
// Chamar o método listarProdutos() para ver a lista de produtos inseridos.
// Chamar o método totalPrecos() para ver a soma dos preços dos produtos.