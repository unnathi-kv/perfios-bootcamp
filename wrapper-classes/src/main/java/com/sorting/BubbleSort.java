package com.sorting;
//Bubble Sort -Time Complexity -O(n^2)
public class BubbleSort {
    int temp;
    public void sort(int[] arr)
    {
        for(int i=0;i< arr.length-1;i++)
        {
            for(int j =0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
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
        int[] a ={1,8,9,3,6};
        BubbleSort obj = new BubbleSort();
        obj.sort(a);
        System.out.println("The sorted array is");
        obj.printArray(a);

    }
}
