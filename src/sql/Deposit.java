package sql;

public class Deposit extends AbcBank {
	    private double balance;

		@override
	    public void deposit(int amount) {
	        double bonus = amount * 0.05;
	        this.balance += amount + bonus;
	        System.out.println("Deposit of $" + amount +" made with a 5% bonus of $" + bonus + ". New balance is $" + this.balance);
	    }

	}


	


