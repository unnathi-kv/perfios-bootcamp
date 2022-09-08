package worker;

import java.util.Scanner;

public class UpdateWorkerDetails {
    public void update(WorkerDetails workerDetails,WorkerData workerData)
    {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the worker id  to be updated");

        System.out.println("Enter the new user name ");
        workerDetails.setWorkerId(sc.nextInt());
        System.out.println("Enter the new salary : ");
        workerDetails.setSal(sc.nextDouble());
        System.out.println("Enter the new department : ");
        workerDetails.setDept(sc.next());
    int y= workerData.updateUserDetails(workerDetails);
        if(y>0)
    {
        System.out.println("Details updated");
    }
}
}
