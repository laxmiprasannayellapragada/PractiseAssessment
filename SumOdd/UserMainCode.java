package SumOdd;

public class UserMainCode {
	public static int addOddNumbers(int n){
		int sum=0;
		for(int i=0;i<=n;i++){
			if(i%2!=0){
				sum=sum+i;
			}
		}
		return sum;
	}

}