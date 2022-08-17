package test.string;
//reverse a string
//remove all occurrences of a given char from input string
//palindrome
class Remove
{
	String str=new String("deed");
	String restr;
	char[] ar= new char[str.length()];
	public void remove()
	{
		for(int i=str.length()-1;i>=0;i--)
		{
			ar[i]=str.charAt(i);
			System.out.println(str.charAt(i));	
		}
//		restr=restr.concat(str);
//		System.out.println(restr);
		System.out.println(ar);
		String strr= ar.toString();
		System.out.println(strr.equals(str));
//		System.out.println(ar.equals(str));
	}
}
public class Test6 {
public static void main(String[] args)
{
	Remove obj=new Remove();
//	String str1 = "java";
//	String rstr = new String();
//	String str2 = new String("test");
//	StringBuffer rsb =new StringBuffer();
//	StringBuffer str3 = new StringBuffer("deed");
//	char[] ar = str1.toCharArray();
//	for(char x : ar)
//	{
//		System.out.println(x);
//	}
	obj.remove();
//	for(int i=str3.length()-1;i>=0;i--)
//	{
//			rsb.append(str3.charAt(i));
//	}
//	System.out.println(rsb.equals(str3));
}
}
