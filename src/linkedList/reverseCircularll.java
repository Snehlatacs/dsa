package linkedList;

public class reverseCircularll {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    void reverse() {
        if (head == null || head.next == head) return; // Empty list or single-node list

        Node prev = null;
        Node current = head;
        Node next;

        do{
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }while (current != head);

        // Fix the circular connection and update head
        head.next = prev; // Old head points to the new head
        head = prev;      // Update head to the new head
    }

    // Method to print the circular linked list
    void printList() {
        if (head == null) return;

        Node temp = head;
        do{
            System.out.print(temp.data + " ");
            temp = temp.next;
        }while (temp != head);
        System.out.println();
    }
    public static void main(String[] args) {
    reverseCircularll list = new reverseCircularll();

    // Manually create a circular linked list
    list.head = new Node(10);
    list.head.next = new Node(20);
    list.head.next.next = new Node(30);
    list.head.next.next.next = new Node(40);
    list.head.next.next.next.next = list.head; // Make it circular

        System.out.println("Original Circular Linked List:");
        list.printList();

        list.reverse();

        System.out.println("Reversed Circular Linked List:");
        list.printList();
}
}

