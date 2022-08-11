package com.test;
class Car
{
	private int carid;
	private String carname;
	String city;
	public Car(int carid, String carname, String city)
	{
		this.carid = carid;
		this.carname = carname;
		this.city=city;

	}
	public void disp()
	{
		System.out.println("Car id "+ carid);
		System.out.println("Car name "+carname);
		System.out.println("Car city "+city);
		
	}

}
public class Eg6 {

	public static void main(String[] args)
	{
		Car obj1 = new Car(10,"BMW","Germany");
		obj1.disp();	
		
	}
}
