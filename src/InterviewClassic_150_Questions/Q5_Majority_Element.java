package InterviewClassic_150_Questions;

import java.util.Arrays;

public class Q5_Majority_Element {
    static class Solution{
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

        public static int majorityElement_1(int[] nums) {
            // choose 1st element as base num
            int num = nums[0];
            int cnt = 1;
            for(int i = 1; i < nums.length; ++i){
                if(nums[i] == num){
                    // vote ++
                    cnt++;
                }
                else{
                    // vout --
                    cnt--;
                    if(cnt == 0){
                        // change base num
                        num = nums[i];//更换霸王
                        // reset vote
                        cnt = 1;
                    }
                }
            }
            //return the num which gets the most votes
            return num;
        }

        public static int majorityElement_2(int[] nums) {
            Arrays.sort(nums);
            return nums[nums.length / 2];
        }

        public static void main(String[] args) {
            int[] nums = new int[]{2,2,1,1,1,2,2};
            System.out.println(majorityElement_2(nums));
        }
    }
}
