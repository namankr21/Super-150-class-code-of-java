package lec61;
import java.util.*;
public class HashMap_Demo {
    public static void main(String[] args) {
        // HashMap<String , Integer> map = new HashMap<>();
        HashMap<String,Integer> map = new HashMap<>();
        // map is interface
        // hashmap is class
        // key is unique
        // hm  implimentaion is through LinkdList
        // redblack tree is used to implement TreeMap and complexities of all functions is O(Log(N));
        // treemap me null nhi daal skta h
        // linkedhashmap me null  work krega ime insertion oeder lo preserve kia h
        

        map.put("raj", 68);
        map.put("manish",78);
        map.put("amisha",67);
        map.put("puneet",98);
        map.put("Atul",98);

        System.out.println(map);
    }
    
}
