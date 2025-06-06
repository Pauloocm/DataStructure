public class Tree {
    public Node root;

    public boolean InsertRoot(int value){
        if(!IsEmpty()) return false;

        Node newNode = new Node(value);
        root = newNode;
        return  true;
    }

    public boolean IsEmpty(){
        return root == null;
    }
}
