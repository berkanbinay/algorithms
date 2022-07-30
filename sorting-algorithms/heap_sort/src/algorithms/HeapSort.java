package algorithms;

public class HeapSort {

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        RecursiveHeapSort recursiveHeapSort = new RecursiveHeapSort();
        recursiveHeapSort.sort(arr);

        System.out.print("Sorted array: ");
        printArray(arr);

        int arr2[] = {10, 20, 15, 17, 9, 21};
        int n = arr.length;
        IterativeHeapSort iterativeHeapSort = new IterativeHeapSort();
        iterativeHeapSort.heapSort(arr, n);

        System.out.print("Sorted array: ");
        printArray(arr2);


    }
}
