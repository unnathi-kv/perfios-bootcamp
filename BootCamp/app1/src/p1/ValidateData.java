package p1;

class DataStd {
	public int id;
	public int roll;
	public String name;
	public String company;
	public int score;
//	public int a;
	
	}
public class ValidateData extends DataStd
{
	public void disp(int x, int y)
	{
		if(score >=60 && score<70) {
			System.out.println("ViT");
		}
		else if(score >=70 && score<80) {
			System.out.println("NiT");
		}
		System.out.println(name);
//		System.out.println(a);
		System.out.println("Id :"+x);
		System.out.println("Roll number:"+roll);
	}
}
