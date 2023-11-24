package lec58;

public class Generics_Demo {
    

    public static void main(String[] args) {
        
        Integer[] arr = {10,32,65,2,65,21};
        Display(arr);
        String[] arr1 = {"Ram","Ankur","RAj","Somnath"};
        Display(arr1);

    }

    private static<T> void Display(T[] arr) {
     for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();   
    }
    // public static void Display(Integer[] arr)
    // {
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.print(arr[i] + " ");
    //     }
    // }
}
