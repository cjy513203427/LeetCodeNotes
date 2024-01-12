package InterviewClassic_150_Questions;

import java.util.Arrays;

public class Q6_Rotate_Array {

    static class Solution {
        public static int[] rotate_1(int[] nums, int k) {
            int n = nums.length;
            k %= n;
            // initialize 2*n size int array
            int[] arr = new int[n << 1];
            System.arraycopy(nums, 0, arr, 0, n);
            System.arraycopy(nums, 0, arr, n, n);
            System.arraycopy(arr, n - k, nums, 0, n);

            return nums;
        }

        public static int[] rotate_2(int[] nums, int k) {
            int n = nums.length;
            int[] newArr = new int[n];
            for (int i = 0; i < n; ++i) {
                newArr[(i + k) % n] = nums[i];
            }
            System.arraycopy(newArr, 0, nums, 0, n);

            return nums;
        }

        public static void main(String[] args) {
            int[] nums = new int[]{1,2,3,4,5,6,7};
            System.out.println(Arrays.toString(rotate_2(nums, 3)));
        }
    }
}
