package com.deadlock;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class A {
    public Map<Integer,String> data = new HashMap<>();
    public String name;
    public int id;

    public void insertDetails() {
        try {
            data.put(485, "Aditya");
            data.put(489,"Devesh");
            data.put(456,"Arjit");
            //Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void printDetails()
    {
        try
        {
            Iterator<Map.Entry<Integer,String>> itr = data.entrySet().iterator();
            while (itr.hasNext())
            {
                Map.Entry<Integer,String> et = itr.next();
                System.out.println(et.getKey()+" : "+et.getValue());
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}
class C extends Thread
{
    A a;
   // Map<Integer,String> data;
    public C(A a)
    {
        this.a=a;
    }

    @Override
    public void run() {
        try
        {
            while(true)
            {
                a.insertDetails();
                Thread.sleep(500);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
class B extends Thread
{
    A a;
    //Map<Integer,String> data;
    public B(A a)
    {
        this.a =a;
    }

    @Override
    public void run() {
        try
        {
            while (true)
            {
                a.printDetails();
                Thread.sleep(1000);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

public class E2 extends Thread{
    public static void main(String[] args) {
        A a = new A();
       // Map<Integer,String> data = new HashMap<>();
        C c = new C(a);
        B b = new B(a);
        c.start();
        b.start();
    }
}
