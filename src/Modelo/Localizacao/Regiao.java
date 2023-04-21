package Modelo.Localizacao;

import Modelo.Colaborador.Gerente;

public class Regiao {
    private String nome;
    private String id;
    private Estado[] estados;
    private Gerente gerente;

    public Regiao(String nome, String id, Estado[] estado) {
        this.nome = nome;
        this.id = id;
        this.estados = estado;
    }
}

