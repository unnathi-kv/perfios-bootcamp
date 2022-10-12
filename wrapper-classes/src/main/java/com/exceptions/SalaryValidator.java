package com.exceptions;

public class SalaryValidator {
    public void checkSalary (double sal)throws ValidSalary,InvalidSalary
    {
        if(sal>=0)
        {
            ValidSalary vs = new ValidSalary("Valid amount");
            throw(vs);
        }
        else
        {
            InvalidSalary ivs = new InvalidSalary("Invalid amount. Salary can not be negative.");
            throw(ivs);
        }
    }
}
