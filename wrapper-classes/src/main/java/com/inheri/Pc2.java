package com.inheri;
//Multiple Inheritance
@FunctionalInterface
interface I{
void show();
default void disp()
{
    System.out.println("default");
}
static void display()
{
    System.out.println("Static ");
}
}
interface J extends I{
    interface L{//inner interface
        void run();
    }
}
interface K extends I,J {
default void disp()
{
    System.out.println("default in K");
}
}
class R implements I,J, J.L {
    @Override
    public void show() {
        System.out.println("overrides");
    }
    public void run()
    {
        System.out.println("Run overrides");
    }
}
public class Pc2 {
    public static void main(String[] args) {
        R obj = new R();
        obj.show();
        obj.disp();
    }
}
