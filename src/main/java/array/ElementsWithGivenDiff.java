package array;

import java.util.ArrayList;

//https://www.interviewbit.com/problems/diffk/
public class ElementsWithGivenDiff {
    public boolean diffk(ArrayList<Integer> input, int diff) {
        int i = 0;
        int j = 1;

        while (i < input.size() && j < input.size()) {
            if ((input.get(j) - input.get(i)) == diff)
                return true;
            else if ((input.get(j) - input.get(i)) > diff)
                i++;
                if(i==j)
                    j++;
            else if ((input.get(j) - input.get(i)) < diff)
                j++;
        }
        return false;
    }
}
