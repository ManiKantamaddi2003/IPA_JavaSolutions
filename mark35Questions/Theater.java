package mark35Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Theater {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Movie arr[]=new Movie[4];
		for(int i=0;i<arr.length;i++)
		{
			String a=scan.nextLine();
			String b=scan.nextLine();
			String c=scan.nextLine();
			int d=scan.nextInt();
			scan.nextLine();
			arr[i]=new Movie(a,b,c,d);
		}
		String genre=scan.nextLine();
		String[] res=getMovieByGenre(arr, genre);
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}

	}
	public static String[] getMovieByGenre(Movie arr[],String genre)
	{
		String[] arr2=new String[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getGenre().equals(genre))
			{
				if(arr[i].getBudget()>800000)
				{
					arr2=Arrays.copyOf(arr2, arr2.length+1);
					arr2[arr2.length-1]="High Budget Movie";
				}
				else {
					arr2=Arrays.copyOf(arr2, arr2.length+1);
					arr2[arr2.length-1]="Low Budget Movie";
				}
			}
		}
		return arr2;
	}

}
class Movie{
	private String movieName;
	private String company;
	private String genre;
	private int budget;
	public Movie(String movieName, String company, String genre, int budget) {
		
		this.movieName = movieName;
		this.company = company;
		this.genre = genre;
		this.budget = budget;
	}
	public String getMovieName() {
		return movieName;
	}
	public String getCompany() {
		return company;
	}
	public String getGenre() {
		return genre;
	}
	public int getBudget() {
		return budget;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	
	
	
}
