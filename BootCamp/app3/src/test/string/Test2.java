package test.string;
class Students
{
	private int id;
	private String name;
	private String city;
	public Students()
	{
		
	}
	public Students(int id, String name, String city)
	{
		this.id = id;
		this.name=name;
		this.city=city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id)
	{
		this.id =id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name)
	{
		this.name =name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city)
	{
		this.city =city;
	}
}
public class Test2 {
	
public static void main(String[] args)
{
	Students[] data = new Students[3];
	Students std1 = new Students(7,"Devesh","Lucknow");
	Students std2 = new Students(69,"KV","Hdp");
	Students std3 = new Students(88,"Aditya","Bihar");
	data[0]=std1;
	data[1]=std2;
	data[2]=std3;
	std3.getId();
	for(Students obj : data)
	{
		System.out.println("ID "+obj.getId()+" Name: "+obj.getName());
	}
}
}

