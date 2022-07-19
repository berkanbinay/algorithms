package sorting_algorithms;

public class BubbleSort {

    static int[] bubbleSort(int arr[]) {
        int length = arr.length;
        int temp;
        for (int i = 0; i < length - 1; i++)
            for (int j = 0; j < length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        return arr;
    }

    static void bubbleSort(int arr[], int n) {
        if (n == 1)
            return;

        int count = 0;
        for (int i=0; i<n-1; i++)
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                count = count+1;
            }
        if (count == 0)
            return;
        bubbleSort(arr, n-1);
    }

    static void print(int arr[]) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {55, 16, 23, 48, 41, 34};
        System.out.print("Unsorted array -> ");
        print(arr);

        // bubbleSort(arr);
        bubbleSort(arr, arr.length);
        System.out.print("\nSorted Array -> ");
        print(arr);
    }
}
