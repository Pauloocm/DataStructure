public class Celula {
    private Contato value;
    private Celula next;

    public Contato getValue() {
        return value;
    }

    public void setValue(Contato data) {
        this.value = data;
    }

    public Celula getNext() {
        return next;
    }

    public void setNext(Celula next) {
        this.next = next;
    }

    public Celula(Contato data, Celula next) {
        this.value = data;
        this.next = next;
    };

    public Celula(){}
}
