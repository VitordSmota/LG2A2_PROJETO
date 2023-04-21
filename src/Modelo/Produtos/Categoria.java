package Modelo.Produtos;


public class Categoria {
    private final String nome;
    private final Produto[] produtos;

    public Categoria(String nome, Produto[] produtos) {
        this.nome = nome;
        this.produtos = produtos;
    }

    public void verCatalogo(){
        System.out.println("-----------------------------------");
        System.out.println("Categoria: "+ this.nome);
        for (Produto produto: produtos) {
        System.out.println("-----------------------------------");
             produto.getId();
             produto.getNome();
             produto.getPreco();

        }
    }
    public void AdicionarProduto(Integer produtoId){
        for (Produto produto: produtos) {
            if(produto.id == produtoId){
                System.out.println("Produto Comprado:");
                produto.getNome();
                produto.getPreco();

                Double comissaoRepresentante = produto.preco * 0.10;
                Double comissaoVendedor = (produto.preco * 0.10)+ 10 ;
                System.out.println("Comissão do Representante:"+comissaoRepresentante);
                System.out.println("Comissão do Vendedor: "+ comissaoVendedor);
                System.out.println("Até a próxima");
            }
        }
    }
}
