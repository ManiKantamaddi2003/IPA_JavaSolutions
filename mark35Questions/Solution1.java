package mark35Questions;

import java.util.Scanner;

class Institution {
    private int institutionId;
    private String institutionName;
    private int noOfStudentsPlaced;
    private int noOfStudentsCleared;
    private String location;
    private String grade;

    // Parameterized Constructor
    public Institution(int institutionId, String institutionName, int noOfStudentsPlaced, int noOfStudentsCleared, String location) {
        this.institutionId = institutionId;
        this.institutionName = institutionName;
        this.noOfStudentsPlaced = noOfStudentsPlaced;
        this.noOfStudentsCleared = noOfStudentsCleared;
        this.location = location;
    }

    // Getters
    public int getInstitutionId() {
        return institutionId;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public int getNoOfStudentsPlaced() {
        return noOfStudentsPlaced;
    }

    public int getNoOfStudentsCleared() {
        return noOfStudentsCleared;
    }

    public String getLocation() {
        return location;
    }

    public String getGrade() {
        return grade;
    }

    // Setters
    public void setInstitutionId(int institutionId) {
        this.institutionId = institutionId;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public void setNoOfStudentsPlaced(int noOfStudentsPlaced) {
        this.noOfStudentsPlaced = noOfStudentsPlaced;
    }

    public void setNoOfStudentsCleared(int noOfStudentsCleared) {
        this.noOfStudentsCleared = noOfStudentsCleared;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Institution[] institutions = new Institution[4];

        // Input for Institution objects
        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline
            String name = sc.nextLine();
            int placed = sc.nextInt();
            int cleared = sc.nextInt();
            sc.nextLine(); // Consume newline
            String loc = sc.nextLine();
            institutions[i] = new Institution(id, name, placed, cleared, loc);
        }

        // Input for location and institution name
        String location = sc.nextLine();
        String institutionName = sc.nextLine();

        // Call the methods and print the results
        int numClearanced = findNumClearancedByLoc(institutions, location);
        if (numClearanced > 0) {
            System.out.println(numClearanced);
        } else {
            System.out.println("There are no cleared students in this particular location");
        }

        Institution inst = updateInstitutionGrade(institutions, institutionName);
        if (inst != null) {
            System.out.println(inst.getInstitutionName() + "::" + inst.getGrade());
        } else {
            System.out.println("No Institute is available with the specified name");
        }

        sc.close();
    }

    public static int findNumClearancedByLoc(Institution[] instArray, String location) {
        // Logic to implement
    	int sum=0;
    	for(Institution ins:instArray)
    	{
    		if(ins.getLocation().equalsIgnoreCase(location))
    		{
    			sum=sum+ins.getNoOfStudentsCleared();
    		}
    	}
    	return sum;
    }

    public static Institution updateInstitutionGrade(Institution[] instArray, String instName) {
        // Logic to implement
    	
    	for(Institution arr:instArray)
    	{
    		if(arr.getInstitutionName().equalsIgnoreCase(instName))
    		{
    			int rating=(arr.getNoOfStudentsPlaced()*100)/arr.getNoOfStudentsCleared();
    			if(rating>=80)
    			{
    				arr.setGrade("A");
    				
    			}
    			else
    			{
    				arr.setGrade("B");
    			}
    			return arr;
    		}
    	}
    	return null;
    }
}

