package basicprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortedResultantArray {
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	Integer ls1[]=new Integer[5];
	Integer ls2[]=new Integer[7];
	Integer ls3[]=new Integer[3];
	for(int i=0;i<5;i++)
	{
		ls1[i]=scan.nextInt();
	}
	for(int i=0;i<7;i++)
	{
		ls2[i]=scan.nextInt();
	}
	for(int i=0;i<4;i++)
	{
		ls3[i]=scan.nextInt();
	}
	scan.close();
	List<Integer>ls=new ArrayList<>();
	int maxLength=Math.max(ls1.length, Math.max(ls2.length, ls3.length));
	
	for(int i=0;i<maxLength;i++)
	{
		if(i<ls1.length)
		{
			ls.add(ls1[i]);
		}
		if(i<ls2.length)
		{
			ls.add(ls2[i]);
		}
		if(i<ls3.length)
		{
			ls.add(ls3[i]);
		}
	}
//			_Collections.addAll(ls3, ls1);
//	Collections.addAll(ls3, ls2);
//	Collections.sort(ls3);
//	System.out.print(ls3);
	System.out.print(ls);
}
}
