package lec50;

public class reverse_LinkedList {
    public class Node {
        int val;
        Node next;
    }

    private Node head;
    private int size;
    private Node tail;
    public void AddFirst(int item) {
        Node nn = new Node();
        nn.val = item;
        if (size == 0) {
            this.head = nn;
            this.tail = nn;
            this.size++;
        } else {                                                        
            nn.next = head;
            this.size++;
            head = nn;
        }
    }

    public void AddLast(int item) {
        if (size == 0) {
            AddFirst(item);
        } else {
            Node nn = new Node();
            nn.val = item;
            tail.next = nn;
            tail = nn;
            this.size++;
        }

    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("End.");
    }

    public void reverse(Node head)
    {
        Node curr = head;
        Node prev = null;

        while(curr!=null)
        {
            Node ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }

        display();
    }
}
