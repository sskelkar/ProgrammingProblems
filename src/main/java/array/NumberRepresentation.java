package array;

import java.util.ArrayList;

public class NumberRepresentation {
    public ArrayList<Integer> add(ArrayList<Integer> arr, int num) {
        while (arr.size() > 1) {
            if (arr.get(0) > 0)
                break;
            else
                arr.remove(0);
        }
        ArrayList<Integer> res = new ArrayList<>();
        int carry = 0;
        for (int i = arr.size() - 1; i >= 0; i--) {
            int sum = arr.get(i) + carry + (i == arr.size() - 1 ? num : 0);
            carry = sum / 10;
            res.add(sum % 10);
        }
        if (carry > 0)
            res.add(carry);

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = res.size() - 1; i >= 0; i--)
            result.add(res.get(i));
        return result;
    }
}
