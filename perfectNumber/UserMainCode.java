package perfectNumber;

public class UserMainCode {
	public static boolean getPerfection(int n){
		int sum=0;
		for(int i=1;i<=n/2;i++){
			if(n%i==0){
				sum=sum+i;
				//System.out.println(sum);
			}
		}
		if(sum==n)
			return true;
		else
			return false;
	}

}