package InterviewClassic_150_Questions;

import java.util.Arrays;

public class Q11_H_Index {

    static class Solution {

        public static int hIndex(int[] citations) {
            Arrays.sort(citations);
            int h = 0, i = citations.length - 1;
            while (i >= 0 && citations[i] > h) {
                h++;
                i--;
            }
            return h;
        }

        public static void main(String[] args) {
            int[] citations  = new int[]{3,0,6,1,5};
            System.out.println(hIndex(citations));
        }
    }
}
