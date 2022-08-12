package Assignment;

class SingleTon
{
	private static SingleTon a= null;
	private SingleTon()
	{
		
	}
	public static SingleTon getObj()
	{
		if(a==null)
		{
			a=new SingleTon();
		}
		return a;
		
	}
}

public class SingleTn {
	public static void main(String[] args)
	 {
		 SingleTon obj1 = SingleTon.getObj();
		 SingleTon obj2 = SingleTon.getObj();
		 
		 System.out.println(obj1.hashCode());
		 System.out.println(obj2.hashCode());
		 
	 }
}
