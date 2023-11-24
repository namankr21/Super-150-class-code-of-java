package lec59;

public class car { //implements Comparable<car> 
    int price;
    int speed;
    String color;

    public car()
    {

    }

    public car(int price, int speed, String color)
    {
        this.price = price;
        this.speed = speed;
        this.color = color;

    }

    // @override
    public String toString()
    {
        return "p : " + this.price + " S : " + this.speed + " C : "+this.color;
    }

    // @Override
    // public int compareTo(car o) {
        
    //     // return this.speed-o.speed;
    //     return this.price-o.price;
    // }


    
    public static<T extends Comparable<T>> void sort(T[] arr) {
        for (int pass = 1; pass < arr.length; pass++) {
            for (int i = 0; i < arr.length - pass; i++) {
                if (arr[i].compareTo(arr[i + 1])>0) {
                    T temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }



    
    
}
