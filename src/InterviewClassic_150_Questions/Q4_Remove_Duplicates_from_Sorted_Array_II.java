package InterviewClassic_150_Questions;

import java.util.Arrays;

public class Q4_Remove_Duplicates_from_Sorted_Array_II {
    static class ResultType{
        private int i;
        private int[] nums;

        public ResultType(int i, int[] nums) {
            this.i = i;
            this.nums = nums;
        }

        @Override
        public String toString() {
            return "ResultType{" +
                    "i=" + i +
                    ", nums=" + Arrays.toString(nums) +
                    '}';
        }
    }
    static class Solution{
        public static ResultType removeDuplicates_1(int[] nums) {
            int n = nums.length;
            if (n <= 2) {
                return new ResultType(-1, nums);
            }
            int slow = 2, fast = 2;
            while (fast < n) {
                if (nums[slow - 2] != nums[fast]) {
                    nums[slow] = nums[fast];
                    ++slow;
                }
                ++fast;
            }
            return new ResultType(slow, nums);
        }

        public static ResultType removeDuplicates_2(int[] nums) {
            // skip 1st and 2nd element
            int count = 2;
            for(int i = 2 ; i < nums.length ; i++) {
                if(nums[i] != nums[count-2]) {
                    nums[count++] = nums[i];
                }
            }
            return new ResultType(count, nums);
        }

        public static void main(String[] args) {
            int[] nums = new int[]{1,1,1,2,2,3};
            System.out.println(removeDuplicates_1(nums));
        }
    }

}
