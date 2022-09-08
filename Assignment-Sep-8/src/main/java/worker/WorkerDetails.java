package worker;

import java.util.Date;

public class WorkerDetails {
        int workerId;
        String fname;
        String lname;
        double sal;
        String joinDate;
        String dept;
        public int getWorkerId() {
            return workerId;
        }
        public void setWorkerId(int workerId) {
            this.workerId = workerId;
        }
        public String getFname() {
            return fname;
        }
        public void setFname(String fname) {
            this.fname = fname;
        }
        public String getLname() {
            return lname;
        }
        public void setLname(String lname) {
            this.lname = lname;
        }
        public double getSal() {
            return sal;
        }
        public void setSal(double sal) {
            this.sal = sal;
        }
        public String getJoinDate() {
            return joinDate;
        }
        public void setJoinDate(String joinDate) {
            this.joinDate = joinDate;
        }
        public String getDept() {
            return dept;
        }
        public void setDept(String dept) {
            this.dept = dept;
        }
}

