package mark35Questions;

import java.util.Scanner;

public class Education {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Inistitution arr[]=new Inistitution[4];
		for(int i=0;i<4;i++)
		{
			int a=scan.nextInt();
			scan.nextLine();
			String b=scan.nextLine();
			int c=scan.nextInt();
			int d=scan.nextInt();
			scan.nextLine();
			String e=scan.nextLine();
			String f=scan.nextLine();
			arr[i]=new Inistitution(a,b,c,d,e,f);
		}
		String location=scan.nextLine();
		int clearedStudents=findNumClearancedByLoc(arr,location);
		System.out.println(clearedStudents);
		String name=scan.nextLine();
		Inistitution obj=updateInistitutionGrade(arr, name);
		if(obj==null)
		{
			System.out.println("No Institute is Available");
		}
		else
		{
			System.out.println(obj.getName()+" :: "+obj.getGrade());
		}
	}
	public static int findNumClearancedByLoc(Inistitution arr[],String location)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getLocation().equalsIgnoreCase(location))
			{
				sum=sum+arr[i].getNoOfStudentsCleared();
			}
		}
		if(sum>0)
		{
			return sum;
		}
		else {
			return 0;
		}
	}
	
	public static Inistitution updateInistitutionGrade(Inistitution arr[],String Name)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getName().equalsIgnoreCase(Name))
			{
				int rating=(arr[i].getNoOfStudentsPalced()*100)/arr[i].getNoOfStudentsCleared();
				if(rating>=80)
				{
					arr[i].setGrade("A");
				}
				else
				{
					arr[i].setGrade("B");
				}
				return arr[i];
			}
		}
		return null;
	}


}
class Inistitution{
	private int id;
	private String name;
	private int noOfStudentsPalced;
	private int noOfStudentsCleared;
	private String location;
	private String grade;
	public Inistitution(int id, String name, int noOfStudentsPalced, int noOfStudentsCleared, String location,
			String grade) {
		this.id = id;
		this.name = name;
		this.noOfStudentsPalced = noOfStudentsPalced;
		this.noOfStudentsCleared = noOfStudentsCleared;
		this.location = location;
		this.grade = grade;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getNoOfStudentsPalced() {
		return noOfStudentsPalced;
	}
	public int getNoOfStudentsCleared() {
		return noOfStudentsCleared;
	}
	public String getLocation() {
		return location;
	}
	public void setGrade(String grade)
	{
		this.grade=grade;
	}
	public String getGrade() {
		return grade;
	}	
}
