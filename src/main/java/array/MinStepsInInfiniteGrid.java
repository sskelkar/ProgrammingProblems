package array;

import java.util.ArrayList;

import static java.lang.Math.abs;
import static java.lang.Math.max;

public class MinStepsInInfiniteGrid {
    public int steps(ArrayList<Integer> x, ArrayList<Integer> y) {
        int steps = 0;
        for (int i = 0; i < x.size() - 1; i++) {
            steps += max(abs(x.get(i) - x.get(i+1)), abs(y.get(i) - y.get(i+1)));
        }
        return steps;
    }
}
