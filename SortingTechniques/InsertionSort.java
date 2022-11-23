package SortingTechniques;

public class InsertionSort
{
    public void print(int[] arr)
    {
        for(int element:arr)
        {
            System.out.print(element+"  ");
        }
        System.out.println();
    }
    public void swap(int[] arr,int iindex,int jindex)
    {
        int temp=arr[iindex];
        arr[iindex]=arr[jindex];
        arr[jindex]=temp;
    }

    public void insertionSort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr=new int[]{4,8,9,1,3,2,0,7,};
        InsertionSort i1=new InsertionSort();
        i1.print(arr);
        i1.insertionSort(arr);
        i1.print(arr);
    }
}
