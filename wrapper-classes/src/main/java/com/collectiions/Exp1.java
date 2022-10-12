package com.collectiions;

import java.util.ArrayList;
import java.util.Collection;

public class Exp1 {
    public static void main(String[] args) {
        //Collection data = new ArrayList<>();
        ArrayList data = new ArrayList<>();
        data.add(10);
        data.add("Vernon");
        data.add(10);//duplicates are allowed.
        data.add('V');//can add all types of data types
        System.out.println(data);
        System.out.println(data.size());
        System.out.println(data.contains(10));
        //data.remove();
        data.set(1,"DK");//set() method
        System.out.println(data);
        System.out.println(data.indexOf(10));

    }
}
