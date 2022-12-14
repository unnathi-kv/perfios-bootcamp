package com.test;
//Syntax for constructors.

class Emp
{
	//static Emp emp = new Emp();
	public Emp()//default constructor
	{
		this(20,"AK");//constructor chaining using this keyword
		System.out.println("default");
	}
	public Emp(int id, String name)//parameterised constructor
	{
		System.out.println("Parameterised "  + id+ " "+name);
	}
	public Emp(double id, char name)//overload constructor
	{
		System.out.println("Overloading");
	}
	public Emp(Emp obj)//Object parameterised constructor
	{
		System.out.println("Object parameterised");
	}
}
public class Eg3 {
	public static void main(String[] args)
	{
		Emp obj = new Emp(); //prints default
		Emp obj1 = new Emp(10, "Aditya");//prints parameterised
		Emp obj2= new Emp(10.00, 'a');//prints overloading
		Emp obj3 = new Emp(obj1);//prints object parameterised	
		
	}
	
	
	
}
