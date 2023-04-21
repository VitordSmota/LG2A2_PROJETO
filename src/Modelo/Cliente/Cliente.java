package Modelo.Cliente;

public class Cliente {
    public String nome;
    public String CPF;
    public String UF;
    public String dataNascimento;

    public Cliente(String nome, String CPF, String UF, String dataNascimento) {
        this.nome = nome;
        this.CPF = CPF;
        this.UF = UF;
        this.dataNascimento = dataNascimento;
    }

}
