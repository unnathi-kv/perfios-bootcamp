package com.exceptions;

public class Example1 {
    public static void main(String[] args) {
        try {
            System.out.println(100 /0);
        }
        catch (Exception e)
        {
            //method1-using getMessage() method from Throwable class.
            System.out.println(e.getMessage());//output-/ by zero
            //method2-printing exception class object-it will provide exception class name and message.
            System.out.println(e);//output-java.lang.ArithmeticException: / by zero
            //method3-using printStackTrace() method-it will give exception class name,exception message and line number
            e.printStackTrace();//output-java.lang.ArithmeticException: / by zero
                                //          at com.exceptions.Example1.main(Example1.java:6)

        }
    }
}
