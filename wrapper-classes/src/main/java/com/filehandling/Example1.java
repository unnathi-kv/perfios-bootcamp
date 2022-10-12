package com.filehandling;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
//file write-byte stream
public class Example1 {
    public static void main(String[] args) throws Exception {
        File file = new File("src/Example.txt");
        FileOutputStream fout = new FileOutputStream(file);//throws Exception
        BufferedOutputStream bw = new BufferedOutputStream(fout);//if any issues happens while during the operation it takes care.
        String msg ="This is a sample text file";
        bw.write(msg.getBytes());//it converts the string into bytes
        bw.flush();//acts like close() method.
        System.out.println("Done");
    }
}
