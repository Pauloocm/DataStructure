import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Angela");
        fila.add("Elton");
        fila.add("Osvaldo");

        System.out.println("O tamanho da fila é: " + fila.size());

        System.out.println("O primeiro elemento da fila é: " + fila.element());


        System.out.println("Listando todos os elementos da fila: ");

        Iterator<String> it = fila.iterator();

        while(it.hasNext()) System.out.println(it.next());

        System.out.println("Removendo um elemento da fila: ");

        fila.remove();

        System.out.println("O tamanho da fila após a remoção: " + fila.size());
        System.out.println("Os elementos da fila após remoção:");

        it = fila.iterator();

        while(it.hasNext()) System.out.println(it.next());

    }
}