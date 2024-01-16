package InterviewClassic_150_Questions;

public class Q10_Jump_Game_II {
    static class Solution {
        public static int jump_1(int[] nums) {
            int position = nums.length - 1;
            int steps = 0;
            while (position > 0) {
                for (int i = 0; i < position; i++) {
                    if (i + nums[i] >= position) {
                        position = i;
                        steps++;
                        break;
                    }
                }
            }
            return steps;
        }

        public static int jump_2(int[] nums) {
            int length = nums.length;
            int end = 0;
            int maxPosition = 0;
            int steps = 0;
            for (int i = 0; i < length - 1; i++) {
                maxPosition = Math.max(maxPosition, i + nums[i]);
                if (i == end) {
                    end = maxPosition;
                    steps++;
                }
            }
            return steps;
        }

        public static void main(String[] args) {
            int[] nums = new int[]{2,3,1,1,4};
            System.out.println(jump_2(nums));
        }
    }
}