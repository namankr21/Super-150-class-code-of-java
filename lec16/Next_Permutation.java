package lec16;

public class Next_Permutation {
    public static void main(String[] args) {
        int[] arr = {};
        permutation(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void permutation(int[] arr) {
        int p = -1;
        int q = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i + 1] > arr[i]) {
                p = i;
                break;
            }
        }
        if (p == -1)
            return;
        for (int i = arr.length - 1; i > p; i--) {
            if (arr[p] < arr[i]) {
                q = i;
                break;
            }
        }
        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;

        reverseprint2(arr, p + 1);

    }

    public static void reverseprint2(int[] arr, int i) {

        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }

}
