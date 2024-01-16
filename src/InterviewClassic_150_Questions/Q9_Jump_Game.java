package InterviewClassic_150_Questions;

public class Q9_Jump_Game {
    static class Solution {
        public static boolean canJump(int[] nums) {
            int n = nums.length;
            int rightmost = 0;
            for (int i = 0; i < n; ++i) {
                if (i <= rightmost) {
                    rightmost = Math.max(rightmost, i + nums[i]);
                    if (rightmost >= n - 1) {
                        return true;
                    }
                }
            }
            return false;
        }

        public static void main(String[] args) {
            int[] nums = new int[]{3,2,1,0,4};
            System.out.println(canJump(nums));
        }
    }
}
