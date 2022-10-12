package com.wrapperclasses;
//wrapper class example
public class Prac1
{
    public static void main(String[] args) {
        String v1 ="100";
        String v2  ="200";

        System.out.println(v1+v2);//concatenates the two strings.
        int x = Integer.parseInt(v1);// converting string  numerical to fundamental numerical.
        int y = Integer.parseInt(v2);
        System.out.println(x+y);
        Float j = Float.parseFloat(v1);
        Float k = Float.parseFloat(v2);
        System.out.println(j+k);
        boolean b = Boolean.parseBoolean(v1);
        System.out.println(b);
    }
}
