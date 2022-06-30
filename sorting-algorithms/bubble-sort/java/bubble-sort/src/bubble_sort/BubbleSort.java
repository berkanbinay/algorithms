package bubble_sort;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {55, 16, 23, 48, 41, 34};
        System.out.print("Unsorted array -> ");
        print(arr);

        int sortedArr[] = bubbleSort(arr);
        System.out.print("\nSorted Array -> ");
        print(sortedArr);
    }
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
                System.out.print("Step " + (i + 1) + ": ");
                print(arr);
            }
        return arr;
    }

    static void print(int arr[]) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
