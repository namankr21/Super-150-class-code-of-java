package lec20;

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // heap ke andar space miljayga and uska address list name me store ho jayga!
        System.out.println(list.size());
        System.out.println(list);
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(1, 24); // index ka range 0 to size
        System.out.println(list);
        list.remove(3); // index ka range 0 to size-1
        System.out.println(list);
        list.add(50);
        list.add(90);
        list.add(60);
        System.out.println(list);
        System.out.println(list.get(3));
        list.set(3, -91); // value ko update krna!!
        System.out.println(list);

    }

}
