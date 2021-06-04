package sumOfSquaresofEven;

public class UserMainCode {
	public static int sumOfSquaresOfEvenDigits(int n){
		int out=0;
		int d=0;
		while(n>0){
			d=n%10;
			if(d%2==0){
				out=out+d*d;
			}n=n/10;
		}
		return out;
	}

}
