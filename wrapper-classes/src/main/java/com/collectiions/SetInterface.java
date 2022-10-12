package com.collectiions;
//set interface
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {
       // Set<String> data = new HashSet<>();
       //for random display go for hashset
        HashSet<String> data = new HashSet<String>();
        data.add("Jin");
        data.add("Josh");
        data.add("Vernon");
        data.add("DK");
        //data.add("Jin");//duplicates arent allowed in setInterface.
        System.out.println(data);
        System.out.println(data.size());//length of set
        System.out.println(data.remove("DK"));//returns true
        System.out.println(data);
        System.out.println(data.remove("Scoups"));//returns false
        //to iterate through the set .
        Iterator<String> itr = data.iterator();//
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        LinkedHashSet<String> db = new LinkedHashSet<>();
        db.add("Jin");
        db.add("Josh");
        db.add("Vernon");
        db.add("DK");
        System.out.println(db);//linked hashset displays in insertion order



    }
}
