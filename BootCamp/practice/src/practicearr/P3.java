package practicearr;

import java.util.Scanner;

public class P3 {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the length of array");
	int n = sc.nextInt();
	int arr[] = new int[n];
	int arr1[] = new int[n];
	System.out.println("Enter the values of array");
	for(int i =0;i<n;i++)
	{
		arr[i]= sc.nextInt();
	}
	int j=0;
	for(int i =n-1;i>=0;i--)
	{
			arr1[j]=arr[i];
			j++;
	}
	for(int k=0;k<n;k++)
	{
		System.out.println(arr1[k]);
	}
}
}

