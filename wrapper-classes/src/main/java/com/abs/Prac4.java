package com.abs;
//another example functional interface
@FunctionalInterface
interface FunInf1{
    void dress(String msg);
    default void pant()
    {
        System.out.println("Interface default method");
    }
    static void shirt(){
        System.out.println("Interface static method");
    }
}
public class Prac4 {
    public static void main(String[] args) {
        //lamda expression
     FunInf1 ob1 = (String msg) -> System.out.println("Lamda expression 1 " +msg)  ;
     FunInf1 ob2 = (String msg) -> System.out.println("Lamda expression 2 " +msg)  ;
     ob1.dress("Plain text");
     ob2.dress("Email Text");
     //anonymous object
        FunInf1 ob3 = new FunInf1() {
            @Override
            public void dress(String msg) {
                System.out.println(msg);
            }
        };
        ob3.pant();
        ob3.dress("Anonymous object");
        //nameless object
        new FunInf1() {
            @Override
            public void dress(String msg) {
                System.out.println(msg);
            }
        }.dress("Nameless object");
    }




}
