package lec48;
public class Linked_List_Client {
    public static void main(String[] args)throws Exception {
        Linked_List ll = new Linked_List();
        ll.AddFirst(10);
        ll.AddFirst(-20);
        ll.AddLast(30);
        ll.AddLast(-40);
        ll.AddLast(50);
        ll.display();
        // ll.removeFirst();
        // ll.display();
        // ll.removeLast();
        // ll.display();
        System.out.println(ll.removeAtIndex(2));
        ll.display();
    }
}
 