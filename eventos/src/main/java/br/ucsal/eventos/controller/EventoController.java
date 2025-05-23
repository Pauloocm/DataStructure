package br.ucsal.eventos.controller;

import br.ucsal.eventos.model.Evento;
import br.ucsal.eventos.model.Participante;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EventoController {
    private List<Evento> eventos = new ArrayList<>();
    private List<Participante> participantes = new ArrayList<>();

    public void adicionarEvento(Evento evento) {
        eventos.add(evento);
    }

    public void adicionarParticipante(Participante participante) {
        participantes.add(participante);
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }

    public String Notificate(){
        var thread = new Thread(() -> {
            for(Evento evento: eventos){
            }
        });


    };
}