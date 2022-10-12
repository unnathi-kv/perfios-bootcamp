package com.sorting;
//QuickSort - Time Complexity -O(n(logn))
public class QuickSort {
    static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int partition(int arr[],int low,int high)
    {
        int pivot=arr[high];
        int i = low-1;
        for(int j =low;j<=high-1;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }

    static void sort(int[] arr,int low,int high)
    {

        if(low<high)
        {
            int piv = partition(arr,low,high);
            sort(arr,low,piv-1);
            sort(arr,piv,high);
        }

    }
    public void printArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] a ={1,8,9,3,8};
        QuickSort obj = new QuickSort();
        QuickSort.sort(a,0,a.length-1);
        System.out.println("The sorted array is");
        obj.printArray(a);

    }

}
