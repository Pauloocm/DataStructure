
public class Main {
    public static void main(String[] args) {
        var arvore = new ArvoreBinaria();

        arvore.insertRoot(12);

        arvore.InserirEsquerda(12, 10);
        arvore.inserirDireita(12, 14);

        arvore.exibePreOrdem();
    }
}