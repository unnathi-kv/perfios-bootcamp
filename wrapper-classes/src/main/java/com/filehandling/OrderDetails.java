package com.filehandling;

import java.io.Serializable;

public class OrderDetails implements Serializable {
    public int orderId;
    public String customerName;
    public String orderdItems;
    public String address;
    public int amount;
    public long phNo;
}
