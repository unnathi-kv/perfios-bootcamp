package practice;
import java.sql.*;
public class FirstJdbc
{
    public static void main(String[] args)throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/perfios?autoReconnect=true&useSSL=false","root","password");
        //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/perfios","root","1234");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from EMPLOYEE");//ResultSet class - fetches result
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"   "+rs.getString(3));//1-represents first column
        }
        System.out.println();
    }	}
