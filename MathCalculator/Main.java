package MathCalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();sc.nextLine();
		int n2=sc.nextInt();sc.nextLine();
		String ch=sc.nextLine();
		System.out.println(UserMainCode.calculator(n1, n2, ch));
		sc.close();
	}

}
