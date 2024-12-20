package mark35Questions;
import java.util.Scanner;

//Class representing a beach
class Beach {
 private int beachId;
 private String beachName;
 private int beachRating;
 private int beachCost;

 // Parameterized constructor
 public Beach(int beachId, String beachName, int beachRating, int beachCost) {
     this.beachId = beachId;
     this.beachName = beachName;
     this.beachRating = beachRating;
     this.beachCost = beachCost;
 }

 // Getters
 public int getBeachId() {
     return beachId;
 }

 public String getBeachName() {
     return beachName;
 }

 public int getBeachRating() {
     return beachRating;
 }

 public int getBeachCost() {
     return beachCost;
 }

 // Setters
 public void setBeachId(int beachId) {
     this.beachId = beachId;
 }

 public void setBeachName(String beachName) {
     this.beachName = beachName;
 }

 public void setBeachRating(int beachRating) {
     this.beachRating = beachRating;
 }

 public void setBeachCost(int beachCost) {
     this.beachCost = beachCost;
 }
}

//Class containing the main method and static methods
class Solution7 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     // Input for beach objects
     Beach[] beaches = new Beach[4];
     for (int i = 0; i < 4; i++) {
         int beachId = scanner.nextInt();
         scanner.nextLine(); // Consume newline
         String beachName = scanner.nextLine();
         int beachRating = scanner.nextInt();
         int beachCost = scanner.nextInt();
         beaches[i] = new Beach(beachId, beachName, beachRating, beachCost);
     }
     
     // Input for search parameters
     String searchName = scanner.next();
     int costThreshold = scanner.nextInt();

     // Call findLeastRatingWithName method and handle output
     int leastRating = findLeastRatingWithName(beaches, searchName, costThreshold);

     if (leastRating == 0) {
         System.out.println("No beach found");
     } else {
         System.out.println(leastRating);
     }

     scanner.close();
 }

 // Method to be implemented
 public static int findLeastRatingWithName(Beach[] beaches, String name, int cost) {
	    int leastRating = Integer.MAX_VALUE; // Initialize to maximum value
	    boolean found = false; // Flag to check if any matching beach is found

	    for (Beach beach : beaches) {
	        // Check for matching beach name and cost condition
	        if (beach.getBeachName().equalsIgnoreCase(name) && beach.getBeachCost() > cost) {
	            found = true; // At least one matching beach found
	            // Update leastRating if the current beach's rating is lower
	            if (beach.getBeachRating() < leastRating) {
	                leastRating = beach.getBeachRating();
	            }
	        }
	    }

	    // If no matching beach was found, return 0
	    return found ? leastRating : 0;
	}

}
