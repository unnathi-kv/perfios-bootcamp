package com.filehandling;

import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerialDemo {
    public static void main(String[] args) throws Exception{
//        FileInputStream fin = new FileInputStream("src/Player.txt");
//        ObjectInputStream oin = new ObjectInputStream(fin);
//        Example5 obj1 = (Example5)oin.readObject();//Example5 type data typecasting
//        System.out.println("ID : "+obj1.id+" Name : "+ obj1.name+" City : "+obj1.playerCity+" Type : "+obj1.playerType+" Pin : "+obj1.pin);
        FileInputStream fin = new FileInputStream("src/Order Details.txt");
        ObjectInputStream oin = new ObjectInputStream(fin);
        OrderDetails obj1 = (OrderDetails) oin.readObject();//Example5 type data typecasting
        System.out.println("Order ID : "+obj1.orderId+" Name : "+ obj1.customerName+" City : "+obj1.address+" Ordered Items : "+obj1.orderdItems
                +" Phone number : "+obj1.phNo+" Total amount paid : "+obj1.amount);

    }
}
