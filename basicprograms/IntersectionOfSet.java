package basicprograms;

import java.util.Scanner;

public class IntersectionOfSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int[] set1 = new int[4];
        int[] set2 = new int[5];
        int[] intersection = new int[0];
        System.out.println("Set 1 :");
        for (int i = 0; i < set1.length; i++) {
            System.out.print((i+1)+" : ");
            set1[i] = sc.nextInt();
        }
        System.out.println("Set 2 :");
        for (int i = 0; i < set2.length; i++) {
            System.out.print((i+1)+" : ");
            set2[i] = sc.nextInt();
        }

	}

}
