package linkedList;

public class palindrom {
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

    public Node findMid(Node head)
    {
        Node slow = head;
        Node fast = head;

        while(fast!= null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalinfrom()
    {
        if(head==null)
        {
            return true;
        }
        Node mid = findMid(head);
        Node curr = mid;
        Node prev = null;
        Node next;

        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        while(right!=null)
        {
            if(left.data!= right.data)
            {
                return false;
            }
            left=left.next;
            right=right.next;
        }
         return true;
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
        palindrom ll = new palindrom();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        System.out.println(ll.checkPalinfrom());
    }
}
