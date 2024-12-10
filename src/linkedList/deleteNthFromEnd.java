package linkedList;

public class deleteNthFromEnd {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    public void dFEnd(int n)
    {
        int sz = 0;
        Node temp = head;
        while(temp != null)
        {
            temp = temp.next;
            sz++;
        }
        if(n==sz)
        {
            head = head.next;
            return;
        }
        int i = 1;
        int iTofind = sz-n;
        Node prev = head;

        while(i<iTofind)
        {
            prev = prev.next;
            i++;

        }
        prev.next=prev.next.next;
        return;
    }

    public void print()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        deleteNthFromEnd ll = new deleteNthFromEnd();
        ll.addFirst(1);
        ll.addFirst(6);
        ll.addFirst(0);
        ll.addFirst(3);
        ll.print();
        ll.dFEnd(2);
        ll.print();
    }
}
