package com.perfios;

public class Example1 {
	
	private int x =10;
	int y = 20;
	protected int z = 30;
	public int a = 40;
	public void disp()
	{//same class
		System.out.println(x);//private - O
		System.out.println(y);//default - O 
		System.out.println(z);//protected - O
		System.out.println(a);//public - O
		
	}

}
class Exp2 extends Example1{
	public void disp()
	//same package sub class
	{
		System.out.println(x);//private- X
		System.out.println(y);//default - O
		System.out.println(z);//protected - O
		System.out.println(a);// public - O
	}
	
	
}


