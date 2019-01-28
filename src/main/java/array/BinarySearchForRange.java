package array;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchForRange {
  public List<Integer> search(List<Integer> arr, int target) {
    int x = -1;
    int y = -1;
    int l=0;
    int r = arr.size()-1;

    int temp;
    while((temp = search(arr, target, l, r)) != -1) {
      x = temp;
      r = temp-1;
    }

    l=0;
    r=arr.size()-1;
    while((temp = search(arr, target, l, r)) != -1) {
      y = temp;
      l = temp+1;
    }

    ArrayList<Integer> result = new ArrayList<>();
    result.add(x);
    result.add(y);
    return result;
  }

  private int search(final List<Integer> a, int b, int l, int r) {
    int idx = -1;
    while(l<=r) {
      int mid = (l+r)/2;
      if(a.get(mid) > b)
        r = mid-1;
      else if(a.get(mid) < b)
        l = mid + 1;
      else {
        idx = mid;
        break;
      }
    }
    return idx;
  }
}
