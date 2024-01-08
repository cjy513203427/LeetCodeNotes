package InterviewClassic_150_Questions;

import java.util.*;

public class Q2_Remove_Element {
    static class ResultType{
        private int i;
        private ArrayList<Integer> nums;

        public ResultType(int i, ArrayList<Integer> nums) {
            this.i = i;
            this.nums = nums;
        }

        @Override
        public String toString() {
            return "ResultType{" +
                    "i=" + i +
                    ", nums=" + nums +
                    '}';
        }
    }


    static class Solution {

        public static ResultType removeElement(int[] nums, int val) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int num : nums) {
                if (num != val) {
                    list.add(num);
                }
            }
            for (int i = 0; i < list.size(); i++) {
                nums[i] = list.get(i);
            }

            return new ResultType(list.size(), list);
        }

        public static void main(String[] args) {
            int[] nums = new int[]{0,1,2,2,3,0,4,2}; int val = 2;
            ResultType result = removeElement(nums,val);
            System.out.println(result);

        }
    }
}
