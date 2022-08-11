package com.test;
class Book
{
	// Book obj = new Book(); throws error-Stackoverflow error . So we cant create a object in class,
	//We can create an object only in methods.
	public Book()
	{
		this("aditya");
		System.out.println("default");
	}
	public Book(String name)
	{
		this(22);
		System.out.println("single arg " + name);
	}
	public Book(int x)
	{
		System.out.println("int arg "+x);
	}
}
public class Eg5 {
public static void main(String[] args)
{
	Book obj = new Book();
	
}
}
