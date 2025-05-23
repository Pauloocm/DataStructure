package br.ucsal.eventos.view;

import br.ucsal.eventos.Annotations.EventoOficial;
import br.ucsal.eventos.controller.EventoController;
import br.ucsal.eventos.model.Evento;
import br.ucsal.eventos.model.Inscricao;
import br.ucsal.eventos.model.Participante;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;

public class ConsoleEventos {
    private Scanner scanner = new Scanner(System.in);
    private EventoController eventoController;

    public ConsoleEventos(EventoController eventos) {
        this.eventoController = eventos;
    }

    public void iniciar() throws Exception {
        boolean sair = false;
        while (!sair) {
            System.out.println("1. Criar Evento");
            System.out.println("2. Inscrever Participante em Evento");
            System.out.println("3. Fazer Check-in");
            System.out.println("4. Listar Eventos e Inscrições");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> adicionarEvento();
                case 2 -> inscreverParticipantePorEmail();
                case 3 -> fazerCheckinPorEmail();
                case 4 -> listarEventos();
                case 5 -> sair = true;
                default -> System.out.println("Opção inválida");
            }
        }
    }

    private void adicionarEvento() {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();
        System.out.print("Data (AAAA-MM-DD): ");
        LocalDate data = LocalDate.parse(scanner.nextLine());
        eventoController.adicionarEvento(new Evento(titulo, descricao, data));
    }

    private void inscreverParticipantePorEmail() throws Exception {
        System.out.print("ID do evento: ");
        int idEvento = scanner.nextInt();
        scanner.nextLine();
        System.out.print("E-mail do participante: ");
        String email = scanner.nextLine();

        Evento evento = eventoController.getEventos().stream().filter(e -> e.getId() == idEvento).findFirst().orElse(null);
        Participante participante = eventoController.getParticipantes().stream()
                .filter(p -> p.getEmail().equalsIgnoreCase(email))
                .findFirst().orElse(null);

        if (evento == null) {
            System.out.println("Evento não encontrado.");
            return;
        }

        if (participante == null) {
            System.out.print("Participante não encontrado. Digite o nome para registro: ");
            String nome = scanner.nextLine();
            participante = new Participante(nome, email);
            eventoController.adicionarParticipante(participante);
        }

        evento.inscrever(participante);
        System.out.println("Inscrição realizada com sucesso.");
    }

    private void fazerCheckinPorEmail() {
        System.out.print("ID do evento: ");
        int idEvento = scanner.nextInt();
        scanner.nextLine();
        System.out.print("E-mail do participante: ");
        String email = scanner.nextLine();

        Evento evento = eventoController.getEventos().stream().filter(e -> e.getId() == idEvento).findFirst().orElse(null);
        if (evento == null) {
            System.out.println("Evento não encontrado.");
            return;
        }

        Inscricao inscricao = evento.getInscricoes().stream()
                .filter(i -> i.getParticipante().getEmail().equalsIgnoreCase(email))
                .findFirst().orElse(null);

        if (inscricao != null) {
            inscricao.realizarCheckin();
            System.out.println("Check-in realizado com sucesso!");
        } else {
            System.out.println("Inscrição não encontrada para este e-mail.");
        }
    }

    private void listarEventos() {
        for (Evento evento : eventoController.getEventos()) {

            var fields = evento.getClass().getDeclaredFields();

            for(Field field : fields){
                field.setAccessible(true);
            }

            try {
                for(Field field : fields){
                    var valor = field.get(evento);

                    if(field.isAnnotationPresent(EventoOficial.class) && valor.toString().contains("Colação")){
                        System.out.println("Evento oficial " + field.getName() + ": " + valor.toString());
                    }else{
                        System.out.println(field.getName() + ": " + valor.toString());
                    }
                }



            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }







        }
    }
}