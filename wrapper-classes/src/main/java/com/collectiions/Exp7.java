package com.collectiions;

import java.util.*;
import java.util.Map.Entry;

public class Exp7
{
    public static void main(String[] args) {
        Details e2 = new Details("Umar",458,"IIM",22,75000.0);
        Details e4 = new Details("Sahil",468,"Perfios",21,75000.0);
        Details e5 = new Details("Saurabh",450,"JW",19,75000.0);
        Details e3 = new Details("Dilip",454,"EY",25,75000.0);
        Details e1 = new Details("Arjit",457,"Perfios",21,75000.0);
        Details e7 = new Details("Devesh",452,"Perfios",22,75000.0);
        Details e6 = new Details("Sanjeev",467,"IIM",23,75000.0);

        //Map<Integer,Details> empInfo = new HashMap<>();
        Map<Integer,Details> empInfo = new Hashtable<>();
        Map<String, Integer> map = new HashMap<>();
        map.put("abc",25);
        map.put("def",26);
        map.put("jkl",29);
        map.put("ghi",28);
        map.put("pqr",27);
        map.put("mno",22);
        map.put("stu",21);

        System.out.println(map);

        empInfo.put(1,e1);
        empInfo.put(3,e6);
        empInfo.put(2,e4);
        empInfo.put(1,e2);//duplicates are over rode.
        empInfo.put(4,e3);
        empInfo.put(6,e5);
        empInfo.put(8,e6);
        empInfo.put(5,e7);
        Iterator<Entry<Integer,Details>> itr = empInfo.entrySet().iterator();
        while (itr.hasNext())
        {
            Map.Entry<Integer,Details> et = itr.next();
            System.out.println("S.No: "+et.getKey()+" Name : "+et.getValue().getName()+ " Age : "+et.getValue().getAge()+" Company : "+et.getValue().getCompany());
        }
        //Collections.sort(empInfo);


        //System.out.println(empInfo);

    }
}
