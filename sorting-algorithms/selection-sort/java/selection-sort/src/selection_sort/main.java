package selection_sort;

public class main {

    static void selectionSort(int arr[]) {
        int n = arr.length;
        for(int i = 0; i < n -1; i ++) {
            int index_min = i;
            for (int j = i; j < n; j++) {
                if(arr[j] < arr[index_min]) {
                    index_min = j;
                }
            }
            if(index_min != i) {
                int temp = arr[i];
                arr[i] = arr[index_min];
                arr[index_min] = temp;
            }
        }
    }
    static void print(int arr[]) {
        for(int item : arr){
            System.out.print(item + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {16,9, 23, 7, 55, 44};
        System.out.print("before sorting -> ");
        print(arr);
        System.out.println();
        System.out.print("after sorting -> ");
        selectionSort(arr);
        print(arr);

    }
}
