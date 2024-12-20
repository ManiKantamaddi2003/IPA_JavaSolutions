package mark35Questions;

import java.util.Scanner;
import java.util.TreeSet;
public class MyClass
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		Footwear[] ft = new Footwear[5];
		for(int i=0; i<5; i++)
		{
			int a = sc.nextInt();sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			int d = sc.nextInt();sc.nextLine();

			ft[i]=new Footwear(a,b,c,d);
		}
	
		String ftType = sc.nextLine();
		String ftName = sc.nextLine();
		int count = getCountByType(ft,ftType);
		if(count>0)
		{
			System.out.println(count);
		}
		else
		{
			System.out.println("Footwear not avaliable");
		}

		int obj = getSecondHighestPriceByBrand(ft, ftName);
		for(int i=0;i<ft.length;i++)
		{
		if(obj==ft[i].getPrice())
		{
			System.out.println(ft[i].getId());
			System.out.println(ft[i].getName());
			System.out.println(ft[i].getPrice());
		}
		}
		if(obj==0)
		{
			System.out.println("Brand not available");
		}
	
	}

	public static int getCountByType(Footwear[] ft, String t)
	{
		int count = 0;
		for(int i=0; i<ft.length; i++)
		{
			if(ft[i].getType().equalsIgnoreCase(t))
			{
				count++;
			}
		}
		if (count>0)
		{
			return count;
		}
		else
		{
			return 0;
		}
	}
	
	public static int getSecondHighestPriceByBrand(Footwear[] ft, String name)
	{
		 //TreeSet<Footwear> ts = new TreeSet<>((f1, f2) -> Integer.compare(f2.getPrice(), f1.getPrice()));
		TreeSet<Integer> ts = new TreeSet<>();
	        for (Footwear footwear : ft) {
	            if (footwear.getName().equalsIgnoreCase(name)) {
	                ts.add(footwear.getPrice());
	            }
	        }
	        
	        // Poll the first (highest price) and then poll the second
	        ts.pollLast(); // Discard the highest priced footwear
	        Integer res=ts.pollLast(); // Return the second highest
	        return (res!=null)?res:0;
	    }
}

class Footwear
{
	private int id;
	private String name;
	private String type;
	private int price;

	public Footwear(int id, String name, String type, int price)
	{
		this.id=id;
		this.name = name;
		this.type = type;
		this.price = price;
	}	

	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
}