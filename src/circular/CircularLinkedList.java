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
            head.next=head;
            head.prev=head;
        }
        else{
            newNode.next=head;
            newNode.prev=tail;
            head.prev=newNode;
            tail.next=newNode;

            head=newNode;

        }
    }

    //add data to the end
    public void addEnd(int data){
        Node newNode=new Node(data);
        if(tail==null){
            this.head=newNode;
            this.tail=newNode;
            head.next=head;
            head.prev=head;
        }
        else{
            newNode.prev=tail;
            newNode.next=head;
            tail.next=newNode;
            head.prev=newNode;
            tail=newNode;
        }
    }
    //delete from front
}
