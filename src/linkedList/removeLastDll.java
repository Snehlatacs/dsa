package linkedList;

public class removeLastDll {
    static class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head;

    void remvLast() {
        if (head == null) {
            System.out.println("List is empty. Nothing to remove.");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = null;
    }

    void addLst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    void print() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        removeLastDll list = new removeLastDll();

        // Adding nodes to the list
        list.addLst(10);
        list.addLst(20);
        list.addLst(30);

        System.out.println("Original List:");
        list.print();

        list.remvLast();
        System.out.println("After removing last node:");
        list.print();


    }
}
