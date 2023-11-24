package lec61;
import java.util.*;
public class setdemo {
    // Set three types
    // 1: HashSet, 2: TreeSet, 3: LinkedHashSet

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(4);
        set.add(1325);
        set.add(974);
        set.add(54);
        
        System.out.println(set);
    }
}
