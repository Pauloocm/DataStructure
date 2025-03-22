
public class TestLikedList {
    public static void main(String[] args) {

        var linkedList = new ListaEncadeada();

        var contato = new Contato(1, "Paulo");
        var contato2 = new Contato(2, "Rafa");
        var contato3 = new Contato(3, "Nicinho");
        var contato4 = new Contato(4, "Jadson");

        while (linkedList.HasNext()){
            System.out.println(linkedList.getCurrently().getValue().getName());
        }

        linkedList.Add(contato);
        linkedList.Add(contato2);
        linkedList.Add(contato3);
        linkedList.Add(contato4);

        System.out.println("Iteração: ");
        var test = "test";


    }
}