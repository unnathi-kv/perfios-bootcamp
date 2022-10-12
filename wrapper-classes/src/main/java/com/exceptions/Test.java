package com.exceptions;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Age Validation
        System.out.println("Enter the age");
        int age = sc.nextInt();
        AgeValidator obj = new AgeValidator();
        try//all business logic and problematic expressions in try block
        {
            obj.checkAge(age);
        }
        catch (InvalidAgeException ive)
        {
            System.out.println("Invalid age");
        }
        catch (ValidAgeException ve)
        {
            System.out.println("Valid age");
        }
        //Salary Validation
        SalaryValidator sv = new SalaryValidator();
        System.out.println("Enter the salary");
        double amt = sc.nextDouble();
        try
        {
            sv.checkSalary(amt);
        }
        catch (ValidSalary vs)
        {
           System.out.println("Valid Salary");
        }
        catch (InvalidSalary ivs)
        {
            System.out.println("Invalid Salary");
        }

   }
}
