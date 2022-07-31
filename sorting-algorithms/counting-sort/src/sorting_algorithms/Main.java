package sorting_algorithms;

import java.util.Arrays;


public class Main {
    static void countSort(int arr[], int n) {
        int[] output = new int[n + 1];

        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        int[] count = new int[max + 1];

        for (int i = 0; i < max; ++i) {
            count[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = { 4, 2, 2, 8, 3, 3, 1 };
        int n = arr.length;

        countSort(arr, n);
        System.out.println("Sorted arr in Ascending Order: ");
        System.out.println(Arrays.toString(arr));
    }
}
