package practicearr;
import java.util.Scanner;
public class P2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the length of array");
	int n = sc.nextInt();
	int arr[] = new int[n];
	System.out.println("Enter the values of array");
	for(int i =0;i<n;i++)
	{
		arr[i]= sc.nextInt();
	}
	System.out.println("Enter the number to search");
	int j= sc.nextInt();
	int flag=0;
	for(int i =0;i<n;i++)
	//for(int x : arr)
	{
		if(arr[i]==j)
		{
			flag=1;
			break;
		}
	}
	if(flag==1)
	{
		System.out.println("Number present");
	}
	else
	{
		System.out.println("Number not present");
	}
}
}
