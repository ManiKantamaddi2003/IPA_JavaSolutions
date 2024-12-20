package mark35Questions;

import java.util.Scanner;
import java.util.TreeSet;

class Engine {
    private int engineId;
    private String engineName;
    private String engineType;
    private double enginePrice;

    // Parameterized Constructor
    public Engine(int engineId, String engineName, String engineType, double enginePrice) {
        this.engineId = engineId;
        this.engineName = engineName;
        this.engineType = engineType;
        this.enginePrice = enginePrice;
    }

    // Getters
    public int getEngineId() {
        return engineId;
    }

    public String getEngineName() {
        return engineName;
    }

    public String getEngineType() {
        return engineType;
    }

    public double getEnginePrice() {
        return enginePrice;
    }

    // Setters
    public void setEngineId(int engineId) {
        this.engineId = engineId;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void setEnginePrice(double enginePrice) {
        this.enginePrice = enginePrice;
    }
}

class Vehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Engine[] engines = new Engine[4];

        // Input for Engine objects
        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline
            String name = sc.nextLine();
            String type = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine(); // Consume newline
            engines[i] = new Engine(id, name, type, price);
        }

        // Input for engine type and engine name
        String engineType = sc.nextLine();
        String engineName = sc.nextLine();

        // Call the methods and print the results
        int averagePrice = findAvgEnginePriceByType(engines, engineType);
        if (averagePrice > 0) {
            System.out.println(averagePrice);
        } else {
            System.out.println("There are no engine with given type");
        }

        Engine[] searchedEngines = searchEngineByName(engineName, engines);
        if (searchedEngines != null) {
            for (Engine engine : searchedEngines) {
                System.out.println(engine.getEngineId());
            }
        } else {
            System.out.println("There are no engine with the given name");
        }

        sc.close();
    }

    // Method signatures
    public static int findAvgEnginePriceByType(Engine[] engines, String type) {
        double sum=0;
        int avg=0;
        int count=0;
    	for(Engine engine:engines)
        {
        	if(engine.getEngineType().equalsIgnoreCase(type))
        	{
        		sum=sum+engine.getEnginePrice();
        		count++;
        	}
        }
    	avg=(int)sum/count;
        return avg; // Placeholder return
    }

    public static Engine[] searchEngineByName(String name, Engine[] engines) {
        
    	TreeSet<Engine>ts=new TreeSet<>((f1,f2)->Double.compare(f2.getEnginePrice(),f1.getEnginePrice()));
    	for(Engine engine:engines)
    	{
    		if(engine.getEngineName().equalsIgnoreCase(name))
    		{
    			ts.add(engine);
    		}
    	}
    	Engine arr[]=ts.toArray(new Engine[0]);
        return arr; // Placeholder return
    }
}
