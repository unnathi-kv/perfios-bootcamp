package com.multithreading;

public class Eg2 extends Thread{
    @Override
    public void run() {
        System.out.println("Run() method : "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Eg2 t1 = new Eg2();
        Eg2 t2 = new Eg2();
        Eg2 t3 = new Eg2();
        System.out.println("Default thread priority : "+t1.getPriority());//getPriority() - is NORM_PRIORITY
//        System.out.println("Default thread priority : "+t1.getName());
//        System.out.println("Default thread priority : "+t2.getPriority());
//        System.out.println("Default thread priority : "+t2.getName());
//        System.out.println("Default thread priority : "+t3.getPriority());
//        System.out.println("Default thread priority : "+t3.getName());
        t1.setName("Trasform Objects");//setName() - to set the thread names.
        t2.setName("Account Opening");
        t3.setName("Credit Operations");
        System.out.println("Default thread priority : "+t1.getName());
//        System.out.println("Default thread priority : "+t2.getName());
//        System.out.println("Default thread priority : "+t3.getName());
        System.out.println(MAX_PRIORITY);//10
        System.out.println(NORM_PRIORITY);//5
        System.out.println(MIN_PRIORITY);//1

        t2.setPriority(MIN_PRIORITY);
        t1.setPriority(MIN_PRIORITY);
        System.out.println("Default thread priority : "+t1.getPriority());
        System.out.println("Default thread priority : "+t2.getPriority());

        t2.start();
        t1.start();



    }
}
