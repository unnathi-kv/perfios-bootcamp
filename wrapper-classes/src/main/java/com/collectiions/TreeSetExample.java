package com.collectiions;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> data = new TreeSet<>();
        data.add("Jin");
        data.add("Josh");
        data.add("Vernon");
        data.add("DK");
        System.out.println(data);//prints in order
        Iterator<String> itr = data.iterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next()+ " ");
        }
        System.out.println();
        Iterator<String> itr1 = data.descendingIterator();//prints in descending order
        while ((itr1.hasNext()))
        {
            System.out.print(itr1.next()+" ");
        }
        System.out.println();
        System.out.println(data.subSet("Jin","Vernon"));//subset method - from Jin to Vernon but not Vernon.
        System.out.println(data.tailSet("Josh"));//tailSet method - takes Josh (included josh) takes as a new set.
    }
}
