/*Not too Much Efficient!! */
package lec10;

public class rotate_array_leetcode {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        int k = 3;
        k = k % n;
        rotate(arr, k);
    }

    public static void rotate(int[] nums, int k) {
        while (k-- > 0) {
            int item = nums[nums.length - 1];
            for (int i = nums.length - 2; i >= 0; i--) {
                nums[i + 1] = nums[i];

            }
            nums[0] = item;
        }
        for (int i : nums) {
            System.out.print(i + "  ");
        }
    }
}