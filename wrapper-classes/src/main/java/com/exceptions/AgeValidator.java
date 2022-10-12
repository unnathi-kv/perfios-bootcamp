package com.exceptions;
//Exceptions using throw and throws.
public class AgeValidator  {
    public void checkAge (int age) throws ValidAgeException,InvalidAgeException//throws -always at method body
    {
        if(age>=18)
        {
            ValidAgeException ve = new ValidAgeException("Eligible for voting");
            throw(ve);//throw the exception - always inside the method body
        }
        else
        {
            InvalidAgeException ive = new InvalidAgeException("Not Eligible");
            throw(ive);
        }
    }

}
