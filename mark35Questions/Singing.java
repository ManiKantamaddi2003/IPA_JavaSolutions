package mark35Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Music {
    private int playListNo;
    private String type;
    private int count;
    private double duration; // in minutes

    // Parameterized Constructor
    public Music(int playListNo, String type, int count, double duration) {
        this.playListNo = playListNo;
        this.type = type;
        this.count = count;
        this.duration = duration;
    }

    // Getters
    public int getPlayListNo() {
        return playListNo;
    }

    public String getType() {
        return type;
    }

    public int getCount() {
        return count;
    }

    public double getDuration() {
        return duration;
    }

    // Setters
    public void setPlayListNo(int playListNo) {
        this.playListNo = playListNo;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}

public class Singing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Music[] music = new Music[4]; // Adjust size as needed

        // Input for Music objects
        for (int i = 0; i < music.length; i++) {
            int playListNo = sc.nextInt();
            sc.nextLine(); // Consume newline
            String type = sc.nextLine();
            int count = sc.nextInt();
            double duration = sc.nextDouble();
            sc.nextLine(); // Consume newline
            music[i] = new Music(playListNo, type, count, duration);
        }

        // Call the findAvgOfCount method
        int averageCount = findAvgOfCount(music, 20); // Example threshold
        if (averageCount != 0) {
            System.out.println(averageCount);
        } else {
            System.out.println("No playlist found.");
        }

        // Call the sortTypeByDuration method
        Music[] sortedMusic = sortTypeByDuration(music, 50); // Example duration threshold
        if (sortedMusic != null) {
            for (Music m : sortedMusic) {
                System.out.println(m.getType());
            }
        } else {
            System.out.println("No playlist found with mentioned attribute.");
        }

        sc.close();
    }

    // Method to find the average count of Music objects above the given threshold
    public static int findAvgOfCount(Music[] music, int countThreshold) {
        int count = 0;
        int sum = 0;
        for (Music musics : music) {
            if (musics.getCount() > countThreshold) {
                sum += musics.getCount();
                count++;
            }
        }
        // Check to avoid division by zero
        return (count > 0) ? (sum / count) : 0; // Return 0 if no counts are found
    }

    // Method to sort Music objects by duration above the given threshold
    public static Music[] sortTypeByDuration(Music[] music, int durationThreshold) {
        List<Music> ls = new ArrayList<>();
        for (Music musics : music) {
            if (musics.getDuration() > durationThreshold) {
                ls.add(musics);
            }
        }
        // Return null if no items were found
        return ls.isEmpty() ? null : ls.toArray(new Music[0]);
    }
}
