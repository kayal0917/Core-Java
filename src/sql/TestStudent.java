package sql;

public class TestStudent {
	public static void main(String[] args) {
	//	int rollno;
		//String address;
//		String location;
//		boolean joining;
		
		Student student = new Student();
		student.setName("kayal");
		student.setRollno(102);
		student.setAddress("Thallakulam");
		student.setLocation("Madurai");
		student.setJoining(true);
		System.out.println(student.getName());
		System.out.println(student.getAddress());
		System.out.println(student.getLocation());
		System.out.println(student.getRollno());
		//System.out.println(");
	}

}
