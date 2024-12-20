package mark35Questions;

import java.util.Scanner;

public class CAarClass {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		vcle arr[]=new vcle[4];
		for(int i=0;i<arr.length;i++)
		{
			String a=scan.nextLine();
			String b=scan.nextLine();
			//scan.nextLine();
			int c=scan.nextInt();
			Double d=scan.nextDouble();
			scan.nextLine();
			arr[i]=new vcle(a, b, c, d);
		}
		String make=scan.nextLine();
		String model=scan.nextLine();
		vcle expensive=findmostExpensiveCar(arr);
		if(expensive!=null)
		{
			System.out.println(expensive.getMake()+"\n"+expensive.getModel()+"\n"+expensive.getYear()+"\n"+expensive.getPrice());
			
		}
		else
		{
			System.out.println("Sorry - No car is available");
		}
		
		
		vcle car=getCarByMakeAndModel(arr, make, model);
		if(car!=null)
		{
			System.out.println(car.getYear()+"\n"+car.getPrice());
		}
		else
		{
			System.out.println("Sorry - No car is available");
		}
		
		
	}
	public static vcle findmostExpensiveCar(vcle[] arr)
	{
		
		Double high=arr[0].getPrice();
		for(vcle car:arr)
		{
			if(car.getPrice()>high)
			{
				high=car.getPrice();
			}
		}
		for(vcle car:arr)
		{
			if(car.getPrice()==high)
			{
				return car;
			}
		}
		return null;
	}
	public static vcle getCarByMakeAndModel(vcle cars[],String make,String model)
	{
		for(vcle car:cars)
		{
			if(car.getMake().equalsIgnoreCase(make) && car.getModel().equalsIgnoreCase(model))
			{
				return car;
			}
		}
		return null;
	}
}
class vcle
{
	String make;
	String model;
	int year;
	Double price;
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Double getPrice() {
		return price;
	}
	public vcle(String make, String model, int year, Double price) {
	
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	

}
