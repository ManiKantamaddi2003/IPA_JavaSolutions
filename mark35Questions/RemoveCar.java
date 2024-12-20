package mark35Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Car {
    private int carId;
    private String carName;
    private String fuelType;

    // Parameterized Constructor
    public Car(int carId, String carName, String fuelType) {
        this.carId = carId;
        this.carName = carName;
        this.fuelType = fuelType;
    }

    // Getters
    public int getCarId() {
        return carId;
    }

    public String getCarName() {
        return carName;
    }

    public String getFuelType() {
        return fuelType;
    }

    // Setters
    public void setCarId(int carId) {
        this.carId = carId;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}

public class RemoveCar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car[] cars = new Car[5];

        // Input for Car objects
        for (int i = 0; i < cars.length; i++) {
            int carId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            String carName = scanner.nextLine();
            String fuelType = scanner.nextLine();
            cars[i] = new Car(carId, carName, fuelType);
        }

        // Input for the car ID to be removed
        int carIdToRemove = scanner.nextInt();

        // Call the RemoveAndRearrange method
        Car[] updatedCars = RemoveAndRearrange(cars, carIdToRemove);

        // Print the result
        if (updatedCars != null) {
            for (Car car : updatedCars) {
                System.out.println(car.getCarId() + " : " + car.getCarName());
            }
        } else {
            System.out.println("There are no car with given id");
        }

        scanner.close();
    }

    // Method signature
    public static Car[] RemoveAndRearrange(Car[] cars, int carId) {
        // Implementation logic goes here
    	List<Car> ls=new ArrayList<>();
    	boolean carFound=false;
    	for(Car car:cars)
    	{
    		if(car.getCarId()!=carId)
    		{
    			ls.add(car);
    		}
    		else {
    			carFound=true;
    		}
    	}
    	if(!carFound)
    	{
    		return null;
    	}
    	return ls.toArray(new Car[0]);
    	
    }
}

