package cmd.test;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args)
	{
		//user defined input using Scanner class from util package
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter value :");
			int x = sc.nextInt();
			int y = sc.nextInt();// nextInt()- converts string numerical into fundamental numerical
			System.out.println(x+y);
			
		// type casting string to int
			String s1="100";
			String s2= "300";
			int a = Integer.parseInt(s1);
			int b= Integer.parseInt(s2);
			System.out.println(a+b);
			sc.close();
	}
	
	
	
}
