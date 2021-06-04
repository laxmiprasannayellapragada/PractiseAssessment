package KaprekarNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int l=UserMainCode.getKaprekarNumber(n);
		if(l==1)
		System.out.println("Kaprekar Number");
		else
			System.out.println("Not A Kaprekar Number");
		sc.close();

	}

}
