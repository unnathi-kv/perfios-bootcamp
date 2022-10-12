package practice;

import java.sql.*;

public class Eg2 {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");//if you want oracle - com.oracle.jdbc.driver.OracleDriver
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb?autoReconnect=true&useSSL=false", "root", "password");
//        PreparedStatement pst = con.prepareStatement("insert into emp1 values(?,?,?)");
//        pst.setInt(1,2);
//        pst.setString(2,"Jin");
//        pst.setDouble(3,100000);
//        pst.execute();
        PreparedStatement pst1 = con.prepareStatement("select * from emp1");
        ResultSet rs = pst1.executeQuery();//-?
        ResultSetMetaData rsd = rs.getMetaData();//schema is a meta format
        System.out.println(rsd.getColumnCount());
        System.out.println(rsd.getColumnName(1));
        System.out.println(rsd.getColumnTypeName(1));
        System.out.println("Done");
        con.close();
    }
}
