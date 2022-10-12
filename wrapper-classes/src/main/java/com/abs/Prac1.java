package com.abs;

interface Inf
{
    void car();//no method body
    // if you want a method body use keywords-default and static.
    default void bike()//can access through subclass object.
    {
        System.out.println("Interface default method");
    }
    static void truck()//can access only through interface name.Use static when there are common features or use override methods.
    {
        System.out.println("Interface static method");
    }
}
abstract class Vehicle
{
    public abstract void bicycle();// no method body
    public void disp()//has method body
    {
        System.out.println("Vehicle default method.");
    }


}
class FourWheelers extends Vehicle implements Inf // should implement all abstract methods in the normal class.
{
    public void bicycle() {
        System.out.println("Vehicle is overrided");
    }

    public void car() {
        System.out.println("Inf overrided");
    }
    // no abstract methods in normal class so get features from interfaces and abstract classes.
    //public abstract void bmw();

}
public class Prac1 {
    public static void main(String[] args) {
    FourWheelers obj = new FourWheelers();//should create the subclass object to access the abstract methods.
        obj.bicycle();
        obj.car();
        obj.disp();
        obj.bike();//default method accessing through subclass object.
        Inf.truck();//static method accessing through interface name.
    }
}
