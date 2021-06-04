package Duplicates;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();sc.nextLine();
		int b=sc.nextInt();sc.nextLine();
		int c=sc.nextInt();
		System.out.println(UserMainCode.getDistinctSum(a, b, c));
		sc.close();

	}

}
