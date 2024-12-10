package linkedList;

public class searchRec {
    public static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
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


    public int helper(Node head, int key)
    {
        if(head==null)
        {
            return -1;
        }
        if(head.data == key)
        {
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1)
        {
            return -1;
        }
        return idx+1;
    }

    public int recSearch(int key)
    {
        return helper(head, key);
    }

    public static void main(String[] args) {
        searchRec ll = new searchRec();
        ll.addFirst(1);
        ll.addFirst(6);
        ll.addFirst(0);
        ll.addFirst(3);
        ll.print();
        System.out.println(ll.recSearch(6));
    }
}
