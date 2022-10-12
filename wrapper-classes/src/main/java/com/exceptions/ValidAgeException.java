package com.exceptions;
//user defined exceptions-how to deal with unknown exceptions in java.
public class ValidAgeException extends Exception{
    public ValidAgeException(String msg)
    {
        super(msg);//to call the super class -?
    }
}
