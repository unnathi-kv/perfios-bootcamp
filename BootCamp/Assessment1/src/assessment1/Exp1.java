package assessment1;
// rotating an array to the left by 2 positions.
import java.util.Scanner;
public class Exp1 {
public static void main(String[] args)
{
	int[] a=  new int[4] ;
	int[] b = new int[4] ;
	int d;
	int k=0;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the length of array");
	int n = sc.nextInt();
	System.out.println("Enter the values for the array");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Enter the number of rotations");
	d = sc.nextInt();
	for(int i=d;i<a.length;i++)
	{
		b[k]=a[i];
		k++;
	}
	for(int i =0;i<d;i++)
	{
		b[k]=a[i];
		k++;
	}
	for(int i=0;i<a.length;i++)
	{
		a[i]=b[i];
	}
	for(int i=0;i<a.length;i++)
	{
	System.out.println(a[i]);
	}
	sc.close();
}
}
