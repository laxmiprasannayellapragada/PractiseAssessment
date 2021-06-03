package stringFinder;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String s3=sc.nextLine();
		int i=UserMainCode.stringFinder(s1, s2, s3);
		if(i==1)
		System.out.println("yes");
		else
			System.out.println("No");
		sc.close();

	}

}
