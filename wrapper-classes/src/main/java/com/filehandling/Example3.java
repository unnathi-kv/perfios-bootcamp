package com.filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
//Char stream - file write
public class Example3 {
    public static void main(String[] args) throws Exception
    {
        //File file = new File("src/Smaple.txt");
        FileWriter fw = new FileWriter("src/Sample.txt",true);//true - to append data into trhe alreay existing data in the file.No true then it overrides the data
        BufferedWriter bw = new BufferedWriter(fw);
        String msg ="This is a sample char stream text";
        bw.write(msg);
        bw.flush();
        System.out.println("Done");
    }
}
