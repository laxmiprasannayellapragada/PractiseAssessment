package AvgOfPrimes;

public class UserMainCode {
	public static int addPrimeIndex(int[] a){
		int avg=0;int m=0;
		int sum=0,c=0;
		for(int i=0;i<a.length;i++){
			c=0;
			for(int j=1;j<=i;j++){
				if(i%j==0){
					c++;
				}
			}
			if(c==2){
				sum=sum+a[i];
				m++;
			}
		}avg=sum/m;
		return avg;
	}

}
