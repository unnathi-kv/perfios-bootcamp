package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Util {
	public Statement getStatement() {
        Connection con = null;
        Statement st = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb?autoReconnect=true&useSSL=false", "root", "password");
            st= con.createStatement();
            //return con;

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return st;
    }
	public int saveUser(User user)
	{
		 String sql= null;
	        try {
	        	sql = "insert into b_user values('"+user.getUserName()+"','"+user.getPassword()+"')";
	        	return getStatement().executeUpdate(sql);
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	            return 0;
	        }
	        
	}

}
