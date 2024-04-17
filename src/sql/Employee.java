package sql;

public class Employee {

	String name;
	int id;
	String role;
	public Employee() {
	}
	public String getName() {
		return name;
	}
	public String setName(String name) {
		if (name.matches("[a-zA-Z]+")) {
			this.name = name;
		} else {
			System.out.println("please enter alphabetic character only");
		}
		return name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {

		if (id > 0) {
			this.id = id;
		} else {
			System.out.println("Enter the valid input");
		}
	}

	public String getRole() {
		return role;
	}
	public void setRole(String role) {

		if (role.matches("[a-zA-Z]+")) {
			this.role = role;
		} else {
			System.out.println("please enter alphabetic only");
		}
	}
	public Employee(String name, int id, String role) {
		super();
		this.name = name;
		this.id = id;
		this.role = role;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", role=" + role + "]";
	}
}