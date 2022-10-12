package com.sorting;
//MergeSort - Time Complexity - O(n(logn))
public class MergeSort {
    void merge(int[] arr,int l,int m,int r)
    {
        int n1 = m-l+1;
        int n2=r-m;

        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i=0;i<n1;++i)
        {
            L[i]=arr[l+i];
        }
        for(int j=0;j<n2;++j)
        {
            R[j]=arr[m+1+j];
        }
        int a=0, b=0;
        int k=l;
        while(a<n1 && b<n2 )
        {
            if(L[a]<=R[b])
            {
                arr[k]=L[a];
                a++;
            }
            else {
                arr[k]=R[b];
                b++;
            }
            k++;
        }
        while (a<n1)
        {
            arr[k]=L[a];
            a++;
            k++;
        }
        while (b<n2)
        {
            arr[k]=R[b];
            b++;
            k++;
        }
    }
    public void sort(int[] arr,int l,int r)
    {
        if(l<r)
        {
            int m =l+ (r-l)/2;
            sort(arr,l,m);
            sort(arr,m+1,r);
            merge(arr,l,m,r);
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
        int[] a ={1,8,9,3};
        MergeSort obj = new MergeSort();
        obj.sort(a,0, a.length-1);
        System.out.println("The sorted array is");
        obj.printArray(a);

    }
}
