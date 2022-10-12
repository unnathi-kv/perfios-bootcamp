package com.inheri;
//Inheritance
class A
{
    int id = 17;
    String name = "Vernon";
    public void details()
    {
        System.out.println(id+" "+name);
    }
    public void disp()
    {
        System.out.println("default");
    }

}
//Single level Inheritance
class B extends A{
    String city = "Canada";
    public void userDetails()
    {
        System.out.println(id+" "+name+" "+city);
    }

}
//Hierarchy Inheritance
class C extends A{
    String job = "Artist";
    public void jobDetails()
    {
        System.out.println(id+" "+name+" "+job);
    }
}
//Multi-level Inheritance
class D extends B{
    String occ = "Singer";
    public void details()
    {
        System.out.println(id+" "+name+" "+occ+" "+city);
    }
}

public class Pc1 {
    public static void main(String[] args) {
        B obj = new B();
        obj.userDetails();
        obj.details();
        obj.disp();
        C obj1 = new C();
        obj1.jobDetails();
        D d = new D();
        d.details();//overrides the details' method.
    }
}
