package Modelo.Produtos;

public class Produto {
    public Integer id;
    private String nome;
    public Double preco;


    public Produto(String nome, Double preco, Integer id) {
        this.nome = nome;
        this.preco = preco;
        this.id = id;

    }

    public void getNome() {
        System.out.println(nome);
    }

    public void getId() {
        System.out.println("ID: "+id);
    }


    public void getPreco() {
        System.out.println("R$ "+ this.preco);
    }
}


