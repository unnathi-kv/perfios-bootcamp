package Assignment;
class Details
{
	private int id;
	private String name;
	private String roll;
	private long phno;
	public Details(int id, String name,String roll,long phno)
	{
		this.id=id;
		this.name=name;
		this.roll =roll;
		this.phno=phno;
	}
	public void show()
	{
		System.out.println("Name : "+name+" ID : "+id+" Roll No. "+roll+" Phone number : "+phno);
	}
}
public class Student {

	public static void main(String[] args)
	{
		Details obj = new Details(10,"Unnathi","P848",9398341502L);
		obj.show();
		
	}
}
