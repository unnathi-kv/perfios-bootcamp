package com.collectiions;

import java.util.*;

class Details  implements Comparable<Details>
{
    private String name;
    private int id;
    private String company;
    private int age;
    private double salary;
    Details()
    {

    }
    Details(String name,int id,String company,int age,double salary)
    {
        this.name=name;
        this.id= id;
        this.company=company;
        this.age=age;
        this.salary=salary;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getCompany() {
        return company;
    }
    @Override
    public int compareTo(Details info) {//to compare with int like age,salary write methods in the class which implements
                                            //Comparable interface.
        return this.age- info.getAge();
    }
//right click->generate->equals() and hashCode()-?
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Details info = (Details) o;
        return id == info.id && age == info.age && Double.compare(info.salary, salary) == 0 && Objects.equals(name, info.name) && Objects.equals(company, info.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age,company,id,name,salary);
    }

}
class NameComparator implements Comparator<Details>//to compare strings write new classes which implements Comparator interface.
{
    @Override
    public int compare(Details info, Details t1) {
        return info.getName().compareTo(t1.getName());
    }
}
public class EmpDetails {
    public static void main(String[] args) {
        List<Details> db = new ArrayList<Details>();
        db.add(new Details("Aditya",489,"Perfios",21,75000.0));
        db.add(new Details("Teju",450,"Amazon",22,750.0));
        db.add(new Details("Sahil",456,"JW",22,750000.0));
        db.add(new Details("Dilip",469,"Kalyera",20,5000.0));


        Iterator<Details> itr = db.iterator();
        while (itr.hasNext())
        {
            Details emp = itr.next();
            System.out.println("ID : "+emp.getId()+" Name "+emp.getName());
        }
        System.out.println("By age");
        Collections.sort(db);//sorting by age
        Iterator<Details> itr1 = db.iterator();
        while (itr1.hasNext())
        {
            Details emp = itr1.next();
            System.out.println("ID : "+emp.getId()+" Name "+emp.getName()+" Age : "+emp.getAge());
        }
        System.out.println("By name");
        Collections.sort(db,new NameComparator());//sorting by age
        Iterator<Details> itr2 = db.iterator();
        while (itr2.hasNext())
        {
            Details emp = itr2.next();
            System.out.println("ID : "+emp.getId()+" Name "+emp.getName()+" Age : "+emp.getAge());
        }


    }
}
