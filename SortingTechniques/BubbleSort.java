package SortingTechniques;

import java.util.Arrays;

public class BubbleSort
{
    public void sort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            boolean flag=true;
            for(int j=0;j< arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    flag=true;
                }
            }
            if(flag==false)
            break;
        }
    }
    public static void main(String[] args) {
        int[] arr={3,1,9,6,8,4,7};
        BubbleSort b1=new BubbleSort();
        System.out.println(Arrays.toString(arr));
        b1.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
