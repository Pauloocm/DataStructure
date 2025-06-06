//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var arvore = new Tree();

        arvore.InsertRoot(8);

        arvore.root.insert(10);
        arvore.root.insert(14);
        arvore.root.insert(3);
        arvore.root.insert(6);
        arvore.root.insert(1);

        System.out.println("InOrder:");
        arvore.root.printInOrder();

        System.out.println("---------------------------");

        System.out.println("PreOrderRight:");
        arvore.root.printPreOrderRightFirst();
        }
}