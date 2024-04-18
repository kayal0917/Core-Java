package sql;

public class Movie {

			String title;
			public String getTitle() {
				return title;
			}
			public void setTitle(String title) {
				this.title = title;
			}
			public int getYear() {
				return year;
			}
			public void setYear(int year) {
				this.year = year;
			}
			public String getDirector() {
				return director;
			}
			public void setDirector(String director) {
				this.director = director;
			}
			int year;
			String director;
			@Override
			public String toString() {
				return "Movie [title=" + title + ", year=" + year + ", director=" + director + "]";
			}
			public Movie(String title, int year, String director) {
				super();
				this.title = title;
				this.year = year;
				this.director = director;
			}
			
			
	
	}

