package mark35Questions;

import java.util.Scanner;

class Vegetable {
    private int vegetableId;
    private String vegetableName;
    private int price;
    private int rating;

    // Parameterized constructor
    public Vegetable(int vegetableId, String vegetableName, int price, int rating) {
        this.vegetableId = vegetableId;
        this.vegetableName = vegetableName;
        this.price = price;
        this.rating = rating;
    }

    // Getters
    public int getVegetableId() {
        return vegetableId;
    }

    public String getVegetableName() {
        return vegetableName;
    }

    public int getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    // Setters
    public void setVegetableId(int vegetableId) {
        this.vegetableId = vegetableId;
    }

    public void setVegetableName(String vegetableName) {
        this.vegetableName = vegetableName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}

class Vegetable1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read 4 Vegetable objects
        Vegetable[] vegetables = new Vegetable[4];
        for (int i = 0; i < 4; i++) {
            int vegetableId = scanner.nextInt();
            scanner.nextLine();
            String vegetableName = scanner.nextLine();
            int price = scanner.nextInt();
            int rating = scanner.nextInt();
            vegetables[i] = new Vegetable(vegetableId, vegetableName, price, rating);
        }
        
        // Read the rating value
        int ratingInput = scanner.nextInt();
        
        // Call findMinimumPriceByRating method and handle output
        Vegetable result = findMinimumPriceByRating(vegetables, ratingInput);
        
        if (result != null) {
            System.out.println(result.getVegetableId());
        } else {
            System.out.println("No such Vegetables");
        }

        scanner.close();
    }

    public static Vegetable findMinimumPriceByRating(Vegetable[] vegetables, int rating) {
        // Implementation logic goes here
    	Vegetable minPrice=null;
    	for(Vegetable veg:vegetables)
    	{
    		if(veg.getRating()>rating)
    		{
    			if(minPrice==null || veg.getPrice()<minPrice.getPrice())
    			{
    				minPrice=veg;
    			}
    		}
    	}
        return minPrice; // Placeholder
    }
}

