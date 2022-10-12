package com.datastrc;
//Arrays
import java.util.Scanner;
public class P1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();;
        int[] arr = new int[n];
        int[] b= new int[n];
        System.out.println("Enter the values");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++) {
            System.out.print(arr[j] + " ");
        }
        int j= 0;
        for(int i=n-1;i>=0;i--)
        {
            b[j]=arr[i];
            j++;
        }
        for(int k=0;k<n;k++) {
            System.out.print(b[k] + " ");
        }


    }
}
