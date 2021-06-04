package FindDistance;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();sc.nextLine();
		int y1=sc.nextInt();sc.nextLine();
		int x2=sc.nextInt();sc.nextLine();
		int y2=sc.nextInt();sc.nextLine();
		System.out.println(UserMainCode.findDistance(x1, y1, x2, y2));
		sc.close();
	}

}
