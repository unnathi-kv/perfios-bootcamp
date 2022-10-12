package com.abs;
//functional interface -
@FunctionalInterface//if more than one abstract method gives compile time error
interface FunInf
{
    void draw();// can have only one abstract method but n number of default and static methods.
    default void show()
    {
        System.out.println("Default method");
    }
    static void disp()
    {
        System.out.println("Static method");
    }

}
public class Prac3  {
    public static void main(String[] args) {
        FunInf obj = new FunInf() {// without giving semicolon open brackets it gives anonymous class(class within class but without name i.e inner class doesn't have a name)
            @Override//inside the anonymous inner class we are overriding the method, and we have object concept in anonymous classes.
            public void draw() {
                System.out.println("Inf method override and anonymous class object");
            }
        };
        //using anonymous class object
        obj.draw();
        //using nameless object
        new FunInf(){//creating a nameless object.
            @Override
            public void draw()
            {
                System.out.println("Nameless object");
            }
        }.draw();
        //jdk 1.8 feature
        //lamda expression : -> (arrow) represents lamda expression
        //Functional interface with lamda expression - one abstract method and one implementation.
        FunInf obj1 = () -> System.out.println("Lamda expression");
        //object using lamda expression.
        obj1.draw();
    }
}
