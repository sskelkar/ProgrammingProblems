package array;

public class BinarySearch {
    public int search(int[] arr, int num) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == num)
                return mid;
            else if (num < arr[mid])
                r = mid - 1;
            else
                l = mid + 1;
        }
        return -1;
    }
}
