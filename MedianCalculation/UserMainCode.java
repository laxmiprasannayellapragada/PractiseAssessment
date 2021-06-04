package MedianCalculation;

import java.util.Arrays;

public class UserMainCode {
	public static int calculateMedian(int[] a){
		Arrays.sort(a);
		int n=a.length;
		double m=0;
//		for(int i=0;i<n;i++)
//			System.out.println(a[i]);
//		
			//System.out.println("       "+a[(n/2)-1]+"   "+a[(n/2)]);
			if(n%2!=0){
				m=a[n/2];
			}else{
				m=(a[(n/2)-1]+a[(n/2)]);
				m=(((m*100)/2)*0.01);
		}
			//System.out.println(m);
		return (int) Math.ceil(m);
	}

}
