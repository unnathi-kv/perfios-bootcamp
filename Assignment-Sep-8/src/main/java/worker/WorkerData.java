package worker;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class WorkerData {
    public Statement getStatement() {
        Connection con = null;
        Statement st = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/worker_info?autoReconnect=true&useSSL=false", "root", "password");
            st= con.createStatement();
            //return con;

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return st;
    }
    public int saveUserDetails(WorkerDetails workerDetails)
    {
        String sql= null;
        try {
            sql = "insert into worker_table(worker_id,fname,lname,salary,joining_date,department) values('"+workerDetails.getWorkerId() + "', '" + workerDetails.getFname() + "','" + workerDetails.getLname() + "','"+ workerDetails.getSal() +
                    "','" + workerDetails.getJoinDate() + "','" + workerDetails.getDept() + "')";
            //st = getConnection().createStatement();
            return getStatement().executeUpdate(sql);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return 0;
        }
    }
    public int updateUserDetails(WorkerDetails workerDetails) {
        try
        {
            String sql = "update worker_table set salary = '"+workerDetails.getSal()+"', department= '"+workerDetails.getDept()+
                    "' where worker_id= '"+workerDetails.getWorkerId()+"' ";
            return getStatement().executeUpdate(sql);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return 0;
        }
    }
    public int deleteUserDetails(WorkerDetails workerDetails) {
        try
        {
            String sql ="delete from worker_table where worker_id = "+workerDetails.getWorkerId()+" ";
            return getStatement().executeUpdate(sql);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return 0;
        }
    }
    public List<WorkerDetails> getAllUserDetails()
    {
        List<WorkerDetails> userList = new ArrayList<WorkerDetails>();
        try
        {
            String sql= "select * from worker_table";
            ResultSet rs = getStatement().executeQuery(sql);
            while ((rs.next()))
            {
                WorkerDetails worker = new WorkerDetails();
                worker.setWorkerId(rs.getInt(1));
                worker.setFname(rs.getString(2));
                worker.setLname(rs.getString(3));
                worker.setSal(rs.getDouble(4));
                worker.setJoinDate(rs.getString(5));
                worker.setDept(rs.getString(6));
                userList.add(worker);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return userList;
    }
    public List<String> query1(){
        List<String> full_name = new ArrayList<>();
        try{
            String sql = "select concat(upper(fname),' ',upper(lname)) as full_name from worker_table;";
            ResultSet rs = getStatement().executeQuery(sql);

            while(rs.next()) {
                full_name.add(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return full_name;
    }

    public List<String> query2(){
        List<String> distDept = new ArrayList<>();
        try{
            String sql = "select distinct(department) from worker_table;";
            ResultSet rs = getStatement().executeQuery(sql);
            while(rs.next()) {
                distDept.add(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return distDept;
    }

    public void query3(){
        String sql = null;
        try{
            sql = "select position('a' in (select fname from worker_info.worker_table where fname='Amitabh')) as index_position;";
            ResultSet rs = getStatement().executeQuery(sql);
            if(rs.next())
                System.out.println(rs.getInt(1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

