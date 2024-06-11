import java.util.Arrays;

public class InsertSortAlgorithm {
    public static void main(String [] args)
    {
        int []arr={9,8,7,6,5,4,3};
        InsertSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void InsertSort(int[] arr) {
        int n=arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

}
