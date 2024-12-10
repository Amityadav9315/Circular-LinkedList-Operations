package circular;

public class CircularLinkedList {
    private Node head;
    private Node tail;
    public CircularLinkedList(){
        this.head=null;
        this.tail=null;
    }
    // add data item to front (head)
    public void addFront(int data){
        Node newNode=new Node(data);
        if(head==null){
            this.head=newNode;
            this.tail=newNode;
        }
    }
}
