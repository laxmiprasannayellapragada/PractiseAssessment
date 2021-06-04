package reverseNumber;

public class UserMainCode {
	public static int reverseNumber(int n){
		int d=0,rev=0;
		while(n>0){
			d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		return rev;
	}

}
