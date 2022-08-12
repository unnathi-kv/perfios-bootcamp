package Assignment;

import java.util.Scanner;
import Assignment.VoterId;
public class VoterDetails {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		VoterId obj = new VoterId();
		System.out.println("Enter Name");
		String name = obj.name =  sc.nextLine();
		System.out.println("Enter age");
		int age = obj.age = sc.nextInt();
		obj.disp(name,age);
		sc.close();
	}
}
