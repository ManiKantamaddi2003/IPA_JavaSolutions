package mark35Questions;

import java.util.Scanner;
import java.util.TreeSet;

class MobileDetails {
    private int mobileId;
    private int price;
    private String brand;
    private boolean isFlagShip;

    // Parameterized Constructor
    public MobileDetails(int mobileId, int price, String brand, boolean isFlagShip) {
        this.mobileId = mobileId;
        this.price = price;
        this.brand = brand;
        this.isFlagShip = isFlagShip;
    }

    // Getters
    public int getMobileId() {
        return mobileId;
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isFlagShip() {
        return isFlagShip;
    }

    // Setters
    public void setMobileId(int mobileId) {
        this.mobileId = mobileId;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setFlagShip(boolean isFlagShip) {
        this.isFlagShip = isFlagShip;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MobileDetails[] mobiles = new MobileDetails[5];

        // Reading MobileDetails objects
        for (int i = 0; i < 5; i++) {
            int mobileId = scanner.nextInt();
            int price = scanner.nextInt();
            String brand = scanner.next();
            boolean isFlagShip = scanner.nextBoolean();
            mobiles[i] = new MobileDetails(mobileId, price, brand, isFlagShip);
        }

        // Read brand for total price calculation
        String brandForTotalPrice = scanner.next();
        
        // Call the getTotalPrice method and print the result
        int totalPrice = getTotalPrice(mobiles, brandForTotalPrice);
        if (totalPrice != 0) {
            System.out.println(totalPrice);
        } else {
            System.out.println("There are no mobile with given brand");
        }

        // Call the getSecondMin method and print the result
        int secondMinResult = getSecondMin(mobiles);
        if (secondMinResult != 0) {
        	for(MobileDetails sec:mobiles)
        	{
        		if(sec.getPrice()==secondMinResult)
        		{
        		System.out.println(sec.getBrand()+":"+sec.getPrice());
        		}
        	}
        }
        else
        {
        	System.out.println("No Such");
        }

        scanner.close();
    }

    // Method signatures
    public static int getTotalPrice(MobileDetails[] mobiles, String brand) {
        // Implementation logic goes here
    	int sum=0;
    	for(MobileDetails md:mobiles)
    	{
    		if(md.getBrand().equalsIgnoreCase(brand))
    		{
    			sum=sum+md.getPrice();
    		}
    	}
    	return sum;
  
    }

    public static int getSecondMin(MobileDetails[] mobiles) {
    	TreeSet<MobileDetails> ts=new TreeSet<>((f1,f2)->Integer.compare(f1.getPrice(),f2.getPrice()));
        for(MobileDetails md:mobiles)
        {
        	ts.add(md);
        }
        MobileDetails m1=ts.pollFirst();
        MobileDetails m2=ts.pollFirst();
        return m2.getPrice();
        
    }
}

