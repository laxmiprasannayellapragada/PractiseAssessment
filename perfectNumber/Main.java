package perfectNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (UserMainCode.getPerfection(n))
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
		sc.close();
	}

}
