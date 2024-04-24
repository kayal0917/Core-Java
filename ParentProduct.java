package product;

import java.util.Scanner;

public class ParentProduct {
	public void stock(){
	
	Scanner scanner = new Scanner(System.in);{
	System.out.println("Enter ID to know the stock:");
    int stock=scanner.nextInt();
    System.out.println("Total Stock:");
     switch (stock) {
         case 1:
         	System.out.println("    MILK-25liter");
             break;
     
         case 2:
         	System.out.println("    WHEAT-50kg");
             break;
         case 3: 
         	System.out.println("    BREAD-25pct");
             break;
         case 4:
         	System.out.println("    chips-20pct");
             break;
         case 5:
         	System.out.println("    EGG-100eggs");
             break;
         case 6:
         	System.out.println("    COOL DRINKS-5case");
             break;
         case 7:
         	System.out.println("    PICKELS-15bottle");
             break;
         case 8:
         	System.out.println("    Sweet-8box");
             break;
         case 9:
         	System.out.println("     OIL-25liter");
             break;
         case 10:
         	System.out.println("     MEAT-10kg");
             break;
         
             
         
     }

     
}    
	}
}

	

	


