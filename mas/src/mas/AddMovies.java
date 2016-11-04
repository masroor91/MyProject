package mas;
import java.sql.*;

class Movie{
	public int number;
	public String movieTitle;
	public String category;
	public String format;
	
	public Movie(int number, String movieTitle, String category, String format) {
		this.number=number;
		this.movieTitle=movieTitle;
		this.category=category;
		this.format=format;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	
	public String toString(){
		return this.getNumber() + " " + this.getMovieTitle() + " " + this.getMovieTitle()+ " " + this.getFormat();
	}
}

class MovieDatabase{
	private Connection con;
	
	public MovieDatabase(Connection con){
		this.con= con;
	}
	public void addMovie(Movie movie){
		System.out.println("Adding movie details" + movie.toString());
		
		try{
			Statement addMovie = con.createStatement();
			String sql = "Insert into Movies values("
					+ movie.getNumber() + ",'"
					+ movie.getMovieTitle() + "','"
				    + movie.getCategory() + "','" 
					+ movie.getFormat() + "')";
			
			System.out.println("Executing the statement");
			addMovie.executeUpdate(sql);
			addMovie.close();
			System.out.println("Added movie successfully");
		}
		catch(SQLException e ){
			
		}
	}
	
	
}

public class AddMovies {
	public static void main(String[] args){
		String url = "jdbc:odbc:"+ args[0];
		System.out.println("Attempting to connect to "+ url);
		try{
			System.out.println("Loading the driver Manager");
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			
			Connection con = DriverManager.getConnection(url);
			
			System.out.println("Connect to " + con.getCatalog() + " is success");
			
			MovieDatabase db = new MovieDatabase(con);
			
			Movie[] movies = new Movie[6];
			
			movies[0] = new Movie(1, "Star Wars", "Science Fiction", "Drama");
			movies[1] = new Movie(2, "Star Wars", "Science Fiction", "Drama");
			movies[2] = new Movie(3, "Star Wars", "Science Fiction", "Drama");
			movies[3] = new Movie(4, "Star Wars", "Science Fiction", "Drama");
			movies[4] = new Movie(5, "Star Wars", "Science Fiction", "Drama");
			movies[5] = new Movie(6, "Star Wars", "Science Fiction", "Drama");
			
			for (int i=0; i<movies.length; i++){
				db.addMovie(movies[i]);
			}
			
			System.out.println("Closing the connection");
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
