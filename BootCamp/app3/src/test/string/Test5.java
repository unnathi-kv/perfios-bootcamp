package test.string;

public class Test5 {
public static void main(String[] args)
{
	String str1 = "java";
	//str1.append();//error string is immutable
	StringBuffer sb1 = new StringBuffer();
	System.out.println(sb1.capacity());
	StringBuffer sb = new StringBuffer(str1);//no error StringBuffer mutable
	sb.append("test");
	System.out.println(sb);
	System.out.println(sb.capacity());
	System.out.println(sb.reverse());//reverse() method- used to reverse a StringBuffer.
	String str2 = "java";
	String str3 = "Java";
	System.out.println(str2.equalsIgnoreCase(str3));//ignores 
	String str4= str3.substring(2);//substring()-prints from the given index
	System.out.println(str4);
	System.out.println(sb.substring(2, sb.length()));
	String str5=" javac ";//length=7
	str5.trim();//trims the empty spaces at beginning and ending.
	System.out.println(str5.trim().length());//prints 5 
	System.out.println(str5.contains("av"));//contains() method - checks if the char sequence present in the string and returns boolean value.
	System.out.println(str5.startsWith(" "));
	char[] ar = str3.toCharArray();//toCharArray() - converts the string into char array
	System.out.println(ar[2]);
	for(char x : ar)
	{
		System.out.println(x);
	}
	String str6="JAVA";
	str6=str6.replace('J', 'k');
	System.out.println(str6);
}
}
