package lec59;

import java.util.Arrays;
import java.util.Comparator;

public class carClient {

    public static void main(String[] args) {
        car[] ar = new car[5];

        ar[0] = new car(200, 10, "White");
        ar[1] = new car(1000, 20, "Black");
        ar[2] = new car(345, 3, "Yellow");
        ar[3] = new car(34, 89, "Grey");
        ar[4] = new car(8907, 6, "Red");

        // car.sort(ar);

        Arrays.sort(ar,new Comparator<car>() {

            @Override
            public int compare(car o1, car o2) {
                return o1.speed-o2.speed;
            }
            
        });

        display(ar);
    
    }

    public static void display(car[] ar) {

        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }

    }

}
