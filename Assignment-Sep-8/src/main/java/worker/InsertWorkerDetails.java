package worker;

import java.util.Scanner;

public class InsertWorkerDetails {
    public void insert(WorkerDetails workerDetails,WorkerData workerData){
        //UserDetails userDetails = new UserDetails();
        //UserData userData =new UserData();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the worker id: ");
        workerDetails.setWorkerId(sc.nextInt());
        System.out.println("Enter the first name : ");
        workerDetails.setFname(sc.next());
        System.out.println("Enter the last name : ");
        workerDetails.setFname(sc.next());
        System.out.println("Enter the salary : ");
       workerDetails.setSal(sc.nextDouble());
        System.out.println("Enter the joining date : ");
        workerDetails.setJoinDate(sc.nextLine());
        sc.nextLine();
        System.out.println("Enter the department : ");
        workerDetails.setDept(sc.next());
        int x = workerData.saveUserDetails(workerDetails);
        if (x > 0) {
            System.out.println("One user record completed");
        }

    }
}
