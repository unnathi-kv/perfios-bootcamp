package Assignment;
class VoterData
{
	public int age;
	public String name;
}
public class VoterId extends VoterData {
	public void disp(String name,int age)
	{
		if(age >=18)
		{
			System.out.println("Name : "+name+" - Legal. Can participate in Voting");
		}
		else {
			System.out.println("Name : "+name+" -Not Legal Can not participate in voting");
		}
	}
}
