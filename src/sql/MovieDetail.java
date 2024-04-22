package sql;

public class MovieDetail implements MovieDetails{

	@Override
	public void booking() {
		System.out.println("booking ticket");
	}

	@Override
	public void statuscheck() {
		System.out.println("checking status");
	}
	
}
