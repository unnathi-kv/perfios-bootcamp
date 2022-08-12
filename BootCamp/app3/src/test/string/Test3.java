package test.string;
import java.util.Scanner;
class Email
{
	private String emailid;
	public Email()
	{
		
	}
	public Email(String emailid)
	{
		this.emailid=emailid;
	}
	public String getEmailId()
	{
		return emailid;
	}
	public void setEmailId(String emailid)
	{
		this.emailid=emailid;
	}
}
public class Test3 {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	int c=0;
	int flag = 0;
	Email[] db = new Email[5];
//	Email id1 = new Email("unnathi791@gmail.com");
//	Email id2 = new Email("xyz@perfios.com");
//	db[0]=id1;
//	db[1]=id2;
//	for(int i =0;i<db.length;i++)
//	{
//		if(db[i].getEmailId().equals(id))
//		{
//			System.out.println("The email id "+db[i].getEmailId()+" already exists. Please enter a new one.");
//			flag = 1;
//			db[i].setEmailId(id);
//			break;
//		}
//	}
	System.out.println("Enter email id: ");
	String id= sc.next();
	db[0].setEmailId("unnathi@gmail.com");
	db[1].setEmailId("xyz@perfios.com");
	for(Email obj : db)
	{
		if(obj!=null && obj.getEmailId().equals(id))
		{
			System.out.println("Email id "+obj.getEmailId()+ " already exists");
			flag=1;
			c++;
		}
	}
	
	for(int y = 0;y<db.length;y++)
	{
	System.out.println(db[y].getEmailId());
	}
	sc.close();
}
}
