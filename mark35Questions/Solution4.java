package mark35Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Team {
    private int tId;
    private String tName;
    private String tCountry;
    private int tRun;

    // Parameterized Constructor
    public Team(int tId, String tName, String tCountry, int tRun) {
        this.tId = tId;
        this.tName = tName;
        this.tCountry = tCountry;
        this.tRun = tRun;
    }

    // Getters
    public int getTId() {
        return tId;
    }

    public String getTName() {
        return tName;
    }

    public String getTCountry() {
        return tCountry;
    }

    public int getTRun() {
        return tRun;
    }

    // Setters
    public void setTId(int tId) {
        this.tId = tId;
    }

    public void setTName(String tName) {
        this.tName = tName;
    }

    public void setTCountry(String tCountry) {
        this.tCountry = tCountry;
    }

    public void setTRun(int tRun) {
        this.tRun = tRun;
    }
}

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of teams
        int numTeams = sc.nextInt();
        sc.nextLine(); // Consume newline

        // Create an array of Team objects
        Team[] teams = new Team[numTeams];

        // Input for each team
        for (int i = 0; i < numTeams; i++) {
            int tId = sc.nextInt();
            sc.nextLine(); // Consume newline
            String tName = sc.nextLine();
            String tCountry = sc.nextLine();
            int tRun = sc.nextInt();
            sc.nextLine(); // Consume newline
            teams[i] = new Team(tId, tName, tCountry, tRun);
        }

        // Input for search parameters
        int run = sc.nextInt();
        sc.nextLine(); // Consume newline
        String country = sc.nextLine();

        // Call the findPlayer method
        Team result = findPlayer(teams, run, country);

        // Print the result
        if (result != null) {
            System.out.println(result.getTId());
            System.out.println(result.getTName());
            System.out.println(result.getTCountry());
            System.out.println(result.getTRun());
        } else {
            System.out.println("No team is found from the given country and run");
        }

        sc.close();
    }

    public static Team findPlayer(Team[] teams, int run, String country) {
        // Implement the logic here to find the team with the specified conditions
    	List<Team> ls=new ArrayList<>();
    	for(Team team:teams)
    	{
    		if(team.getTCountry().equalsIgnoreCase(country) && team.getTRun()>run)
    		{
    			return team;
    			
    		}
    	}
        return null;
    }
}
