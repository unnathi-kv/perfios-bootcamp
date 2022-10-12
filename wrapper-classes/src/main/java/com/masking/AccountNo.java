package com.masking;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class AccountNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account number");
        String accno = sc.next();
        char ar[] = new char[accno.length()];
        for(int i=0;i<accno.length();i++)
        {
            ar[i]=accno.charAt(i);
        }
        for (int i=0;i<accno.length()-3;i++)
        {
            ar[i]='x';
        }
        System.out.println("Your account number");
        for(int i=0;i<accno.length();i++)
        {
            System.out.print(ar[i]);
        }
        System.out.println();
    }


}
