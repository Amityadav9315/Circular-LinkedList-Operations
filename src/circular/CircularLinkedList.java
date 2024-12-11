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
    public void deleteFront(int data){
        if(head==null){
            System.out.println("Empty list");
        }
        if(head==tail){
            head=null;
            tail=null;
        }
        else{
            head=head.next;
            head.prev=tail;
            tail.next=head;


        }
    }
    //delete from end
    public void deleteEnd(int data){
        if(tail==null){
            System.out.println("Empty linklist");
        }
        if(head==tail){
            this.tail=null;
            this.head=null;
        }
        else{
            tail=tail.prev;
            tail.next=head;
            head.prev=tail;

        }
    }
    //display forward

    public  void displayForward(){
        if(head==null) {
            System.out.println("Linklist is empty");
            return;

        }
        Node temp=head;
        do{
            System.out.println(temp.data+"\t");
            temp=temp.next;

            }
        while(temp!=head);
        System.out.println();


        }
        //display backward
    public void displayBackward(){
        if(tail==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=tail;
        do{
            System.out.println(temp.data+"\t");
            temp=temp.prev;
        }
        while(temp!=tail);
        System.out.println();

    }
    //search data
    public boolean searchData(int data){
        if(head==null){
            System.out.println("Linklist is empty");

        }
        Node temp=head;
        while(head.next!=tail.next){
            if(temp.data==data)
                return true;
                temp=temp.next;
            }
        return false;

        }

    }
}
