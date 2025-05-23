package br.ucsal.eventos.model;

import br.ucsal.eventos.Annotations.ValidEmail;

public class Participante {
    private static int contadorId = 1;
    private int id;
    private String nome;

    @ValidEmail
    private String email;

    public Participante(String nome, String email) {
        this.id = contadorId++;
        this.nome = nome;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}