package p2;
import p1.ValidateData;
import java.util.Scanner;
// import p1.DataStd;
public class Test {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		ValidateData obj = new ValidateData();
		System.out.println("Enter id");
		int id = obj.id =  sc.nextInt();
		System.out.println("Enter roll");
		int roll = obj.roll = sc.nextInt();
		System.out.println("Enter score");
		int score= obj.score = sc.nextInt();
		obj.disp(id,roll);
	}
}
