package ServicesStackExercise;

import ContactsQueueExercise.ContactService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //  Crie um programa que gerencie uma PILHA de SERVIÇOS a serem cumpridos.
        //  os serviços são strings que descrevem uma ação a ser executada.
        //  O usuário deverá ter duas opções: a)
        //  Inserir o serviço na pilha; b) Obter o próximo serviço da pilha.

        var actionsService = new ActionsService();

        actionsService.Insert("Estudar estrutura de dados");
        actionsService.Insert("Jogar o lixo fora");
        actionsService.Insert("Arrumar guarda roupa");

        System.out.println(actionsService.GetNext());
        System.out.println(actionsService.GetNext());
        System.out.println(actionsService.GetNext());
        System.out.println(actionsService.GetNext());

        // -------------------------------------------------------
    }
}