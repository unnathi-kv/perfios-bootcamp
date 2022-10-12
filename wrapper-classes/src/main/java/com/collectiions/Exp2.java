package com.collectiions;
import java.util.*;
import java.util.Collections;
class Info implements Comparable<Info>
{
    private String name;
    private int id;
    private String company;
    private int age;
    private double salary;
    Info()
    {

    }
    Info(String name, int id, String company, int age, double salary)
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
    public int compareTo(Info inf) {//to compare with int like age,salary write methods in the class which implements
        //Comparable interface.
        return this.age- inf.getAge();
    }
    //right click->generate->equals() and hashCode()-?
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Info i = (Info) o;
        return id == i.id && age == i.age && Double.compare(i.salary, salary) == 0 && Objects.equals(name, i.name) && Objects.equals(company, i.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age,company,id,name,salary);
    }

}
class NameComparators implements Comparator<Info>//to compare strings write new classes which implements Comparator interface.
{
    @Override
    public int compare(Info info, Info t1) {
        return info.getName().compareTo(t1.getName());
    }
}

public class Exp2
{
    public static void main(String[] args) {
        Set<Info> empData = new HashSet<Info>();
        empData.add(new Info("Aditya",489,"Perfios",21,75000.0));
        empData.add(new Info("Teju",450,"Amazon",22,750.0));
        empData.add(new Info("Sahil",456,"JW",22,750000.0));
        empData.add(new Info("Dilip",469,"Kalyera",20,5000.0));
        empData.add(new Info("Teju",450,"Amazon",22,750.0));//dupilcates arent allowed in set
        //before sorting
        Iterator<Info> itr = empData.iterator();
        while (itr.hasNext())
        {
            Info emp = itr.next();
            System.out.println("ID : "+emp.getId()+" Name "+emp.getName());
        }
//       Collections.sort(empData, new Info()); hashset can not be sorted.should convert into list and sort.
        Iterator<Info> itr1 = empData.iterator();
        while (itr1.hasNext())
        {
            Info emp = itr1.next();
            System.out.println("ID : "+emp.getId()+" Name "+emp.getName()+" Age : "+emp.getAge());
        }

    }
}
