package product;

import java.util.Scanner;

public class ChildProduct extends ParentProduct {
	
	public int stock;
	public int quantity;

	public void stock(int stock,int quantity) {
		

		ParentProduct p = new ParentProduct();
		Scanner scanner = new Scanner(System.in);
		
			System.out.println("Enter your balance");
			System.out.println("Balance stock");
			int balance;
			System.out.println(stock);
			System.out.println(quantity);
			System.out.println("Balance is "+(balance=stock - quantity));

		}
	}


