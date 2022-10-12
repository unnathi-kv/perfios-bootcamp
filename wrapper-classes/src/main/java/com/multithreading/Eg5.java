package com.multithreading;
class C
{
    public void details(String name,int id)
    {
        System.out.println("Name : "+name+" ID : "+id);
    }
}
class D
{
    public String stdDetails(int id,String name,String clg)
    {
        return "ID : "+id+" Name : "+name+" College : "+clg;
    }
}
public class Eg5 implements Runnable{

    @Override
    public void run() {
        try
        {
            C  c = new C();
            c.details("Aditya",849);
            Thread.sleep(3000);//3 seconds delay
            D d = new D();
            System.out.println(d.stdDetails(458,"Devesh","DSCE"));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        Eg5 t1 = new Eg5();
        Thread t2 = new Thread(t1,"Details");
        t2.start();
    }
}
