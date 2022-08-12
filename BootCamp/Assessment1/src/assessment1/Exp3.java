package assessment1;
//  Checking for balanced parenthesis in an expression using constant space.
import java.util.Scanner;
class Balanced
{
	String e;
	private char ch;
	private int flag=0;
	private int k1=0;
	private int k2=0;
	public Balanced()
	{
		
	}
	public void BalancedParenthasis()
	{
		for(int i=0;i<e.length();i++)
		{
			ch =e.charAt(i);
			if(ch =='(')
			{
				k1++;
			}
			else if(ch == ')')
			{
				k1--;
			}
			else if(ch == '{')
			{
				k2++;
			}
			else if (ch == '}')
			{
				k2--;
			}
			if(k1<0 || k2<0)
			{
				flag =1;
				break;
			}
		}
		if(flag==0&&k1==0&k2==0)
		{
			System.out.println("Expressions are matching");
		}
		else
		{
			System.out.println("Expressions are not matching");
		}
	}
}
public class Exp3 {
public static void main(String[] args)
{
	Balanced obj =new Balanced();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a expression ");
	obj.e  = sc.nextLine();
	obj.BalancedParenthasis();
	sc.close();
	
}
}
