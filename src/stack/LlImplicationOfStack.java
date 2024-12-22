package stack;

public class LlImplicationOfStack {
    public static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public static boolean isEmpty()
    {
        return head == null;
    }

    public void push(int data)
    {
        Node newNode = new Node(data);
        if(isEmpty())
        {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    public int pop()
    {
        if(isEmpty())
        {
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    public int peek()
    {
        if(isEmpty())
        {
            return -1;
        }
        return head.data;
    }
    public static void main(String[] args) {
        LlImplicationOfStack imp = new LlImplicationOfStack();
        imp.push(4);
        imp.push(3);
        imp.push(2);
        imp.push(1);
        while(!imp.isEmpty())
        {
            System.out.print(imp.peek()+"->");
            imp.pop();
        }
        System.out.println("null");
    }
}
