package com.banking;
import java.util.Scanner;
class UserDetails
{


    private String userName;
    private String password;
    private int amount;
    private String address;
    private long phoneNum;
    private String emailId;

    UserDetails()
    {

    }

    UserDetails(String userName,int amount,String address,long phoneNum,String emailId)
    {
        this.userName =userName;
        this.amount=amount;
        this.address=address;
        this.phoneNum =phoneNum;
        this.emailId = emailId;
    }

    public String getUsername() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public int getAmount() {
        return amount;
    }

    public String getAddress() {
        return address;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public void validateUsername(UserDetails[] obj) throws InvalidUsername,ValidUsername{
        for (int i = 0; i < obj.length; i++) {
            for (int j = i + 1; j < obj.length; j++) {
                if (obj[i].getUsername().equals(obj[j].getUsername())) {
                    InvalidUsername ivu = new InvalidUsername("Invalid User Name");
                    throw(ivu);
                }
            }
            ValidUsername vu = new ValidUsername("Valid Username");
            throw(vu);
        }

    }
    public void validatePhonenumber(UserDetails[] obj) throws InvalidPhonenum
    {
        for(int i=0;i< obj.length;i++)
        {
            for(int j=i+1;j<obj.length;j++) {
                if (obj[i].getPhoneNum()==obj[j].getPhoneNum()) {
                    InvalidPhonenum ipn = new InvalidPhonenum("Invalid Phone number");
                    throw(ipn);
                }
            }
        }
    }
    public void validateEmailadd(UserDetails[] obj) throws InvalidEmail
    {
        for(int i=0;i< obj.length;i++)
        {
            for(int j=i+1;j<obj.length;j++) {
                if (obj[i].getEmailId().equals(obj[j].getEmailId())){
                    InvalidEmail ive = new InvalidEmail("Email ID already exists.Please enter anew one.");
                    throw(ive);
                }
            }
        }
    }

}
public class BankUserDetails {
    UserDetails[] userDetails = new UserDetails[2];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the details");
        BankUserDetails obj1 = new BankUserDetails();
        UserDetails obj2 = new UserDetails();
        for (int i = 0; i < obj1.userDetails.length; i++) {
        try {
                obj1.userDetails[i] = new UserDetails();
                System.err.println("Enter a user name: ");
                obj1.userDetails[i].setUsername(sc.next());
                for (int j = 0; j < i; j++) {
                    obj2.validateUsername(obj1.userDetails);
                    //continue;
                }
                System.err.println("Enter the minimum balance: ");
                obj1.userDetails[i].setAmount(sc.nextInt());
                System.err.println("Enter the address ");
                obj1.userDetails[i].setAddress(sc.next());
                System.err.println("Enter the phone number ");
                obj1.userDetails[i].setPhoneNum(sc.nextLong());
                for (int j = 0; j < i; j++) {
                    obj2.validatePhonenumber(obj1.userDetails);
                }
                System.err.println("Enter the Email address ");
                obj1.userDetails[i].setEmailId(sc.next());
                for (int j = 0; j < i; j++) {
                    obj2.validateEmailadd(obj1.userDetails);
                }
                sc.nextLine();
            }
        catch (InvalidUsername ivu)
        {
            System.out.println("Username already exists.");
        }
        catch (ValidUsername vu)
        {
            System.out.println("Username Valid.Continue");
            //continue;
        }
        catch (InvalidPhonenum iphn)
        {
            System.out.println("Phone number already exists");
        }
        catch (InvalidEmail ive)
        {
            System.out.println("Email Id already exists.");
        }

        }

    }

}
