package array;

import java.util.ArrayList;

import static java.lang.Integer.MIN_VALUE;

public class MaxContiguousSumSubArray {
    public int sum(ArrayList<Integer> arr) {
        int maxSum = MIN_VALUE;
        int sumTillNow = 0;
        int l = 0;
        int r = 0;

        for (int i = 0; i < arr.size(); i++) {
            sumTillNow += arr.get(i);
            if (sumTillNow > maxSum) {
                maxSum = sumTillNow;
                r = i;
            }
            if (sumTillNow < 0) {
                sumTillNow = 0;
                l = i + 1 >= arr.size() ? r : i + 1;
            }
        }
        System.out.println("Max contiguous sum range: " + l + ", " + r);
        return maxSum;
    }
}
