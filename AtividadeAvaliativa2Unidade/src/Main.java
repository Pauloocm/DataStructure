import ContactsQueueExercise.ContactService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Implemente um programa que contemple uma fila de contatos
        // (nome)  para realização de uma entrevista;

        var service = new ContactService();

        service.InsertInterviwed("Angela");
        service.InsertInterviwed("Lucas");
        service.InsertInterviwed("Angelo");

        service.NextInterviwed();
        service.NextInterviwed();
        service.NextInterviwed();
        service.NextInterviwed();

        // -------------------------------------------------------
    }
}