package mark35Questions;

import java.util.Scanner;
import java.util.TreeSet;

class Sim2 {
    private int id;
    private String company;
    private int balance;
    private double ratePerSecond;
    private String circle;

    // Constructor
    public Sim2(int id, String company, int balance, double ratePerSecond, String circle) {
        this.id = id;
        this.company = company;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public int getBalance() {
        return balance;
    }

    public double getRatePerSecond() {
        return ratePerSecond;
    }

    public String getCircle() {
        return circle;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setRatePerSecond(double ratePerSecond) {
        this.ratePerSecond = ratePerSecond;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }
}

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sim2[] sims = new Sim2[4];

        // Input for Sim objects
        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline
            String company = sc.nextLine();
            int balance = sc.nextInt();
            double ratePerSecond = sc.nextDouble();
            sc.nextLine(); // Consume newline
            String circle = sc.nextLine();
            sims[i] = new Sim2(id, company, balance, ratePerSecond, circle);
        }

        // Input for search_circle and search_rate
        String search_circle = sc.nextLine();
        double search_rate = sc.nextDouble();

        // Call the method and print the results
        Sim2[] result = matchAndSort(sims, search_circle, search_rate);
        if (result != null) {
            for (Sim2 sim : result) {
                System.out.println(sim.getId());
            }
        }

        sc.close();
    }

    public static Sim2[] matchAndSort(Sim2[] sims, String search_circle, double search_rate) {
        
    	
    	TreeSet<Sim2> ts=new TreeSet<>((f1,f2)->Integer.compare(f2.getBalance(),f1.getBalance()));
    	for(Sim2 matched:sims)
    	{
    		if(matched.getCircle().equalsIgnoreCase(search_circle) && matched.getRatePerSecond()<search_rate)
    		{
    			ts.add(matched);
    		}
    	}
    	return ts.toArray(new Sim2[0]);
    }
}

