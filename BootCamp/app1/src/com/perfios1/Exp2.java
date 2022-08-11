package com.perfios1;
import com.perfios.*;
public class Exp2 {

	Example1 obj = new Example1();
	public void disp()
	{
		//different package 
		System.out.println(obj.x);//private - X
		System.out.println(obj.y);//default-X
		System.out.println(obj.z);//protected-X
		System.out.println(obj.a);//public-O
	}
}
class Exp3 extends Example1
{
	public void disp()
	//different package same sub class
	{
		System.out.println(x);//private-X
		System.out.println(y);//default-X
		System.out.println(z);//protected-O
		System.out.println(a);//public-O
	}
}
