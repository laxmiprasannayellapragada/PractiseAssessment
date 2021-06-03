package MaxSubString;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.next();
		System.out.println(UserMainCode.extractMax(s1, s2));
		sc.close();
	}

}
