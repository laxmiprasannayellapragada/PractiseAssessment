package gradeCalculator;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashMap<String,Float> hm=new HashMap<String,Float>();
		int n=sc.nextInt();sc.nextLine();
		for(int i=0;i<n;i++){
			String s=sc.nextLine();
			float f=sc.nextFloat();sc.nextLine();
			hm.put(s,f);
		}for(Entry<String, String> m:UserMainCode.calculateGrade(hm).entrySet()){
		System.out.println(m.getKey());
		System.out.println(m.getValue());
		}
		sc.close();

	}

}
