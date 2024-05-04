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
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Bubble sort array:");
        for (int i : arr) {
            System.out.print(i+" ");

        }

    }
}