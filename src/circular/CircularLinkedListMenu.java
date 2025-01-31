package circular;

import java.util.Scanner;

public class CircularLinkedListMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularLinkedList list = new CircularLinkedList();
        int choice, data = 0;
        do {
            System.out.println("\n Circular  linked List Operations:");
            System.out.println("1. Add at Front");
            System.out.println("2. Add at End");
            System.out.println("3. Delete from Front");
            System.out.println("4. Delete from End");
            System.out.println("5. Display forward");
            System.out.println("6. Display backward");
            System.out.println("7. Search data");
            System.out.println("Enter the choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the data to add at front");
                    data = sc.nextInt();
                    list.addFront(data);
                    System.out.println(data + " added to front");
                    break;
                case 2:
                    System.out.println("Enter the data to add at End");
                    data = sc.nextInt();
                    list.addEnd(data);
                    System.out.println(data + "added at End");
                    break;
                case 3:
                    System.out.println("Delecting from front");
                    list.deleteFront(data);
                    break;
                case 4:
                    System.out.println("rttklff");
                    System.out.println("Deleting  from End");
                    list.deleteEnd(data);
                    break;
                case 5:
                    System.out.println("Displaying linkedlist from forward ");
                    list.displayForward();
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Display backward");
                    list.displayBackward();
                    break;
                case 7:
                    System.out.println("Enter the data to search:");
                     data = sc.nextInt(); // Read the data to search from the user
                    boolean found = list.searchData(data); // Assuming `searchData` returns a boolean

                    // Print the result
                    if (found) {
                        System.out.println("Data found in the list.");
                    } else {
                        System.out.println("Data not found in the list.");
                    }
                    break;

                default:
                    System.out.println("Invalid choice");

            }
        }
        while (choice != 7);
        sc.close();
    }
}



