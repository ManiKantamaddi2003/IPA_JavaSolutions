package mark35Questions;

import java.util.Scanner;
import java.util.TreeSet;

class Song {
    private int songId;
    private String title;
    private String artist;
    private double duration;

    // Parameterized constructor
    public Song(int songId, String title, String artist, double duration) {
        this.songId = songId;
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    // Getters
    public int getSongId() {
        return songId;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public double getDuration() {
        return duration;
    }

    // Setters
    public void setSongId(int songId) {
        this.songId = songId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}

class MyClass2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read 5 Song objects
        Song[] songs = new Song[5];
        for (int i = 0; i < 5; i++) {
            int songId = scanner.nextInt();
            scanner.nextLine();
            String title = scanner.nextLine();
            String artist = scanner.nextLine();
            double duration = scanner.nextDouble();
            scanner.nextLine();
            songs[i] = new Song(songId, title, artist, duration);
        }
        
        // Read two artist names
        String artist1 = scanner.nextLine();
        String artist2 = scanner.nextLine();
        
        // Call methods and print results
        double res=findSongDurationForArtist(songs, artist1);
        if(res!=0)
        {
        	System.out.println(res);
        }
        else
        {
        	System.out.println("There are no songs with that artist");
        }
        // Call findSongDurationForArtist and handle output
        // Call getSongsInAscendingOrder and handle output
        Song[] song=getSongsInAscendingOrder(songs, artist2);
        if(song!=null)
        {
        for(Song sos:song)
        {
        	System.out.println(sos.getSongId()+"\n"+sos.getTitle());
        }
        }
        else
        {
        	System.out.println("No such Artist");
        }
        
        scanner.close();
    }

    public static double findSongDurationForArtist(Song[] songs, String artist) {
    	double sum=0.0;
    	for(Song song:songs)
    	{
    		if(song.getArtist().equalsIgnoreCase(artist))
    		{
    			sum=sum+song.getDuration();
    		}
    	}
        return sum; // Placeholder
    }

    public static Song[] getSongsInAscendingOrder(Song[] songs, String artist) {
        // Implementation logic goes here
    	TreeSet<Song>ts=new TreeSet<>((f1,f2)->Double.compare(f1.getDuration(),f2.getDuration()));
    	for(Song song:songs)
    	{
    		if(song.getArtist().equalsIgnoreCase(artist))
    		{
    			ts.add(song);
    		}
    	}
    	if(ts.size()==0)
    	{
    		return null;
    	}
        return ts.toArray(new Song[0]); // Placeholder
    }
}

