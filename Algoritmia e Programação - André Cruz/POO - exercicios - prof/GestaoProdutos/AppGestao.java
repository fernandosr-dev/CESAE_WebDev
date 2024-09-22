import java.util.ArrayList;


class AppGestao
{
    
    Produto instanciaProduto;
    ArrayList<Produto> listaProduto;
    
    AppGestao()
    {
        listaProduto = new ArrayList();
        System.out.println("Bem-vindo/a à Aplicação de Gestão");
    }
    
    void inserirProduto(String paramNome, float paramPreco)
    {
        instanciaProduto = new Produto(paramNome, paramPreco);
        listaProduto.add(instanciaProduto);
    }
    
    void listarProdutos()
    {
        for(int i=0; i<listaProduto.size(); i++)
        {
            System.out.println(listaProduto.get(i).nome + ": " + listaProduto.get(i).preco);
        }
    }
    
    void totalPrecos()
    {
    
    }
    
    
}
