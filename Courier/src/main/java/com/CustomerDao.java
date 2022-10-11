package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class CustomerDao {
	
	
public static double weightcal(double weight) {
		
		double amt =75.00;//basic minimum charges	
		
		if(weight < 250)
        {
            amt += weight * 0.30;
        }
        else if(weight < 700){
            amt += 250 * 0.3 + (weight - 250) * 0.5;
        }
        else if(weight < 1200)
        {
            amt += 250 * 0.3 + 700 * 0.5 + (weight - 700) * 0.7;
        }
		
        else if(weight < 1500) {
        	
        	amt += 250 * 0.3 + 700 * 0.5 + 1200 * 0.7 +(weight - 1200) * 1;	
        }
        else if(weight > 1500) {
        	
        	amt += 250 * 0.3 + 700 * 0.5 + 1200 * 0.7 + 1500 * 1 +(weight - 1500) * 1.5;
        	
        }
				
		return amt;	
		
	}
public static String generateCourierId()
{
	int min = 100000;  
	int max = 999999;  
	int b = (int)(Math.random()*(max-min+1)+min); 
	
	String courier_id =  Integer.toString(b);
	return courier_id;
}

	
	public static Statement getStatement() {
        Connection con = null;
        Statement st = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/courier_db?autoReconnect=true&useSSL=false", "root", "password");
            st= con.createStatement();
            //return con;

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return st;
    }
	
	public  int bookCourier(CustomerDetails customerDetails) {
        String sql= null;
        try {
            sql = "INSERT INTO `details` (`cust_name`, `cust_city`, `mobileno`, `delivery_area`, `courier_weight`, "
            		+ "`amount`, `shipment_date`, `delivery_date`)"
            	 + "VALUES('"+ customerDetails.getCust_name() + "','" + customerDetails.getCust_city() + "','" + customerDetails.getMobileno() +
           		 "','" + customerDetails.getDelivery_area() +"','" + customerDetails.getCourier_weight() +"','" + customerDetails.getAmount() +
           		 "','" + customerDetails.getShipment_date() +"','" + customerDetails.getDelivery_date() +"')";
            return getStatement().executeUpdate(sql);
        }
       
        catch (Exception e)
        {
            e.printStackTrace();
            return 0;

        }
	}

}
