package InterviewClassic_150_Questions;

public class Q8_Best_Time_to_Buy_and_Sell_Stock_II {
    static class Solution {

        public static int maxProfit_1(int[] prices) {
            int result = 0;
            for (int i = 1; i < prices.length; i++) {
                result += Math.max(prices[i] - prices[i - 1], 0);
            }
            return result;
        }

        public static int maxProfit_2(int[] prices) {
            int revenue = 0;
            for (int i = 1; i < prices.length; i++) {
                if(prices[i]>prices[i-1])
                    revenue += prices[i]-prices[i-1];

            }
            return revenue;
        }

        public static void main(String[] args) {
            int[] nums = new int[]{7,1,5,3,6,4};
            System.out.println(maxProfit_2(nums));
        }
    }

}
