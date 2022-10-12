package practice;
import java.sql.*;
public class Prg1 {
        public static void main(String[] args)throws Exception
        {
            //load the driver -common for all
            Class.forName("com.mysql.jdbc.Driver");//Driver-class name
            //connection URL-common for all
            //Connection - interface.getConnection()-return type is Connection.
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/perfios?autoReconnect=true&useSSL=false","root","password");//maven project
            //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/perfios","root","password");//perfios-database name
            //create a Statement object
            Statement st=con.createStatement();//Statement :- interface -  in built,creating object using createStatement().
            //execute the query
            st.execute("insert into BANK(NAME,ADDRESS) values('geeta','hyderabad')");//execute() method- using statement object,return type is boolean,common for all
            System.out.println("row inserted");
            //close the connection object
            con.close();
        }
}
