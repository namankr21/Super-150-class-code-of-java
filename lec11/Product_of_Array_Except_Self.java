package lec11;
public class Product_of_Array_Except_Self {
    public static void main(String[] args) {
        long nums[] = { 1, 0, 5, 6, 2 };
        long ans[] = new long[nums.length];
        ans = Array_Product_Except(nums);
        for (long i : ans) {
            System.out.print(i + " ");
        }
    }
    public static long[] Array_Product_Except(long[] nums) {
        long left[] = new long[nums.length];
        left[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = nums[i - 1] * left[i - 1];
        }
        long right[] = new long[nums.length];
        right[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--)
            right[i] = nums[i + 1] * right[i + 1];

        for (int i = 0; i < nums.length; i++)
            nums[i] = right[i] * left[i];

        return nums;
    }

}
