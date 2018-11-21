package array;

import java.util.ArrayList;

public class RemoveElementFromArray {

    public int remove(ArrayList<Integer> input, int k) {
        int length = 0;
        for(int i=0;i<input.size();i++) {
            if(!input.get(i).equals(k)) {
                swap(i, length, input);
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
