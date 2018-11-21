package array;

import java.util.ArrayList;

public class ArrayIntersection {
    public ArrayList<Integer> intersection(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> result = new ArrayList<>();
        while(i<list1.size() && j < list2.size()) {
            if(list1.get(i).equals(list2.get(j))) {
                result.add(list1.get(i));
                i++;
                j++;
            } else if(list1.get(i) > list2.get(j)) {
                j++;
            } else {
                i++;
            }
        }
        return result;
    }
}
