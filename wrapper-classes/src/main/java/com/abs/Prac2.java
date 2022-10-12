package com.abs;
interface Inf1
{
    void add();
    //nested or inner interface
    interface Inf2{//to avoid declaring all methods in a normal class we can opt for inner/nested interfaces
        void sub();
    }

}
class Methods implements Inf1.Inf2{
    //@Override//follow parent type syntax only-?
    public void sub() {
        System.out.println("Inner interface override");
    }
}

public class Prac2 {
    public static void main(String[] args) {
        Methods obj = new Methods();
        obj.sub();
    }


}
