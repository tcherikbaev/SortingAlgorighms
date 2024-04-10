//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            int []arr={9,8,7,6,5,4,3};
            BubbleSort(arr);
        int[] brr = new int[]{5, 4, 3, 2, 1, 0};
         SelectSort(brr);

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
            System.out.println(i);

        }

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
            System.out.println(j);
        }
    }
}