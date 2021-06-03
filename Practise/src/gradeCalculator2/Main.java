package gradeCalculator2;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();sc.nextLine();
		HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++){
			hm.put(sc.nextInt(), sc.nextInt());sc.nextLine();
		}
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>(UserMainCode.calculateGrade(hm));
		for(Entry<Integer,String> m:tm.entrySet()){
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		sc.close();

	}

}
