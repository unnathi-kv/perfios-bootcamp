package com.multithreading;

public class Eg4 implements Runnable{
    @Override
    public void run() {
        System.out.println("Run() method ");
    }

    public static void main(String[] args) {
        Eg4 t1 = new Eg4();
        //t1.run();//not multi-thread concept we are directly calling the run method.
        //Thread grouping
        ThreadGroup tg1 = new ThreadGroup("Bank");
        Thread t2 = new Thread(tg1,t1,"Transform Money");//tg1-threadgroup,t1-runnable interface,"Transform money"-name of the thread.
        Thread t3 = new Thread(tg1,t1,"withdraw");
        Thread t4 = new Thread(tg1,t1,"Account");
        t2.start();
//        System.out.println(t2.getName());
//        System.out.println(t3.getName());
//        System.out.println(t4.getName());
        ThreadGroup tg2 = new ThreadGroup("Maths");
        Thread t5 = new Thread(tg2,t1,"Add");
        Thread t6 = new Thread(tg2,t1,"Sub");
        Thread t7 = new Thread(tg2,t1,"Dom");
        t3.start();
        t4.start();
        System.out.println(tg1.activeCount());
        t5.start();
        System.out.println(tg2.activeCount());




    }
}
