package Modelo.Produtos;

import java.io.FileOutputStream;
import java.io.IOException;

import Modelo.Cliente.Cliente;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileNotFoundException;


public class Categoria {
    private final String nome;
    private final Produto[] produtos;
    private Cliente cliente;

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

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
    double comissaoRepresentante;
    double comissaoVendedor;
    double preco;
    Integer ID;
    String ProdutoName;


    public void AdicionarProduto(Integer produtoId) {
        for (Produto produto: produtos) {
            if(produto.id == produtoId){
                System.out.println("Produto Comprado:");
                produto.getNome();
                produto.getPreco();
                ID = produtoId;
                ProdutoName = produto.returnNome();
                 preco = produto.preco;
                 comissaoRepresentante = produto.preco * 0.10;
                 comissaoVendedor = (produto.preco * 0.10)+ 10 ;
                System.out.println("Comissão do Representante:"+comissaoRepresentante);
                System.out.println("Comissão do Vendedor: "+ comissaoVendedor);
                System.out.println("Até a próxima");
            }
        }

     // gerar relatorio
        String caminhoArquivo = "C:\\LG2A2_PROJETO\\src\\Modelo\\relatorio\\relatorio1.xlsx";

        // Criar um novo arquivo de Excel
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Criar uma nova planilha
        Sheet planilha = workbook.createSheet("Relatório de Vendas");

        // Criar a primeira linha da tabela com os títulos das colunas
        Row cabecalho = planilha.createRow(0);
        cabecalho.createCell(0).setCellValue("Nome do cliente");
        cabecalho.createCell(1).setCellValue("CPF");
        cabecalho.createCell(2).setCellValue("Data de nascimento");
        cabecalho.createCell(3).setCellValue("ID do produto");
        cabecalho.createCell(4).setCellValue("Produto");
        cabecalho.createCell(5).setCellValue("Valor");
        cabecalho.createCell(6).setCellValue("Comissão do vendedor");
        cabecalho.createCell(7).setCellValue("Comissão do representante");
        cabecalho.createCell(8).setCellValue("UF");

        // Inserir dados nas linhas da tabela

            Row linha1 = planilha.createRow(1);
            linha1.createCell(0).setCellValue(cliente.nome);
            linha1.createCell(1).setCellValue(cliente.CPF);
            linha1.createCell(2).setCellValue(cliente.dataNascimento);
            linha1.createCell(3).setCellValue(ID);
            linha1.createCell(4).setCellValue(ProdutoName);
            linha1.createCell(5).setCellValue(preco);
            linha1.createCell(6).setCellValue(comissaoVendedor);
            linha1.createCell(7).setCellValue(comissaoRepresentante);
            linha1.createCell(8).setCellValue(cliente.UF);


        // Salvar o arquivo de Excel
        try {
            FileOutputStream arquivo = new FileOutputStream(caminhoArquivo);
            workbook.write(arquivo);
            arquivo.close();
            System.out.println("Planilha criada com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    }

