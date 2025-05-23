package br.ucsal.eventos.model;

import br.ucsal.eventos.Utils.Validations;

import java.time.LocalDate;

public class Inscricao {
    private Participante participante;
    private Evento evento;
    private LocalDate dataInscricao;
    private boolean checkinRealizado;

    public Inscricao(Participante participante, Evento evento) throws Exception {
        Validations.ValidateEmail(participante);
        this.evento = evento;
        this.dataInscricao = LocalDate.now();
        this.checkinRealizado = false;
    }

    public Participante getParticipante() {
        return participante;
    }

    public Evento getEvento() {
        return evento;
    }

    public LocalDate getDataInscricao() {
        return dataInscricao;
    }

    public boolean isCheckinRealizado() {
        return checkinRealizado;
    }

    public void realizarCheckin() {
        this.checkinRealizado = true;
    }
}