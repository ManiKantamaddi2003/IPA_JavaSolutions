package mark35Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Player2 {
    private int id;
    private String name;
    private int iccRank;
    private int matchesPlayed;
    private int runsScored;

    // Parameterized constructor
    public Player2(int id, String name, int iccRank, int matchesPlayed, int runsScored) {
        this.id = id;
        this.name = name;
        this.iccRank = iccRank;
        this.matchesPlayed = matchesPlayed;
        this.runsScored = runsScored;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getIccRank() {
        return iccRank;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public int getRunsScored() {
        return runsScored;
    }
}

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player2[] players = new Player2[4];

        // Input for Player objects
        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline
            String name = sc.nextLine();
            int iccRank = sc.nextInt();
            int matchesPlayed = sc.nextInt();
            int runsScored = sc.nextInt();
            players[i] = new Player2(id, name, iccRank, matchesPlayed, runsScored);
        }

        // Input for the target number of matches
        int target = sc.nextInt();

        // Call the method and get the average run array
        Integer[] averages = findAverageOfRuns(players, target);

        // Print grade for each average run
        for (int avg : averages) {
            if (avg >= 80 && avg <= 100) {
                System.out.println("Grade A");
            } else if (avg >= 50 && avg < 80) {
                System.out.println("Grade B");
            } else {
                System.out.println("Grade C");
            }
        }

        sc.close();
    }

    public static Integer[] findAverageOfRuns(Player2[] players, int target) {
        int count = 0;
        List<Integer> ls=new ArrayList<>();
        // Count how many players meet the criteria
        for (Player2 player : players) {
            if (player.getMatchesPlayed() >= target) {
                int average=player.getRunsScored()/player.getMatchesPlayed();
                ls.add(average);
            }
        }
        return ls.toArray(new Integer[0]);
    }
}

