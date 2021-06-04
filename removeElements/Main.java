package removeElements;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();sc.nextLine();
		String[] a=new String[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextLine();
		}
		int m=sc.nextInt();
		System.out.println(UserMainCode.removeElements(a, m));
		sc.close();

	}

}
