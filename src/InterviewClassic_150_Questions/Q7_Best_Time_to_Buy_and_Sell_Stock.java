package InterviewClassic_150_Questions;

public class Q7_Best_Time_to_Buy_and_Sell_Stock {

    static class Solution {
        public static int maxProfit_1(int[] prices) {
            int max=0,slow=0,fast=1;
            if (prices.length <=1){ return max;}
            while (fast<prices.length){
                if (prices[slow]>=prices[fast]){
                    slow = fast;
                }else {
                    max = Math.max(max,prices[fast]-prices[slow]);
                }
                fast++;
            }

            return max;
        }

        public static int maxProfit_2(int[] prices) {
            int minprice = Integer.MAX_VALUE;
            int maxprofit = 0;
            for (int i = 0; i < prices.length; i++) {
                if (prices[i] < minprice) {
                    minprice = prices[i];
                } else if (prices[i] - minprice > maxprofit) {
                    maxprofit = prices[i] - minprice;
                }
            }
            return maxprofit;
        }

        public static void main(String[] args) {
            int[] nums = new int[]{7,1,5,3,6,4};
            System.out.println(maxProfit_2(nums));
        }
    }
}
