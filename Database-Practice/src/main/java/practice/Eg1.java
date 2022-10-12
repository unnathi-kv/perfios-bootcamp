package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//Statement class example
public class Eg1 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb?autoReconnect=true&useSSL=false", "root", "password");
        Statement st = con.createStatement();
        //creating a table
        //st.execute("create table emp1(id int,emp_name varchar(15),emp_salary double)");
        //inserting values into table
        //String sql= "insert into emp1 values(1,'Josh',10000)";
        //st.execute(sql);
        //updating values
        //String sql1="update emp1 set emp_name='Vernon' where id =1";
        //st.execute(sql1);
        //to print database values in jdbc
        String sql="select * from emp1";
        ResultSet rs = st.executeQuery(sql);
        while (rs.next())
        {
            System.out.println("ID : "+rs.getInt(1)+" Name : "+rs.getString(2)+" Salary : "+rs.getDouble(3));//getInt90,getString()-converting metadata.
        }

        System.out.println("Done");
        con.close();
    }
}
