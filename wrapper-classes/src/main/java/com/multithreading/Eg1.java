package com.multithreading;
//multithreading based on os.
public class Eg1 extends Thread {//when ever we extend Thread class we have to override the inbuilt  run() method.
    @Override
    public void run() {
    try{
        Thread.sleep(1000);//t1 sleeps for 1 second.
        System.out.println("Run()  method");
    }
    catch (Exception e )
    {
        e.printStackTrace();
    }
    }

    public static void main(String[] args) throws Exception{//main() method acts like a main thread.throws Exception because of sleep() method
        Eg1 t1 = new Eg1();
        System.out.println("Before starting thread state : "+t1.getState());//output-NEW
        System.out.println("Before starting thread status : "+t1.isAlive());//output-false
        t1.start();
        System.out.println("After starting thread state : "+t1.getState());//output-RUNNABLE
        System.out.println("After starting thread status : "+t1.isAlive());//output-true and start() method calls the run() method
        // which gives the run() method output.
        Thread.sleep(100);//sleep() is a static method so should call using class name i.e Thread. can use object also but gives warning.
        System.out.println("After sleeping thread state : "+t1.getState());//output-TIME_WAITING
        System.out.println("After sleeping thread status : "+t1.isAlive());//output-true
        t1.join();//join() -?
        System.out.println("After joining thread state : "+t1.getState());//output-TERMINATED
        System.out.println("After joining thread status : "+t1.isAlive());//output-false
    }
}
