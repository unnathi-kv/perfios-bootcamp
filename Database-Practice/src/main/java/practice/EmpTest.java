package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id :");
        int id = sc.nextInt();
        System.out.println("Enter name ");
        String name= sc.next();
        System.out.println("Enter salary ");
        double salary = sc.nextDouble();
        Employee employee = new Employee();
        employee.setId(id);
        employee.setName(name);
        employee.setSalary(salary);
            EmpData obj = new EmpData();
        int x = obj.saveEmp(employee);
        if(x>0)
        {
            System.out.println("One record completed");
        }
        List<Employee> employeeList= new ArrayList<Employee>();
        employeeList =obj.getAllEmp();
        for(Employee e : employeeList)
        {
            System.out.println("ID : "+e.getId()+" Name : "+e.getName()+" Salary : "+e.getSalary());
        }
    }
}
