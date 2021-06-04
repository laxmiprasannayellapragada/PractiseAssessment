package SumOfCommonElements;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();sc.nextLine();
		int m=sc.nextInt();sc.nextLine();
		int[] a1=new int[n];
		int[] a2=new int[m];
		for(int i=0;i<n;i++){
			a1[i]=sc.nextInt();sc.nextLine();
		}
		for(int i=0;i<m;i++){
			a2[i]=sc.nextInt();sc.nextLine();
		}
		int sum=UserMainCode.getSumOfIntersection(n, a1, m, a2);
		if(sum==-1){
			System.out.println("No common elements");
		}else
			System.out.println(sum);
		sc.close();

	}

}
