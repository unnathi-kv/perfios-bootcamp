package com.collectiions;
// Map example -Map is an interface.
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;//Entry interface is an inner interface of Map interface.
public class Exp3 {
    public static void main(String[] args) {
        Map data = new HashMap();
        data.put(489,"Aditya");
        data.put(450,"Teju");
        data.put('a',17);
        data.put(1,"Josh");
        data.put(7,17);
        System.out.println(data);
        System.out.println(data.size());
        System.out.println(data.get(1));
        //entrySet() method- to convert map type data to set type data.
        Iterator<Map.Entry> itr = data.entrySet().iterator();
        while (itr.hasNext())
        {
            Entry et = itr.next();//-?
            System.out.println(et.getKey()+":"+et.getValue());
        }
        //using lamda expression and for each() method. k- key , v- value.
        data.forEach((k,v)-> System.out.println("Key "+k+" Value "+v));
    }
}
