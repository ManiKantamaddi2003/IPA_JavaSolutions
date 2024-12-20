package mark35Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Players {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Player21[] arr=new Player21[4];
		for(int i=0;i<arr.length;i++)
		{
			int a=scan.nextInt();
			scan.nextLine();
			String b=scan.nextLine();
			//scan.nextLine();
			int c=scan.nextInt();
			int d=scan.nextInt();
			int e=scan.nextInt();
			arr[i]=new Player21(a, b, c, d, e);
			
		}
		int runs=scan.nextInt();
		Double avg[]=findAverageOfRuns(arr,runs);
		for(Double res:avg)
		{
			if(res>80 && res<100)
			{
				System.out.println("Grade A");
			}
			else if(res>50 && res<79)
			{
				System.out.println("Grade B");
			}
			else
			{
				System.out.println("Grade C");
			}
		}

	}
	
	public static Double[]  findAverageOfRuns(Player21[] arr,int runs)
	{
		List<Double>ls=new ArrayList<>();
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].matchesPlayed>=runs)
			{
				double average=arr[i].getrunsScored()/arr[i].getMatchesPlayed();
				ls.add(average);
			}
		}
		return ls.toArray(new Double[0]);
		
	}

}
class Player21
{
	int id;
	String name;
	int iccrank;
	int matchesPlayed;
	int runsScored;
	
	Player21(int id,String name,int iccrank,int matchesPlayed,int runsScored)
	{
		this.id=id;
		this.name=name;
		this.iccrank=iccrank;
		this.matchesPlayed=matchesPlayed;
		this.runsScored=runsScored;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int geticcrank()
	{
		return iccrank;
	}
	public int getMatchesPlayed()
	{
		return matchesPlayed;
	}
	public int getrunsScored()
	{
		return runsScored;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void seticcRank(int iccrank)
	{
		this.iccrank=iccrank;
	}
	public void setMatchesPlayed(int matchesPlayed)
	{
		this.matchesPlayed=matchesPlayed;
	}
	public void setrunsScored(int runsScored)
	{
		this.runsScored=runsScored;
	}
}
