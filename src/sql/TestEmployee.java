package sql;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		int id = scanner.nextInt();
		String role = scanner.next();
		Employee employee = new Employee();
		employee.setName(name);
		employee.setId(id);
		employee.setRole(role);
		System.out.println("employee name:" + employee.getName());
		System.out.println("Employee id:" + employee.getId());
		System.out.println("Employee role:" + employee.getRole());

	}

}
