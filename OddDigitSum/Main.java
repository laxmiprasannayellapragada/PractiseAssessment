package OddDigitSum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();sc.nextLine();
		String[] s=new String[n];
		for(int i=0;i<n;i++){
		s[i]=sc.nextLine();
		}
		System.out.println(UserMainCode.oddDigitSum(s));
		sc.close();

	}

}
