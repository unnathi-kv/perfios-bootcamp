package com.deadlock;
//Producer and Consumer
class Item
{
    public int value;
    public boolean valSet = false;
    public synchronized void putItem(int i)
    {
        try{
            if(valSet)//if valSet true i.e resources are being used, so wait().
            {
                wait();
            }
            value=i;
            System.out.println("Producer produced one item -> "+value);
            valSet=true;//since we are using resource valSet is set to true.
            notify();//once producer produces an item we are notifying the consumer.
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public synchronized void getItem()
    {
        try
        {
         if(!valSet)//if not valSet
         {
             wait();
         }
            System.out.println("Consumer consumed one item -> "+value);
         valSet=false;
         notify();//notifying the producer.
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
class Producer extends Thread
{
    Item item;
    int i;
    public Producer(Item item)
    {
        this.item=item;
    }
    @Override
    public void run()
    {
        try
        {
         while (true)
         {
             item.putItem(++i);
             Thread.sleep(1000);
         }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
class Consumer extends Thread
{
    Item item;
    public  Consumer(Item item)//constructor
    {
        this.item=item;
    }
    @Override
    public void run() {
        try
        {
         while(true)
         {
             item.getItem();
             Thread.sleep(500);
         }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
public class E1 extends Thread{
    public static void main(String[] args) {
        Item item = new Item();
        Producer p = new Producer(item);//producer class object
        Consumer c = new Consumer(item);//consumer class object

        c.start();
        p.start();
    }
}
