package array;

public class RotatedArray {

    public int search(int[] arr, int num) {
        int pivot = 0;
        for (int i = 0; i < arr.length && arr[i] > arr[arr.length - 1]; i++) {
            pivot++;
        }

        int l = 0;
        int r = arr.length - 1;
        if (num < arr[pivoted(l, pivot, arr)] || num > arr[pivoted(r, pivot, arr)])
            return -1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[pivoted(mid, pivot, arr)] == num)
                return pivoted(mid, pivot, arr);
            else if (num < arr[pivoted(mid, pivot, arr)])
                r = mid - 1;
            else
                l = mid + 1;
        }
        return -1;
    }

    private int pivoted(int num, int pivot, int[] arr) {
        return (num + pivot) % arr.length;
    }
}
