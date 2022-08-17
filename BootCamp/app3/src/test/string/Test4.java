package test.string;

public class Test4 {
public static void main(String[] args)
{
	String str1 = "java";
	String str2 = "java";
	String str3 = "Hello";
	String str4 = "hello";
	//String str7 = "";
	String str5 = new String("java");
	String str6 = new String("hello");//five objects-(str1,str2),str3,str4,str5,str6
	System.out.println(str3==str4);//double operator == -always checks the referneces.//false
	System.out.println(str1==str5);//false
	System.out.println(str4==str6);//false
	System.out.println(str1.equals(str5));//equals() method- checks the content of the string.
	System.out.println(str1.length());
	System.out.println(str1.charAt(1));
	for(int i =str1.length()-1; i>=0;i--)
	{
		System.out.println(str1.charAt(i));
	}
	str1.concat("test");
	System.out.println(str1);
}
}
