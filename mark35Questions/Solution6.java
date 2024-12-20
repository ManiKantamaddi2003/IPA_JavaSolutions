package mark35Questions;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Player3 {
    private int id;
    private String name;
    private String country;
    private int matchesPlayed;
    private int runsScored;

    // Parameterized Constructor
    public Player3(int id, String name, String country, int matchesPlayed, int runsScored) {
        this.id = id;
        this.name = name;
        this.country = country;
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

    public String getCountry() {
        return country;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public int getRunsScored() {
        return runsScored;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }
}

public class Solution6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numPlayers = sc.nextInt();
        Player3[] players = new Player3[numPlayers];

        // Input for Player objects
        for (int i = 0; i < numPlayers; i++) {
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline
            String name = sc.nextLine();
            String country = sc.nextLine();
            int matchesPlayed = sc.nextInt();
            int runsScored = sc.nextInt();
            sc.nextLine(); // Consume newline
            players[i] = new Player3(id, name, country, matchesPlayed, runsScored);
        }

        String targetCountry = sc.nextLine();
        int targetRuns = sc.nextInt();

        // Call the findPlayerName method
        Player3[] matchedPlayers = findPlayerName(players, targetCountry, targetRuns);

        // Logic to print the matched players
        if (matchedPlayers.length > 0) {
            Arrays.sort(matchedPlayers, Comparator.comparing(Player3::getRunsScored));
            for (Player3 player : matchedPlayers) {
                System.out.println(player.getId() + ":" + player.getName());
            }
        } else {
            System.out.println("No player found");
        }

        sc.close();
    }

    // Method to find players by country and runs scored
    public static Player3[] findPlayerName(Player3[] players, String country, int runs) {
        ArrayList<Player3> matchedList = new ArrayList<>();
        // Convert country to lowercase for case insensitive comparison
        String lowerCountry = country.toLowerCase();
        
        for (Player3 player : players) {
            // Check if country matches and runs scored is greater than the input runs
            if (player.getCountry().toLowerCase().equals(lowerCountry) && player.getRunsScored() > runs) {
                matchedList.add(player);
            }
        }
        return matchedList.toArray(new Player3[0]); // Convert to array and return
    }
}

