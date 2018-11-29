package array;

import java.util.List;

import static java.lang.Math.abs;

//https://www.interviewbit.com/problems/find-duplicate-in-array/
//https://www.geeksforgeeks.org/find-duplicates-in-on-time-and-constant-extra-space/
public class DuplicateFinder {

    public int findInEditableList(List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(abs(arr.get(i))) < 0)
                return abs(arr.get(i));
            arr.set(abs(arr.get(i)), -arr.get(abs(arr.get(i))));
        }
        return -1;
    }

    public int findInUnEditableList(List<Integer> arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.size(); i++)
            sb.append('0');
        for (int i = 0; i < arr.size(); i++) {
            if (sb.charAt(arr.get(i)) == '1')
                return arr.get(i);
            sb.setCharAt(arr.get(i), '1');
        }
        return -1;
    }
}
