package ServicesStackExercise;

import java.util.Stack;

public class ActionsService implements IActionsService{

    private Stack<String> services = new Stack<String>();

    @Override
    public boolean Insert(String service) {

        if(services.contains(service)){
            System.out.println("The '"+service+"' is already in the stack.");
            return false;
        }

        services.push(service);
        return true;
    }

    @Override
    public String GetNext() {
        if(services.isEmpty()) return "The stack is empty.";

        return services.pop();
    }
}
