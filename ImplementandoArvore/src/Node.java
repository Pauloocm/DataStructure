public class Node {
    Node left, right;
    int data;

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void insert(int value){
        //Aqui eu preciso verificar se a inserção irá ocorrer
        //na esquerda ou direita

        if(value <= data){
            if(left == null){
                left = new Node(value);
            }else{
                left.insert(value);
            }
        }else{
            if(right == null){
                right = new Node(value);
            }else{
                right.insert(value);
            }
        }
    }

    public boolean contains(int value){
        if(data == value){
            return true;
        }else if(value < data){
            if(left == null){
                return false;
            }else{
                return left.contains(value);
            }
        }else {
            if(right == null){
                return false;
            }else{
                return right.contains(value);
            }
        }
    }

    //left -> root -> right
    public void printInOrder(){
        if(left != null){
            left.printInOrder();
        }

        System.out.println(data);

        if(right != null){
            right.printInOrder();
        }
    }
}








