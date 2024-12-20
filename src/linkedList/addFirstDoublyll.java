package linkedList;

public class addFirstDoublyll {
    public class Node
    {
        int data;
        Node next;
        Node prev;
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

    public void adFirst(int data)
    {
        Node newNode = new Node(data);
        size++;

        if(head==null)
        {
            head=tail=newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void print()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        addFirstDoublyll dll = new addFirstDoublyll();
        dll.adFirst(3);
        dll.adFirst(4);
        dll.adFirst(5);
        dll.print();
        System.out.println(dll.size);
    }
}
