package sql;
import java.util.Scanner;
public class Productvali {

	public static void main(String[] args) {
//		int productid;
//		String productname;
//		int productprice;
//		int quantity;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter product ID:");
		int productId = scanner.nextInt();
		String s1 = "^[a-zA-Z]+$";
		if (productId > 0) {
			scanner.nextLine();
			System.out.println("Enter product name:");
			String productName = scanner.nextLine();
			if (productName.matches(s1))
				System.out.println("Enter product price:");
			int productPrice = scanner.nextInt();
			if (productId > 0) {
				System.out.println("Enter quantity:");
				int quantity = scanner.nextInt();
				if (productId > 0) {
					System.out.println("Total amount is " + productPrice * quantity);
				}
			}
		}
	}
}
