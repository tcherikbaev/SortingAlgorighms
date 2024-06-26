public class BubbleSortAlgorithm {
    public static void main(String [] args)
    {
        int []arr={9,8,7,6,5,4,3};
        BubbleSort(arr);
    }
    public static void BubbleSort(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int l=0;l<n-i-1;l++)
            {
                if(arr[l]>arr[l+1]) {
                    int temp=arr[l];
                    arr[l]=arr[l+1];
                    arr[l+1]=temp;
                }
            }
        }
        System.out.println("Bubble sort array:");
        for (int i : arr) {
            System.out.print(i+" ");

        }

    }
}
