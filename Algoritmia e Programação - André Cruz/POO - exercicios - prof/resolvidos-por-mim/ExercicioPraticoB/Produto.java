// Passo 1: Entendimento do Problema
// Precisamos criar um programa com duas classes:

// Classe Produto: Representa os produtos com dois atributos: nome (String) e preco (float).
// Classe AppGestao: Responsável por gerenciar os produtos, com três métodos principais:
// inserirProduto(): Adiciona produtos a uma lista.
// listarProdutos(): Exibe os produtos cadastrados.
// totalPrecos(): Exibe a soma de todos os preços.

// Passo 2: Criação da Classe Produto
// Vamos começar pela classe Produto. Ela precisa armazenar o nome e o preço de cada produto. 
// Isso pode ser feito criando um construtor que inicializa esses atributos.

class Produto
{
    // Atributos: nome e preco são privados para manter a encapsulação. Isso significa que só podem
    // ser acessados diretamente por métodos da própria classe. Para outras classes, precisam de getters e setters.
    private String nome;
    private float preco;
    
    
    // Construtor: inicializa os atributos ao criar um novo produto (instancia um novo objeto)
    Produto(String nome, float preco)
    {
        this.nome = nome;
        this.preco = preco;
        
    }
    
    
    // Encapsulamento: A classe Produto mantém seus atributos privados, garantindo que apenas os métodos da própria classe 
    // possam acessá-los diretamente, preservando a integridade dos dados.
    // Getters: Fornecem acesso aos atributos para outras classes, como a AppGestao.
    
    public String getNome()
    {
        return nome;
    }
    
    public float getPreco()
    {
        return preco;
    }
}