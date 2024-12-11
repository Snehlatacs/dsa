package linkedList;
import java.util.LinkedList;

public class mergeSorting {
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


    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node head1, Node head2)
    {
        Node mergedLl = new Node(-1);
        Node temp = mergedLl;

        while(head1!=null && head2!= null)
        {
            if(head1.data<=head2.data)
            {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else
            {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1!=null)
        {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2!=null)
        {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLl.next;
    }

    public Node mergeSort(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        return merge(newLeft,newRight);
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
        mergeSorting ll = new mergeSorting();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.print();
        ll.head = ll.mergeSort(ll.head);
        ll.print();
    }
}
