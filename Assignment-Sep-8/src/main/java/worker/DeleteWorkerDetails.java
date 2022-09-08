package worker;

import java.util.Scanner;

public class DeleteWorkerDetails {
    public void delete(WorkerDetails workerDetails,WorkerData workerData)
    {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the worker id of the worker to be deleted ");
        workerDetails.setWorkerId(sc.nextInt());
    int z = workerData.deleteUserDetails(workerDetails);
        if(z>0)
    {
        System.out.println("Details of the worker deleted successfully");
    }
}
}
