package com.exceptions;

import java.util.Scanner;

public class Pract1 {
    public static void main(String[] args) {
        Scanner sc =null;
        try{
            sc = new Scanner(System.in);
            sc.next();
            System.out.println("Test");
//          System.out.println(100/0);//Arithmetic Exception
            System.out.println("Exceptions");
//          args[0]=null;
//          System.out.println(args[0].equals("test"));//ArrayIndex out of bounds exception
            String str = null;
//            System.out.println(str.equals("test"));//null pointer exception
//          int x = Integer.parseInt("111o");//Number format exception
        }
        catch (ArithmeticException ae)
        {
            System.out.println("Divide by 0 is undefined");
        }
        catch (ArrayIndexOutOfBoundsException abe)
        {
            System.out.println("Check the array size");
        }
        catch (NullPointerException ne)
        {
            System.out.println("Check the string and provide correct i/p");
        }
        catch (Exception e)//Exception e - Exception class object.-always last
        {
            System.out.println("Check your inputs");
        }
        finally {
            try {
                if(sc == null) {
                    sc.close();
                }
            }
            catch (Exception e1)
           {

            }
        }
    }
}
