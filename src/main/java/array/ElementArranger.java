package array;

import java.util.*;

public class ElementArranger {

    static Comparator<Integer> comparator = (X, Y) -> {
        if(X.equals(0) && Y.equals(0)) return 0;

        String XY=X.toString() + Y.toString();
        String YX=Y.toString() + X.toString();
        return XY.compareTo(YX) > 0 ? -1:1;
    };

    public String arrange(List<Integer> arr) {
        TreeSet<Integer> tree = new TreeSet<>(comparator);
        tree.addAll(arr);

        StringBuilder result = new StringBuilder();
        Iterator<Integer> it = tree.iterator();
        while (it.hasNext()) {
            result.append(it.next());
        }
        return result.toString();
    }
}
