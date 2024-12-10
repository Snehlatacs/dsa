package linkedList;

public class addInMiddle {
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

    public void addMid(int idx, int data)
    {
        if(idx == 0)
        {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while(i<idx-1)
        {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

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
        addInMiddle ll = new addInMiddle();
        ll.addFirst(1);
        ll.addFirst(6);
        ll.addFirst(0);
        ll.addFirst(3);
        ll.addMid(2,13);
        ll.print();
    }
}
