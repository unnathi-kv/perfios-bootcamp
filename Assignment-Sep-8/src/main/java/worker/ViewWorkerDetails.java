package worker;

import java.util.ArrayList;
import java.util.List;

public class ViewWorkerDetails {
    public void view(WorkerDetails workerDetails,WorkerData workerData)
    {
    List<WorkerDetails> userList= new ArrayList<WorkerDetails>();
    userList =workerData.getAllUserDetails();
        for(WorkerDetails u : userList)
    {
        System.out.println("Worker ID : "+u.getWorkerId()+" First Name : "+u.getFname()+" Last Name : "+u.getLname()+
                " Salary : "+u.getSal()+" Joining date: "+u.getJoinDate()+" Department: "+u.getDept());
    }
}
}
