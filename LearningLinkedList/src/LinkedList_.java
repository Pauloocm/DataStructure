public class LinkedList_ {
    public Node head;
    public Node current;

    public void AddToEnd(int data){
        var newNode = new Node(data, null);

        if(head == null){
            head = newNode;
            current = head;
        }else{
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    public void AddToStart(int data){
        var newNode = new Node(data, null);

        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void AddData8After4(int data){
        var newNode = new Node(data, null);

        if(head == null){
            head = newNode;
        }else{
            Node curr = head;
            while(curr.next != null){
                if(curr.data == 4)

                    newNode.next = curr.next;
                    curr.next = newNode;
                    break;

                }
                curr = curr.next;
            }
        }
    }
}
