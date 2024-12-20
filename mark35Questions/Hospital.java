package mark35Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Hospital {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Medicine arr[]=new Medicine[4];
		for(int i=0;i<arr.length;i++)
		{
			String a =scan.nextLine();
			String b =scan.nextLine();
			String c =scan.nextLine();
			int d =scan.nextInt();
			scan.nextLine();
			arr[i]=new Medicine(a, b, c, d);
		}
		System.out.println("Enter Desese: ");
		String disease=scan.nextLine();
		scan.close();
		int res[]=getPriceByDisease(arr, disease);
		if(res!=null)
		{
			for(int i=0;i<res.length;i++)
			{
				System.out.println(res[i]);
			}
		}
		else
		{
			System.out.println("No Result Found");
		}
	}
	
	public static int[] getPriceByDisease(Medicine arr[],String disease) {
		int arr2[]=new int[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getDesease().equalsIgnoreCase(disease))
			{
				arr2=Arrays.copyOf(arr2, arr2.length+1);
				arr2[arr2.length-1]=arr[i].getPrice();
				Arrays.sort(arr2);
			}
		}
		if(arr2.length>0)
		{
			return arr2;
		}
		else {
			return null;
		}
		
	}

}
class Medicine
{
	private String medicineName;
	private String batch;
	private String desease;
	private int price;
	
	Medicine(String medicineName,String batch,String desease,int price)
	{
		this.medicineName=medicineName;
		this.batch=batch;
		this.desease=desease;
		this.price=price;
	}
	public String getMedicneName()
	{
		return medicineName;
	}
	public String getBatch()
	{
		return batch;
	}
	public String getDesease()
	{
		return desease;
	}
	public int getPrice()
	{
		return price;
	}
}
