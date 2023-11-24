package lec48;

/*
* linked list
* linear data structure and non continous
*/
public class Linked_List {
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
        } 
        else
        {
            nn.next = head;
            this.size++;
            head = nn;
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

    public Node GetNode(int k)throws Exception {
        if (k < 0 || k >= this.size) {
            throw new Exception("K is not in range getnode");
        }
        Node temp = head;
        for (int i = 1; i <= k; i++)
            temp = temp.next;

        return temp;
    }

    public void AddAtIndex(int item, int k) throws Exception {
        if (k < 0 || k > this.size) {
            throw new Exception("K is not in range");
        }

        if (k == 0)
            AddFirst(item);
        else if (k == size)
            AddLast(item);
        else {
            Node nn = new Node();
            nn.val = item;
            Node k_1th = GetNode(k - 1);
            Node kth = k_1th.next;
            k_1th.next = nn;
            nn.next = kth;
            this.size++;
        }
    }

    public int getFirst() {
        return head.val;
    }

    public int getLast() {
        return tail.val;
    }

    public int getAtIndex(int k) throws Exception {
        return GetNode(k).val;
    }

    public int removeFirst() throws Exception
    {
        if(size==0) throw new Exception("Linked List empty h");
        int rtn = head.val;
        if(size==1)
        {
            head = null;
            tail = null;
            this.size--;
            return rtn;
        }
        else
        {
            Node temp = head;
            head = head.next;
            temp.next = null;
            this.size--;

        }
        
        return rtn;
    }
    public int removeLast() throws Exception{
        if(size==0) throw new Exception("Linked List empty h");
        int rtn = tail.val;
        if(size==1)
        {
            head = null;
            tail = null;
            this.size--;
            return rtn;
        }
        else
        {
            Node n = GetNode(this.size-2);
            tail = n;
            tail.next = null;
            this.size--;
            return rtn;            
        }
    }

    public int removeAtIndex(int k) throws Exception{
        if(size==0) throw new Exception("Linked List empty h");
        if(size==1) return removeFirst();
        else
        if(k==size-1) return removeLast();
        else
        {
            Node k_1th = GetNode(k-1);
            Node kth = k_1th.next;
            k_1th.next = kth.next;
            kth.next = null;
            size--;
            return kth.val;
        }
    }

}
