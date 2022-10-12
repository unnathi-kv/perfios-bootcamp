package com.filehandling;

import java.io.Serializable;

//Serialization
public class Example5 implements Serializable {
    public int id;
    public String name;
    public String playerType;
    public String playerCity;
    public transient int pin;//transient- it won't include pin in serialization.i.e it will exclude the data from serialization.
}
