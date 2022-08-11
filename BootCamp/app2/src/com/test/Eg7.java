package com.test;
//Singleton Design Pattern.
class SingleTon
{
	private static SingleTon obj= null;
	private SingleTon()
	{
		
	}
	public static SingleTon getObj()
	{
		if(obj==null)
		{
			obj=new SingleTon();
		}
		return obj;
		
	}
}
public class Eg7 {
 public static void main(String[] args)
 {
	 SingleTon obj1 = SingleTon.getObj();
	 SingleTon obj2 = SingleTon.getObj();
	 
	 System.out.println(obj1.hashCode());
	 System.out.println(obj2.hashCode());
	 
 }
}
