import Modelo.Cliente.Cliente;
import Modelo.Produtos.Categoria;
import Modelo.Produtos.Produto;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        // Tela de Cadastro de cliente

        Scanner entrada = new Scanner(System.in);
        System.out.println("Realize o cadastro para comprar os produtos");
        System.out.println("----------------------------------");
        System.out.println("Digite seu Nome");
        String nome = entrada.nextLine();

        System.out.println("Digite sua data de nascimento");
        String dataNascimento = entrada.nextLine();

        System.out.println("Digite seu CPF");
        String CPF = entrada.nextLine();

        System.out.println("Digite sua UF");
        String UF = entrada.nextLine();
        Cliente cliente = new Cliente(nome,CPF,UF,dataNascimento);

        System.out.println("Como vai, " + nome + "?");
        EscolhaProdutos(cliente);




    }
    public static void EscolhaProdutos(Cliente cliente) {
        // Criação de Categorias e Produtos
        Produto produto1 = new Produto("Motorola E22 4gb 64gb", 899.00,1);
        Produto produto2 = new Produto("Xiaomi Redmi note 11 6gb 128gb", 1648.00,2);
        Produto produto3 = new Produto("fone de ouvido Bluetooth", 179.99,3);
        Produto produto4 = new Produto("La Roche-posay gel de limpeza", 40.9,4);
        Produto produto5 = new Produto("Água Micelar", 24.9,5);
        Produto produto6 = new Produto("Protetor Solar Facial", 75.49,6);
        Produto produto7 = new Produto("Código Limpo", 98.6,7);
        Produto produto8 = new Produto("Cem anos de Solidão", 75.49,8);
        Produto produto9 = new Produto("Cadeira de escritório", 169.98,9);
        Produto produto10 = new Produto("Comoda 6 gavetas", 481.41,10);

        Produto[] eletronico = {produto1, produto2, produto3};
        Produto[] moveis = {produto10, produto9};
        Produto[] perfumaria = {produto4, produto5, produto6};
        Produto[] livros = {produto7, produto8};
        Categoria Eletronicos = new Categoria("eletrônicos", eletronico);
        Categoria Perfumaria = new Categoria("perfumaria", perfumaria);
        Categoria Livros = new Categoria("livros", livros);
        Categoria Moveis = new Categoria("moveis", moveis);

        System.out.println("Qual categoria deseja ver? Escolha o numero:");
        System.out.println("----------------------------------");
        System.out.println("1 - Eletrônicos");
        System.out.println("2 - Perfumaria");
        System.out.println("3 - Livros");
        System.out.println("4 - Moveis");
        System.out.println("----------------------------------");

        Scanner entrada = new Scanner(System.in);
        int opcao = Integer.parseInt(entrada.nextLine());

        switch (opcao) {
            case 1:
                Eletronicos.setCliente(cliente);
                Eletronicos.verCatalogo();
                break;
            case 2:
                Perfumaria.verCatalogo();
                Perfumaria.setCliente(cliente);
                break;
            case 3:
                Livros.verCatalogo();
                Livros.setCliente(cliente);
                break;
            case 4:
                Moveis.verCatalogo();
                Moveis.setCliente(cliente);
                break;
            default:
                System.out.println("opção inválida!");
                break;
        };

        System.out.println("Escolha o ID do Produto desejado");
        int ProdutoID = Integer.parseInt(entrada.nextLine());

        switch (opcao) {
            case 1:
                Eletronicos.AdicionarProduto(ProdutoID);
                break;
            case 2:
                Perfumaria.AdicionarProduto(ProdutoID);
                break;
            case 3:
                Livros.AdicionarProduto(ProdutoID);
                break;
            case 4:
                Moveis.AdicionarProduto(ProdutoID);
                break;
            default:
                System.out.println("Produto inválido!");
                break;
        };



    }

}