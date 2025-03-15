public class Celula {
    private Contato data;
    private Celula next;

    public Contato getData() {
        return data;
    }

    public void setData(Contato data) {
        this.data = data;
    }

    public Celula getNext() {
        return next;
    }

    public void setNext(Celula next) {
        this.next = next;
    }

    public Celula(Contato data, Celula next) {
        this.data = data;
        this.next = next;
    };

    public Celula(){}
}
