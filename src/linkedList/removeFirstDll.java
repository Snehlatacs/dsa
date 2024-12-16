package linkedList;

public class removeFirstDll {
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

    public int remvFirst()
    {
        if(head==null)
        {
            System.out.println("dll is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1)
        {
            int val = head.data;
            head = tail=null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
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
        removeFirstDll dll = new removeFirstDll();
        dll.adFirst(3);
        dll.adFirst(4);
        dll.adFirst(5);
        dll.print();
        System.out.println(dll.size);
        dll.remvFirst();
        dll.print();
    }
}
