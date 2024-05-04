public class SelectSortAlgorithm {
    public static void main(String [] args)
    {
        int []arr={9,8,7,6,5,4,3};
        SelectSort(arr);
    }
    public static void SelectSort(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            int Min=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[Min])
                {
                    Min=j;
                }
            }
            int temp=arr[Min];
            arr[Min]=arr[i];
            arr[i]=temp;

        }
        System.out.println("Select sorting algorithm result ordered array :");
        for (int j : arr) {
            System.out.print(j+" ");
        }
    }
}
