package AddReverse;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();sc.nextLine();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();sc.nextLine();
		}
		int k=sc.nextInt();
		System.out.println(UserMainCode.addAndReverse(a, k));
		sc.close();

	}

}