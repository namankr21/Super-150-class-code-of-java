package lec50;

public class linked_List_Cycle {
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
    public Node GetNode(int k)throws Exception {
        if (k < 0 || k >= this.size) {
            throw new Exception("K is not in range to get node");
        }
        Node temp = head;
        for (int i = 1; i <= k; i++)
            temp = temp.next;

        return temp;
    }

    public void createCycle() throws Exception
    {
        Node nn = GetNode(2);
        tail.next = nn;
    }

    public Node hasCycle(Node head)
    {
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null)
        {
            if(fast==slow) return slow; 
        }

        return null;
    }

    public void removalCycleNSquare(Node head)
    {
        Node meet = hasCycle(head);
        if(meet==null) 
        {
            System.out.println("Not found");
            return;
        }

        // Cycke ka count
        int count = 1;
        Node temp = meet;
        while(temp.next!=meet)
        {
            count++;
            temp = temp.next;
        }

        // m length aage jana h
        Node fast = head;
        for(int i=0;i<=count;i++)
        fast = fast.next;

        Node slow = head;
        while(slow==fast) return ;             
    }

}
