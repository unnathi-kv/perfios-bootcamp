package test.string;

class Student
{
	Students[] std =new Students[10];// std - array of objects with 10 as size
	
}
public class Test1 {
	public static void main(String[] args) {
	
	//int ar[]= {};//default size-10
	//int[] arr = new int[5];//size - 5 
	//int[][] a = new int[2][3];//2x3 array 
	int[] b = {10,20,30,40};
	System.out.println(b.length);
	for(int x : b)
	{
		System.out.println(x);
	}
	String[] names = new String[5];
	names[3]="Aditya";
	System.out.println(names.length);
	System.out.println(names[0].equals("Java"));//null pointer exception-equals() method to compare strings.
	
	
}
}
