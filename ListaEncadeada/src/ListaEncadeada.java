public class ListaEncadeada {
    private Celula first;
    private Celula latest;
    private Celula currently;

    public Celula getFirst() {
        return first;
    }

    public void setFirst(Celula first) {
        this.first = first;
    }

    public Celula getLatest() {
        return latest;
    }

    public void setLatest(Celula latest) {
        this.latest = latest;
    }

    public Celula getCurrently() {
        return currently;
    }

    public void setCurrently(Celula currently) {
        this.currently = currently;
    }

    public void Add(Contato value) {
        Celula celula = new Celula(value, null);

        latest = celula;

        if(first == null && latest == null){
            first = celula;
            latest = celula;
        }else{
            latest = celula;
        }

        if(currently != null) currently.setNext(celula);

        currently = celula;
    }

    public void Remove(Celula value){

    }
}
