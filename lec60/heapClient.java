package lec60;

public class heapClient {
    public static void main(String[] args) {
        heap hp = new heap();

        hp.add(5);
        hp.add(7);
        hp.add(6);
        hp.add(1);
        hp.add(4);
        hp.add(9);
        hp.add(3);

        hp.display();
    }

}
