package search_algorithms;

public class BinarySearch {

    static int recursiveBinarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return recursiveBinarySearch(arr, l, mid - 1, x);
            return recursiveBinarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    static int iterativeBinarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x)
                return m;
            if (arr[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int n = arr.length;
        int x = 23;
        int result = recursiveBinarySearch(arr, 0, n - 1, x);
        result = iterativeBinarySearch(arr , x);

    }
}
