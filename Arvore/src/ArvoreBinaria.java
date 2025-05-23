public class ArvoreBinaria {
    public Node root;

    public ArvoreBinaria(){
        this.root = null;
    }

    public boolean insertRoot(int value){

        if(IsEmpty()) return false;

        var node = new Node();

        node.data = value;
        //Não vejo necessidade de setar left e right como null porque já faço isso no construtor do Node;
        root = node;
        return true;
    }

    public Node Search(Node node, int value){
        if(node == null) return null;

        if(node.data == value) return node;

        var nodeAux = Search(node.left, value);

        if(nodeAux == null) nodeAux = Search(node.right, value);

        return nodeAux;
    }

    public Node Search(int value){
        if(IsEmpty()) return null;

        return Search(root, value);
    }

    public boolean InsertLeft(int vPai, int vFilho){
        //toda vez que vamos inserir em qualquer estrutura.. qual a pergunta a ser feita???
        //sera que o elemento existe?
        Node filho = Search(vFilho);
        if (filho != null) {
            return false; // esse retorno foi adicionado para garantir n inserir se o elemento já existe
        }

        //mas precisamos saver como ta o pai desse no
        Node pai = Search(vPai);
        if (pai == null) return false; // esse pai nem existe na arvore

        if(pai.left != null) return false; // pq o nó pai já possui filho

        Node novoNo = new Node();
        novoNo.data = vFilho;

        pai.left = novoNo;
        return true;
    }






    public boolean IsEmpty(){
        return root == null;
    }
}
