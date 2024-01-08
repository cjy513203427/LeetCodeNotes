package InterviewClassic_150_Questions;

import java.util.Arrays;

public class Q1_Merge_Sorted_Array {
    static class Solution {
        public static void print(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i]);
                if (i < nums.length - 1) {
                    System.out.print(" ");
                }
            }
        }

        // Use sort() from Array
        public static int[] merge_1(int[] nums1, int m, int[] nums2, int n) {
            for (int i = 0; i < n; i++) {
                nums1[m + i] = nums2[i];
            }
            Arrays.sort(nums1);
            return nums1;
        }

        // Idea of merge sort
        public static int[] merge_2(int[] nums1, int m, int[] nums2, int n) {
            int i = m - 1, j = n - 1, k = m + n - 1;

            while (i >= 0 && j >= 0) {
                if (nums1[i] > nums2[j]) {
                    nums1[k--] = nums1[i--];
                } else {
                    nums1[k--] = nums2[j--];
                }
            }
            return nums1;
        }


        public static void main(String[] args) {
            // TestCase
            // nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
            int nums1[] = new int[]{1, 2, 3, 0, 0, 0};
            int m = 3;
            int nums2[] = new int[]{2, 5, 6};
            int n = 3;

            int[] result = merge_2(nums1, m, nums2, n);
            Solution.print(result);
        }
    }

}
