package practice;
import java.sql.*;
import java.util.*;
public class Prg2
{
    public static void main(String[] args)throws Exception
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter empno,name,designation");
        int empno=ob.nextInt();
        String name=ob.next();
        String design=ob.next();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/perfios?autoReconnect=true&useSSL=false","root","password");
        //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/perfios","root","1234");
        PreparedStatement st=con.prepareStatement("insert into EMPLOYEE values(?,?,?)");//PreparedStatement class - for dynamic inputs.
        st.setInt(1, empno);//setInt()-method to set values into database.1-first question mark
        st.setString(2, name);
        st.setString(3, design);
        st.execute();
        System.out.println("row inserted");
    }
}
