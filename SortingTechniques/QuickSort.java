package SortingTechniques;

public class QuickSort
{
    public int partition(int[] arr, int low, int high)
    {
        int pivot=arr[(low+high)/2];
        while(low<=high)
        {
            while(arr[low]<pivot)
            {
                low++;
            }
            while(arr[high]>pivot)
            {
                high--;
            }
            if(low<=high)
            {
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
        }
        return low;
    }

    public void QuickSortRecursion(int[] arr,int low,int high)
    {
        int pvt=partition(arr,low,high);
        if(low<pvt-1)
        {
            QuickSortRecursion(arr,low,pvt-1);
        }
        if(pvt<high)
        {
            QuickSortRecursion(arr,pvt,high);
        }
    }
    public void display(int[] arr)
    {
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={4,7,1,9,11,67,13,44};
        int length= arr.length;
        QuickSort q1=new QuickSort();
        q1.display(arr);
        q1.QuickSortRecursion(arr,0,length-1);
        q1.display(arr);

    }
}
