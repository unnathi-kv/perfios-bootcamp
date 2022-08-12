package assessment1;
// Given an array  and a target. You have to return the indices of the two numbers such that they add up to target.
import java.util.Scanner;
class SumArray
{
	int[] a = new int[4];
	private int sum = 0;
	int t;
	public SumArray()
	{
		
	}
	public void sumOfarray()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				sum = a[i]+a[j];
				if(sum==t)
				{
					System.out.println("The target can be found as sum of "+i+" and "+j+" indices.");
				}
			}
			
		}
			}
}
public class Exp2 {
public static void main(String[] args)
{
	SumArray obj = new SumArray();
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the length of array");
	int n = sc.nextInt();
	System.out.println("Enter the values for the array");
	for(int i=0;i<n;i++)
	{
		obj.a[i]=sc.nextInt();
	}	
	System.out.println("Enter the target");
	obj.t = sc.nextInt();
	obj.sumOfarray();
	sc.close();
}
}
