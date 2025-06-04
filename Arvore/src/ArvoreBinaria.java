public class ArvoreBinaria {
    public Node root;

    public ArvoreBinaria(){
        this.root = null;
    }

    public boolean insertRoot(int value){

        if(!IsEmpty()) return false;

        var node = new Node();

        node.data = value;
        //Não vejo necessidade de setar left e right como null porque já faço isso no construtor do Node;
        root = node;
        return true;
    }

    public Node Search(Node node, int value){
        if(node == null) return null;

        if(node.data == value) return node;

        //Verificando se está a esquerda do node informado
        var nodeAux = Search(node.left, value);

        if(nodeAux == null) nodeAux = Search(node.right, value);

        return nodeAux;
    }

    public Node Search(int value){
        if(IsEmpty()) return null;

        return Search(root, value);
    }

    public boolean InserirEsquerda(int vPai, int vFilho){
        //toda vez que vamos inserir em qualquer estrutura.. qual a pergunta a ser feita???
        //sera que o elemento existe?
        Node filho = Search(vFilho);
        if (filho != null) {
            return false; // esse retorno foi adicionado para garantir não inserir se o elemento já existe
        }

        //mas precisamos saber como ta o pai desse no
        Node pai = Search(vPai);
        if (pai == null) return false; // esse pai nem existe na arvore

        if(pai.left != null) return false; // pq o nó pai já possui filho

        Node novoNo = new Node();
        novoNo.data = vFilho;

        pai.left = novoNo;
        return true;
    }

    public boolean inserirDireita(int vPai, int vFilho){
        //toda vez que vamos inserir em qualquer estrutura.. qual a pergunta a ser feita???
        //sera que o elemento existe?

        Node filhoExists = Search(vFilho);

        if(filhoExists != null) return false;
        //esse trecho de código(63 até 65), foi adicionado para garantir não inserir se o elemento já existe.

        Node pai = Search(vPai);

        if(pai == null) return false;
        //O pai não existe na arvore

        if(pai.right != null) return false; //significa que o nó PAI já possui filho

        Node newNode = new Node();

        newNode.data = vFilho;

        pai.right = newNode;
        return true;
    }

    private void exibirPreOrdem(Node node){
        if(node == null) return;

        //System.out.println(" " + T.getConteudo()); //pre ordem
        if(node.left != null) exibirPreOrdem(node.left);

        //System.out.println(" " + T.getConteudo());// central
        if(node.right != null) exibirPreOrdem(node.right);

        System.out.println(" " + node.data); //pós ordem
    }

    public void exibePreOrdem(){
        if(IsEmpty()){
            System.out.println("Sua arvore não possui elementos");
        }else{
            exibirPreOrdem(root);
        }
    }




    public boolean IsEmpty(){
        return root == null;
    }
}
