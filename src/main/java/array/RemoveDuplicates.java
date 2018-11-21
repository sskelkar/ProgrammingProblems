package array;

import java.util.ArrayList;

public class RemoveDuplicates {
    public int remove(ArrayList<Integer> input) {
        int length = 1;
        int lastUnique = input.get(0);
        for (int i = 1; i < input.size(); i++) {
            if (input.get(i) != lastUnique) {
                lastUnique = input.get(i);
                swap(length, i, input);
                length++;
            }
        }
        return length;
    }

    private void swap(int l, int r, ArrayList<Integer> arr) {
        int temp = arr.get(l);
        arr.set(l, arr.get(r));
        arr.set(r, temp);
    }
}
