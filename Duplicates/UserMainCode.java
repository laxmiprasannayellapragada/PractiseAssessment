package Duplicates;

public class UserMainCode {
	public static int getDistinctSum(int a,int b,int c){
		int sum=0;
		if(a==b)
			sum=c;
		else if(a==c)
			sum=b;
		else if(b==c)
			sum=c;
		else
			sum=a+b+c;
		
		return sum;
	}

}
