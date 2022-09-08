package worker;

import java.util.Scanner;

public class WorkerTest {

        public static void main(String[] args)  {
           WorkerDetails workerDetails = new WorkerDetails();
           WorkerData workerData = new WorkerData();
           InsertWorkerDetails insertWorkerDetails = new InsertWorkerDetails();
           UpdateWorkerDetails updateWorkerDetails=new UpdateWorkerDetails();
           ViewWorkerDetails viewWorkerDetails = new ViewWorkerDetails();
           DeleteWorkerDetails deleteWorkerDetails = new DeleteWorkerDetails();
            Scanner sc = new Scanner(System.in);
            System.out.println("Query 1:");
            System.out.println(workerData.query1());
            System.out.println("Query 2:");
            System.out.println(workerData.query2());
            System.out.println("Query 3: ");
            workerData.query3();
            while(true) {
                System.out.println("Menu");
                System.out.println("1.Insert\n2.Update\n3.Delete\n4.View\n5.Exit");
                System.out.println("Enter your choice");
                int choice = sc.nextInt();
                switch (choice)
                {
                    case 1 :
                        System.out.println("Please enter the details accordingly");
                        insertWorkerDetails.insert(workerDetails,workerData);

                        break;
                    case 2 :
                        System.out.println("Update the user details accordingly");
                        updateWorkerDetails.update(workerDetails,workerData);
                        break;
                    case 3 :
                        System.out.println("Deleting the user details ");
                        deleteWorkerDetails.delete(workerDetails,workerData);
                        break;
                    case 4 :
                        System.out.println("User Details : ");
                        viewWorkerDetails.view(workerDetails,workerData);
                        break;
                    case 5 :
                        System.exit(1);
                    default:
                        System.out.println("Please enter a valid choice from menu");
                }

            }
        }
}

