package com.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;

//file read - char stream
public class Example4 {
    public static void main(String[] args) throws  Exception{
        FileReader fr = new FileReader("src/Sample.txt");
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine()+"\n");//no need to convert we can directly read the data.
        //by using char[] array i.e character stream
        char[] ch = new char[1024];
        int x =0;
        while ((x= br.read(ch))!=-1)
        {
            System.out.println(br.read(ch,0,x));
        }
        //br.read(br,)

    }
}
