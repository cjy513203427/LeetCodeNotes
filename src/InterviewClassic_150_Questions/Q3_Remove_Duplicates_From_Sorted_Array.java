package InterviewClassic_150_Questions;

import java.util.Arrays;

public class Q3_Remove_Duplicates_From_Sorted_Array {
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

        public static void print(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i]);
                if (i < nums.length - 1) {
                    System.out.print(" ");
                }
            }
        }
        public static ResultType removeDuplicates(int[] nums) {
            // Double pointer
            int slow=1;
            for (int fast = 1; fast < nums.length; fast++) {
                if(nums[fast]!=nums[fast-1])
                    nums[slow++]=nums[fast];
            }
            return new ResultType(slow, nums);
        }

        public static void main(String[] args) {
            int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
            System.out.println(removeDuplicates(nums));

        }
    }


}
