package com.collectiions;
//LinkedHashMap example
import java.util.*;
import java.util.Map.Entry;
public class Exp4 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> db = new LinkedHashMap<>();//insertion is indexed.
        db.put(1,"DK");
        db.put(2,"Josh");
        db.put(4,"JK");
        db.put(5,"RM");
        db.put(3,"Vernon");
        db.put(6,"Suga");
        db.put(6,"J-Hope");//duplicate keys it overrides the value of key
        //System.out.println(db);
        //Map iteration imp.
        Iterator<Entry<Integer,String>> itr = db.entrySet().iterator();
        while (itr.hasNext())
        {
            Entry<Integer,String> et = itr.next();
            System.out.println(et.getKey()+" "+et.getValue());
        }
        //for each-enhanced for loop
        for(Integer i : db.keySet())
        {
            System.out.println("Key : "+i+" Value : "+db.get(i));
        }
        for(String k : db.values())
        {
            System.out.println("Value : "+k);
        }
        //for each() method and lamda expression.
        db.forEach((k,v)-> System.out.println(k+" : "+v));


    }
}
