package SortingTechniques;

public class SelectionSort
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
    public void selectionSort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {

            if(arr[i]>arr[j])
            {
                swap(arr,i,j);
            }
        }}

    }
    public static void main(String[] args) {
        int[] arr=new int[]{5,7,4,9,8,1,11,56,21};
        SelectionSort s1=new SelectionSort();

        s1.print(arr);
        s1.selectionSort(arr);
        s1.print(arr);



    }
}
