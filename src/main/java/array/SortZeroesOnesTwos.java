package array;

import java.util.ArrayList;

public class SortZeroesOnesTwos {
    public void sort(ArrayList<Integer> arr) {
        int zero = 0;
        int one = 0;
        int two = arr.size() - 1;

        while (one <= two) {
            switch (arr.get(one)) {
                case 0:
                    swap(zero, one, arr);
                    zero++;
                    one++;
                    break;
                case 1:
                    one++;
                    break;
                case 2:
                    swap(two, one, arr);
                    two--;
                    break;
            }
        }
    }

    private void swap(int l, int r, ArrayList<Integer> arr) {
        int temp = arr.get(l);
        arr.set(l, arr.get(r));
        arr.set(r, temp);
    }
}
