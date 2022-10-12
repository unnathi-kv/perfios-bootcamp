package com.collectiions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exp6 {
    public static void main(String[] args) {
        Details e1 = new Details("Aditya",458,"Perfios",22,75000.0);
        Details e2 = new Details("Sahil",468,"Perfios",21,75000.0);
        Details e3 = new Details("Saurav",450,"Perfios",20,75000.0);
        Details e4 = new Details("Dilip",454,"Perfios",23,75000.0);
        Details e5 = new Details("Arjit",457,"Perfios",21,75000.0);

        Map<Details,Integer> empInfo = new HashMap<Details,Integer>();
        empInfo.put(e1,1);
        empInfo.put(e2,2);
        empInfo.put(e3,3);
        empInfo.put(e4,4 );
        empInfo.put(e5,5);
        empInfo.put(e5,6);///overrides the duplicate keys in hashmap.
        Iterator<Map.Entry<Details,Integer>> itr = empInfo.entrySet().iterator();
        while (itr.hasNext())
        {
            Map.Entry<Details,Integer> et = itr.next();
            System.out.println("S.No "+et.getValue()+ " Name : "+et.getKey().getName()+ " Age : "+et.getKey().getAge()+" Company : "+et.getKey().getCompany());
        }


    }
}
