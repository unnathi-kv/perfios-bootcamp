package com.collectiions;
import java.util.LinkedList;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exp8 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
        l.add("Java");
        l.add("Pytho");
        l.add("Clang");
        l.add("Go");
        l.add("Haskell");
        l.add("DBMS");
        l.add("DBMS");
        l.add("C++lang");
        System.out.println(l);
       // l.stream().sorted().forEach(names -> System.out.println(names+ " "));//stream() - changes the list into stream and sorts it using sorted() method.
                                                                               //one thread.
        l.stream().distinct().sorted().forEach(n-> System.out.print(n+ " "));//prints distinct elements in sorted order.
        System.out.println();
        //l.stream().filter(n->n.startsWith("C")).forEach(x-> System.out.println(x));//startsWith()->case-sensitive.prints the value starting with C
        //l.stream().filter(n->n.startsWith("A")).forEach(x-> System.out.println(x));//startsWith()->no value starting with A, so it returns null.
        List<String> l1 = l.stream().filter(x->x.startsWith("C")).collect(Collectors.toList());//collect() method-> to receive elements from a steam and store them in a collection.

        List<String> l2 = l.stream().filter(x->x.endsWith("o")).collect(Collectors.toList());
       // System.out.println(l1);
        //System.out.println(l2);
       // l2.forEach(x-> System.out.println(x));
        System.out.println();
        //l.parallelStream().filter(x->x.startsWith("D")).forEach(x-> System.out.println(x));//parallelStream()->distributes the work into four parallel threads.
        l.forEach(System.out::println);
        boolean b = l.stream().allMatch(s -> s.startsWith("C"));//to check if all strings matches with the given condition
        //if yes then returns true or false.
        boolean b1 = l.stream().anyMatch(s -> s.startsWith("C"));//to check if any string matches with the given condition.
        //if yes then returns true or false.
        System.out.println(b);
        l.stream().reduce((s, s2) -> s+"|"+s2).ifPresent(System.out::println);
        Map<String,Long> data = l.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));//counts the data
        System.out.println(data);
        Details emp = new Details("Aditya",458,"Perfios",22,75000.0);
        List<Details> l3 = new LinkedList<>();
        l3.add(emp);
        Map<Integer,String> mData = l3.stream().collect(Collectors.toMap(Details::getId,Details::getName));//key-int id, value - emp name
        mData.forEach((x,y)-> System.out.println(x+ " "+y));//x and y are key and value pair since its a map.
        //List<String> lData = mData.entrySet().stream().collect(Collectors.toList());
        List<String> lData = mData.values().stream().collect(Collectors.toList());
        List<Integer> lkData = mData.keySet().stream().collect(Collectors.toList());


    }
}
