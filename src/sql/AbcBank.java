package sql;

import java.util.Scanner;

public class AbcBank {

    public static Bank getUserDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accountno = scanner.nextInt();
        while(true)
        
        	if(accountno>0)
        	{
        		break;
        	}
        	else
        	{
        		System.out.println("Enter the valid data:");
        		accountno = scanner.nextInt();
        	}
        
        String s1="^[a-zA-Z]+$";
        System.out.print("Enter name:");
        String name = scanner.next();
        while(true)
        	if(name.matches(s1))
        	{
        		break;
        	}
        	else
        	{
        		System.out.println("Enter the valid Data:");
        		name = scanner.next();
        	}
        
        System.out.print("Enter branch: ");
        String branch = scanner.next();
        while(true)
        	if(name.matches(s1))
        	{
        		break;
        	}
        	else
        	{
        		System.out.println("Enter the valid Data:");
        		name = scanner.next();
        	}

        
        System.out.print("Enter mobile number: ");
        long mobileno = scanner.nextLong();
        while(true)
            
        	if(mobileno>0)
        	{
        		break;
        	}
        	else
        	{
        		System.out.println("Enter the valid data:");
        		mobileno = scanner.nextInt();
        	}
        
        
       return null;

    }
    public static void deposit(int amount, int accountNumber,int deposit) {
        System.out.println("Amount deposited - self");
        System.out.println(deposit + " has been deposited");
        int totalBalance=amount+deposit;
        System.out.println(totalBalance +" Total Balance Amount");
    }
    public static void deposit(int amount, int accountNumber,int deposit, int mobileNo) {
        System.out.println("Amount deposited - "+ accountNumber + "And mobile number"+mobileNo);
        System.out.println(deposit + " has been deposited");
        int totalBalance=amount+deposit;
        System.out.println(totalBalance +" Total Balance Amount");
    }
 
    
    public static void printUserDetails(Bank bank) {
        System.out.println(bank);
    }
    public static void main(String[] args) {
        Bank userBankDetails = getUserDetails();
        printUserDetails(userBankDetails);
        deposit(20000,4753465,56698968);
        Deposit e=new Deposit();
        e.deposit(2400);
        
        
        
    }
}
