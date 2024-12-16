package linkedList;

public class addLastDll {
    public static class Node
    {
        int data;
        Node prev;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void adLast(int data)
    {
        Node newNode = new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;

    }

    public void print()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        addLastDll list = new addLastDll();

        // Adding nodes to the doubly linked list
        list.adLast(10);
        list.adLast(20);
        list.adLast(30);

        // Print the list
        System.out.println("Doubly Linked List:");
        list.print();
    }
}
