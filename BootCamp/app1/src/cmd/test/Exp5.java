package cmd.test;
import java.util.Scanner;
public class Exp5 {
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	public void mul(int a,int b)
	{
		System.out.println(a*b);
	}
	public void div(int a,int b)
	{
		System.out.println(a%b);
	}
	
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the case number : ");
	int x = sc.nextInt();
	Exp5 obj = new Exp5();
	System.out.println("Enter a value ");
	int a = sc.nextInt();
	System.out.println("Enter a value ");
	int b = sc.nextInt();
	switch(x)
	{
	case 1 : {
		System.out.println("In case 1 - addition");
		obj.add(a, b);
	}
	break;
	case 2 :{
		System.out.println("In case 2 - Substraction");	
		obj.sub(a,b);
	}
	break;
	case 3 :{
		System.out.println("In case 3 - Multiplication");
		obj.mul(a,b);
	}
	break;
	case 4 :{
		System.out.println("In case 4 - Divison");
		obj.div(a,b);
	}
	break;	
	default : System.out.println("Enter a valid case number");
	}
	sc.close();
}

}
