package algorithms;

public class InterpolationSearch {
    static int counter = 0;
    static public int interpolationSearch(int[] data, int item) {

        int highEnd = (data.length - 1);
        int lowEnd = 0;

        while (item >= data[lowEnd] && item <= data[highEnd] && lowEnd <= highEnd) {
            int probe
                    = lowEnd + (highEnd - lowEnd) * (item - data[lowEnd]) / (data[highEnd] - data[lowEnd]);
            System.out.println(probe);

            if (highEnd == lowEnd) {
                if (data[lowEnd] == item) {
                    return lowEnd;
                } else {
                    return -1;
                }
            }

            if (data[probe] == item) {
                return probe;
            }

            if (data[probe] < item) {
                lowEnd = probe + 1;
            } else {
                highEnd = probe - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10, 12, 13, 16, 18, 19, 20, 21,
                22, 23, 24, 33, 35, 42, 47};
        int x = 42;
        int index = interpolationSearch(arr,  x);

        if (index != -1)
            System.out.println("Element found at index "
                    + index);
        else
            System.out.println("Element not found.");
    }
}
