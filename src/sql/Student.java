package sql;

public class Student {
	String name;
	int rollno;
	String address;
	String location;
	boolean joining;

	public Student() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isJoining() {
		return joining;
	}

	public void setJoining(boolean joining) {
		this.joining = joining;
	}

	public Student(String name, int rollno, String address, String location, boolean joining) {
		this.rollno = rollno;
		this.address = address;
		this.location = location;
		this.joining = joining;
	}

	@Override
	public String toString() {
		return "Encapsulation [rollno=" + rollno + ", address=" + address + ", location=" + location + ", joining="
				+ joining + ", name=" + name + "]";
	}

}
