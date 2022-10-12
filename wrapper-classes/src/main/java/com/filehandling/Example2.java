package com.filehandling;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
//File read-byte stream
public class Example2 {
    public static void main(String[] args) throws Exception {
        File file = new File("src/Example.txt");
        FileInputStream fin = new FileInputStream(file);
        BufferedInputStream bin = new BufferedInputStream(fin);
        byte[] br = new byte[1024];//byte array-byte stream
        //char[] br =  new char[1024];
        int  x=0;
        while ((x=bin.read(br))!=-1)//taking each and every index value and changing it into string
        {
            System.out.println(new String(br,0,x));
        }



    }
}
