package cmd.test;
import java.util.Scanner;
public class Exp3 {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name :");
		String n = sc.next();
		System.out.println("Enter company name :");
		String c = sc.next();
		System.out.println("Enter mobile number :");
		long phoneno = sc.nextLong();
		System.out.println("Employee "+n+" works in "+c+" company with phone number "+phoneno);
		
		sc.close();
	}
	
}
