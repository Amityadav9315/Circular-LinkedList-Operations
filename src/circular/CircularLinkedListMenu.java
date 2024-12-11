package circular;

import java.util.Scanner;

public class CircularLinkedListMenu {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CircularLinkedList list=new CircularLinkedList();
        int choice,data;
        do{
            System.out.println("\n Circular  linked List Operations:");
            System.out.println("1. Add at Front");
            System.out.println("2. Add at End");
            System.out.println("3. Delete from Front");
            System.out.println("4. Delete from End");
            System.out.println("5. Display forward");
            System.out.println("6. Display backward");
            System.out.println("7. Search data");
            System.out.println("Enter the choice");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the data to add at front");
                    data=sc.nextInt();
                    list.addFront(data);
                    System.out.println(data +" added to front");
                    break;
                case 2:
                    System.out.println("Enter the data to add at End");
                    data=sc.nextInt();
                    list.addEnd(data);
                    System.out.println(data+"added at End");
                    break;
                case 3:
                    System.out.println("Delecting from front");
                    list.deleteFront(data);
                    break;
                case 4:
                    System.out.println("Delete from End");
                    list.deleteEnd(data);
                    break;
                case 5:

            }
        }

    }
}
