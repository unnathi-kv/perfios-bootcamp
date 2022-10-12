package com.filehandling;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialDemo {
    public static void main(String[] args) throws Exception {
//        File file = new File("src/Player.txt");
//        FileOutputStream fw = new FileOutputStream(file);
//        //Instead of buffered stream we will be using object stream .BufferedOutputStream bw = new BufferedOutputStream(fw);
//        ObjectOutputStream ow = new ObjectOutputStream(fw);
//        Example5 obj = new Example5();
//        obj.id =17;
//        obj.name="Vernon";
//        obj.playerCity="Canada";
//        obj.playerType="Artist";
//        obj.pin=515201;
//        ow.writeObject(obj);//writeObject() - method to write objects into a file
//        System.out.println("Done");
        File file = new File("src/Order Details.txt");
        FileOutputStream fw = new FileOutputStream(file);
        ObjectOutputStream ow = new ObjectOutputStream(fw);
        OrderDetails obj = new OrderDetails();
        obj.orderId=128;
        obj.customerName="Josh";
        obj.orderdItems="Ice cream";
        obj.address="LA";
        obj.phNo=9398341502l;
        obj.amount=100;
        ow.writeObject(obj);
        System.out.println("Done");


   }
}
