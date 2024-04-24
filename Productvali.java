package product;
import java.util.Scanner;
public class Productvali {

//		int productid;
//		String productname;
//		int productprice;
//		int quantity;
public void getInput(){
		Scanner scanner = new Scanner(System.in);{
		System.out.println("Enter product ID: 1.MILK , 2.WHEAT, 3.BREAD ,4.CHIPS, 5.EGG, 6.COOL DRINKS,7.PICKEL, 8.sweet,9.Oil,10.MEAT");{
		/*int productId = scanner.nextInt();
		String s1 = "^[a-zA-Z]+$";
		if (productId > 0) {
			scanner.nextLine();
			System.out.println("Enter product name:");
			String productName = scanner.nextLine();
			if (productName.matches(s1))*/
				
		        System.out.println("enter the PRODUCT ID:");
		       String product=scanner.next();

		        switch (product) {
		            case "1":
		            	System.out.println("MILK");
		                break;
		            case "2":
		            	System.out.println("WHEAT");
		                break;
		            case "3":
		            	System.out.println("BREAD");
		                break;
		            case "4":
		            	System.out.println("CHIPS");
		                break;
		            case "5":
		            	System.out.println("EGG");
		                break;
		            case "6":
		            	System.out.println("COOL DRINKS");
		                break;
		            case "7":
		            	System.out.println("PICKELS");
		                break;
		            case "8":
		            	System.out.println("sweet");
		                break;
		            case "9":
		            	System.out.println("OIL");
		                break;
		            case "10":
		            	System.out.println("MEAT");
		                break;
		            
		                
		            
		        }

		        
		        
		    }
		System.out.println("Enter product price:");
		int productPrice = scanner.nextInt();
//		if (productId > 0) {
			System.out.println("Enter quantity:");
			int quantity = scanner.nextInt();
//			if (productId > 0) {
				System.out.println("Total amount is " + productPrice * quantity);
			}
			


	}

			}
		
		
		
		

		