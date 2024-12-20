package mark35Questions;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		TravelAgencies[] arr=new TravelAgencies[4];
		for(int i=0;i<4;i++)
		{
			int a=scan.nextInt();
			scan.nextLine();
			String b=scan.nextLine();
			String c=scan.nextLine();
			int d=scan.nextInt();
			scan.nextLine();
			boolean e=scan.nextBoolean();
			arr[i]=new TravelAgencies(a,b,c,d,e);
		}
			
			//printing highest package price
			int maxprice=findAgencyWithHighestPackagePrice(arr);
			System.out.println(maxprice);
			
			int regNo=scan.nextInt();
			scan.nextLine();
			String packageType=scan.nextLine();
			
			TravelAgencies res=DeatailsFoeGivenIdandType(arr, regNo, packageType);
		    if (res != null) {
	            System.out.println(res.getAgencyType() + ":" + res.getPackagaeType());
	        } else {
	            System.out.println("No matching agency found.");
	        }
			
			
			
			
		
		
	}
	public static int findAgencyWithHighestPackagePrice(TravelAgencies[] arr)
	
	{
		int max=arr[0].getPrice();
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i].getPrice())
			{
				max=arr[i].getPrice();
			}
		}
		if(max<0)
		{
			return 0;
		}
		else {
			return max;
		}
	}
	
	public static  TravelAgencies DeatailsFoeGivenIdandType(TravelAgencies[] arr,int regNo,String packageType) {
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].isFlightavailability())
			{
				if(arr[i].getRegNo()==regNo && arr[i].getPackagaeType().equalsIgnoreCase(packageType))
				{
					return arr[i];
				}
			}
		}
		return null;
	}

}
class TravelAgencies
{
	private int regNo;
	private String agencyType;
	private String packagaeType;
	private int price;
	private boolean flightavailability;

	public TravelAgencies(int regNo, String agencyType, String packagaeType, int price, boolean flightavailability) {
		this.regNo = regNo;
		this.agencyType = agencyType;
		this.packagaeType = packagaeType;
		this.price = price;
		this.flightavailability = flightavailability;
	}

	public int getRegNo() {
		return regNo;
	}

	public String getAgencyType() {
		return agencyType;
	}

	public String getPackagaeType() {
		return packagaeType;
	}

	public int getPrice() {
		return price;
	}

	public boolean isFlightavailability() {
		return flightavailability;
	}

	
}