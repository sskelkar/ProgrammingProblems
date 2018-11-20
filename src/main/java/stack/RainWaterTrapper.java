package stack;

import java.util.List;

import static java.lang.Math.max;
import static java.lang.Math.min;

//https://www.interviewbit.com/problems/rain-water-trapped/
public class RainWaterTrapper {
    public int trappedWater(List<Integer> elevation) {
        int[] leftMax = new int[elevation.size()];
        leftMax[0] = elevation.get(0);
        for (int i = 1; i < elevation.size(); i++) {
            leftMax[i] = max(leftMax[i - 1], elevation.get(i));
        }

        int[] rightMax = new int[elevation.size()];
        rightMax[elevation.size() - 1] = elevation.get(elevation.size() - 1);
        for (int i = elevation.size() - 2; i >= 0; i--) {
            rightMax[i] = max(rightMax[i + 1], elevation.get(i));
        }

        int waterTrapped = 0;
        for (int i = 0; i < elevation.size(); i++) {
            waterTrapped += min(leftMax[i], rightMax[i]) - elevation.get(i);
        }
        return waterTrapped;
    }
}
