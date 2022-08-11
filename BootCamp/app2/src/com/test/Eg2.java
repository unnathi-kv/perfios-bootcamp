package com.test;
// example or syntax of method chain
class MethodChain
{
	public void method1()
	{
		System.out.println("Method1");
		method2();
	}
	public void method2()
	{
		System.out.println("Method2");
		method3();
	}
	public void method3()
	{
		System.out.println("Method3");
		methodn();
	}
	public void methodn()
	{
		System.out.println("Methodn");
//		method3();
	}
}
public class Eg2 {
	public static void main(String[] args)
	{
		MethodChain obj = new MethodChain();
		obj.method1();
	}
}
