public class ListaEncadeada {
    private Celula first;
    private Celula latest;
    private Celula currently;

    public void Add(Contato value) {
        Celula celula = new Celula(value, null);

        celula.setValue(value);

        if(first == null && latest == null){
            first = celula;
        }else{
            latest.setNext(celula);
            latest.setNext(null);
        }

        latest = celula;

        if(currently != null) currently.setNext(celula);

        currently = celula;
    }

    public boolean HasNext(){
        if(first == null){
            return false;
        }else if(currently == null){
            currently = first;
            return true;
        }else{
            boolean hasNext = currently.getNext() != null ? true : false;

            currently = currently.getNext();

            return hasNext;
        }


    }



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
}
