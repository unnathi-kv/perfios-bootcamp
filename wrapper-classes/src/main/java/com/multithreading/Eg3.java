package com.multithreading;
class Add
{
    public void add()
    {
        System.out.println("Add : "+(20+30));
    }

}
class Sub
{
    public void sub()
    {
        System.out.println("Sub : "+(200-100));
    }

}

public class Eg3 extends Thread{
    @Override
    public void run() {
        try{
            for(int i =1;i<=10;i++)
            {   //Thread.sleep(1000);
                System.out.print(i+  " ");
                if(i==4) {
                    Thread.sleep(2000);
                    Thread.yield();
                }

            }
//            Add a = new Add();
//            a.add();
//            Thread.sleep(2000);
//            Sub s = new Sub();
//            s.sub();
//            //Thread.sleep(1000);
//            System.out.println("Run() method ");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public static void main(String[] args)  {
        Eg3 t1 = new Eg3();
        Eg3 t2 = new Eg3();
        t1.start();
        t2.start();

    }
}
