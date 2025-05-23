package br.ucsal.eventos;

import br.ucsal.eventos.controller.EventoController;
import br.ucsal.eventos.view.ConsoleEventos;

public class Main {
    public static void main(String[] args) throws Exception {
        EventoController gestor = new EventoController();
        ConsoleEventos console = new ConsoleEventos(gestor);
        console.iniciar();
    }
}