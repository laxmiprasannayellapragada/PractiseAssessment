package EvenOddIndexSum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = UserMainCode.sumOfOddEvenPositioned(n);
		if (k == 1)
			System.out.println("Yes");
		else
			System.out.println("No");

		sc.close();

	}

}
