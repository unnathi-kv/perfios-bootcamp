package com.test;
//static block syntax
class Std
{
	public Std()//default constr.
	{
		this(20); // this keyword at first executable statement.
		System.out.println("Default constructor");//5
	}
	public Std(int x)
	{
		System.out.println("x :" +x);
	}
	//static block
	static
	{
		System.out.println("static in constr.");//3
	}
	//instance block - first instance block and then constructor block executes 
	{
		System.out.println("Instance block");//4
	}
	public Std getObj()
	{
		return new Std();
	}
}
 
public class Eg4 {
static //executes first i.e before main method. 
{
	System.out.println("Static block");//1
}
public static void main(String[] args)
{
	System.out.println("Main method");//2
	Std obj = new Std();
	Std obj1 = new Std();//static blocks executes only once i.e static and main method.
	obj1.getObj();
}
}