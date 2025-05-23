package br.ucsal.eventos.model;

import br.ucsal.eventos.Annotations.EventoOficial;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Evento {
    private static int contadorId = 1;
    private int id;

    @EventoOficial(description = "Colação")
    private String titulo;
    private String descricao;
    private LocalDate data;
    private List<Inscricao> inscricoes = new ArrayList<>();

    public Evento(String titulo, String descricao, LocalDate data) {
        this.id = contadorId++;
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
    }

    public void inscrever(Participante participante) throws Exception {
        inscricoes.add(new Inscricao(participante, this));
    }

    public List<Inscricao> getInscricoes() {
        return inscricoes;
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDate getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getId() {
        return id;
    }
}