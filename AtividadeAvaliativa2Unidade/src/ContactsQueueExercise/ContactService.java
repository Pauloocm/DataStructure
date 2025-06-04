package ContactsQueueExercise;

import java.util.LinkedList;
import java.util.Queue;

public class ContactService implements IContactService {
    private Queue<String> fila = new LinkedList<String>();

    @Override
    public boolean InsertInterviwed(String contact) {
        boolean contactAlreadyExists = fila.contains(contact);

        if(contactAlreadyExists){
            System.out.println("The contact '" + contact + "' already exists.");
            return false;
        }

        fila.add(contact);
        return true;
    }

    @Override
    public void NextInterviwed() {
        if(fila.isEmpty()) System.out.println("The list is already empty. There are no contact to remove.");

        String contact = fila.poll();

        if(contact != null) System.out.println("Contact '" +contact + "' removed successfully.");
    }
}
