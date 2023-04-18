package Modelo.Localizacao;

public class Regiao {
    private String nome;
    private String id;
    private Estado[] estados;
    private Gerente gerente;

    public Regiao(String nome, String id, Estado[] estado) {
        this.nome = nome;
        this.id = id;
        this.estado = estado;
    }
}

