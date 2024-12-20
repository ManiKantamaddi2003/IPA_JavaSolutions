package mark35Questions;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Phone arr[]=new Phone[4];
		for(int i=0;i<4;i++)
		{
			int a=scan.nextInt();
			scan.nextLine();
			String b=scan.nextLine();
			String c=scan.nextLine();
			int d=scan.nextInt();
			arr[i]= new Phone(a,b,c,d);	
		}
		scan.nextLine();
		System.out.println("Enter Brand: ");
		String brandi=scan.nextLine();
		int totalpriceasbrand=findPriceForGivenBrand(arr, brandi);
		if(totalpriceasbrand>0)
		{
			System.out.println(totalpriceasbrand);
		}
		else
		{
			System.out.println("Not Available That "+brandi+" Brand");
		}
		System.out.println("Enter Os: ");
		String os=scan.nextLine();
		Phone result=getPhoneIdBasedOnOs(arr, os);
		if(result==null)
		{
			System.out.println("No Phones Available");
		}
		else
		{
			System.out.println("Phone ID: "+result.getPhoneId()+" Brand: "+result.getBrand()+" Os: "+result.getOs()+" Price: "+result.getPrice());
		}
		
	}
	
	public static int findPriceForGivenBrand(Phone arr[],String brandi)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getBrand().equalsIgnoreCase(brandi))
			{
				sum=sum+arr[i].getPrice();
			}
		}
		if(sum>0)
		{
			return sum;
			
		}
		else {
			return 0;
		}
		
	}
	
	public static Phone getPhoneIdBasedOnOs(Phone arr[],String osi)
	{
		Phone temp=null;
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i].getOs().equalsIgnoreCase(osi))&& arr[i].getPrice()>=50)
			{
				
				return arr[i];
			}
			
		}
		return temp;
	}

}
class Phone
{
	private int phoneId;
	private String os;
	private String brand;
	private int price;
	
	Phone(int phoneId,String os,String brand,int price)
	{
		this.phoneId=phoneId;
		this.os=os;
		this.brand=brand;
		this.price=price;
	}
	public int getPhoneId() {
		return phoneId;
	}
	public String getOs() {
		return os;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
}
