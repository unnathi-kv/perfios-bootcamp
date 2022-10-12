package com.collectiions;
// With object and string as data types.
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Exp5 {
    public static void main(String[] args) {
        Details emp1 = new Details("Aditya",458,"Perfios",22,75000.0);
        Details emp2 = new Details("Sahil",468,"Perfios",21,75000.0);
        Details emp3 = new Details("Saurav",450,"Perfios",20,75000.0);
        Details emp4 = new Details("Dilip",454,"Perfios",23,75000.0);
        Details emp5 = new Details("Arjit",457,"Perfios",21,75000.0);

        Map<String,Details> empData = new HashMap<String,Details>();//String - key and Details object is the value.randpm display
        //Map<String,Details> empData = new TreeMap<String,Details>();//sorted display
        empData.put(emp1.getName(),emp1);
        empData.put(emp2.getName(),emp2);
        empData.put(emp3.getName(),emp3);
        empData.put(emp4.getName(),emp4 );
        empData.put(emp5.getName(),emp5);
        //System.out.println(empData);
        Iterator<Map.Entry<String,Details>> itr = empData.entrySet().iterator();
        while (itr.hasNext())
        {
            Map.Entry<String,Details> et = itr.next();
            System.out.println("Name /Key: "+et.getKey()+ " Age : "+et.getValue().getAge()+" Company : "+et.getValue().getCompany());
        }
        //enhanced for loop
        for (Map.Entry<String, Details> et : empData.entrySet()) {
            System.out.println("Name /Key: " + et.getKey() + " Age : " + et.getValue().getAge() + " Company : " + et.getValue().getCompany());
        }
        for(Details d : empData.values())
        {
            System.out.println("Name - "+d.getName()+" Salary : "+d.getSalary());
        }
        //for ecah() method.
        empData.forEach((k,v)-> System.out.println("Name or Key : "+k+" ID : "+v.getId()));



    }
}
