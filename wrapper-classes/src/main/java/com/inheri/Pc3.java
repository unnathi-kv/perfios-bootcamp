package com.inheri;
class S
{
    int x =10;
}
class E extends S{
    //x = 20;//gives compile time error
    public void show()
    {
        x=30;
        System.out.println(x);//no error prints 30
    }
    E(Object obj)
    {
        System.out.println("Object");
    }
    E(String str)
    {
        System.out.println("String");
    }
}
public class Pc3 {
    public static void main(String[] args) {
        E e = new E(null);//null is taken as string
        e.show();
    }

}
