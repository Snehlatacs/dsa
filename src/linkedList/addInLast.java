package linkedList;

public class addInLast {
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

    public void addLast(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;

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
        addInLast ll = new addInLast();
        ll.addLast(1);
        ll.addLast(6);
        ll.addLast(10);
        ll.addLast(3);
        ll.print();
    }

    public static class mergeKsortedLl {
        public static Node SortedMerge(Node a, Node b){
            Node result = null;
            if (a == null)
                return b;
            else if (b == null)
                return a;
            if (a.data <= b.data) {
                result = a;
                result.next = SortedMerge(a.next, b);
            }
            else {
                result = b;
                result.next = SortedMerge(a, b.next);
            }
            return result;
        }
        public static Node mergeKLists(Node arr[], int last)
        {
            while (last != 0) {
                int i = 0, j = last;
                while (i < j) {
                    arr[i] = SortedMerge(arr[i], arr[j]);
                    i++;
                    j--;
                    if (i >= j)
                        last = j;
                }
            }
            return arr[0];
        }
        public static void printList(Node node){
            while (node != null) {
                System.out.print(node.data + " ");
                node = node.next;
            }
        }
        public static void main(String args[]){
            int k = 3;
            int n = 4;
            Node arr[] = new Node[k];
            arr[0] = new Node(1);
            arr[0].next = new Node(3);
            arr[0].next.next = new Node(5);
            arr[0].next.next.next = new Node(7);
            arr[1] = new Node(2);
            arr[1].next = new Node(4);
            arr[1].next.next = new Node(6);
            arr[1].next.next.next = new Node(8);
            arr[2] = new Node(0);
            arr[2].next = new Node(9);
            arr[2].next.next = new Node(10);
            arr[2].next.next.next = new Node(11);
            Node head = mergeKLists(arr, k - 1);
            printList(head);
        }
    }

    public static class oddEvenLl {
        Node head;
        class Node{
            int data;
            Node next;
            Node(int d){
                data = d;
                next = null;
            }
        }
        void segregateEvenOdd(){
            Node end = head;
            Node prev = null;
            Node curr = head;
            while (end.next != null)
                end = end.next;
            Node new_end = end;
            while (curr.data %2 !=0 && curr != end){
                new_end.next = curr;
                curr = curr.next;
                new_end.next.next = null;
                new_end = new_end.next;
            }
            if (curr.data %2 ==0){
                head = curr;
                while (curr != end){
                    if (curr.data % 2 == 0){
                        prev = curr;
                        curr = curr.next;
                    }
                    else{
                        prev.next = curr.next;
                        curr.next = null;
                        new_end.next = curr;
                        new_end = curr;
                        curr = prev.next;
                    }
                }
            }
            else prev = curr;
            if (new_end != end && end.data %2 != 0){
                prev.next = end.next;
                end.next = null;
                new_end.next = end;
            }
        }
        void push(int new_data){
            Node new_node = new Node(new_data);
            new_node.next = head;
            head = new_node;
        }
        void printList(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        public static void main(String args[]){
            oddEvenLl llist = new oddEvenLl();
            llist.push(11);
            llist.push(10);
            llist.push(13);
            llist.push(6);
            llist.push(5);
            llist.push(2);
            llist.push(0);
            System.out.println("Linked List");
            llist.printList();
            llist.segregateEvenOdd();
            System.out.println("updated Linked List");
            llist.printList();
        }
    }
}
