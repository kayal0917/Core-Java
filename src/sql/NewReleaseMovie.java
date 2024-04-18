package sql;

public class NewReleaseMovie {
	public static void main(String[] args) {
		RegularMovie r=new RegularMovie();
		r.printUserDetails();
		
		ParentMovie a=new ParentMovie();
		a.booking();
		
		ChildrenMovie b=new ChildrenMovie();
		b.booking();
	}


}
