package AddReverse;

public class UserMainCode {
	public static int addAndReverse(int[] a,int n){
		int sum=0;
		for(int i=0;i<a.length;i++){
			if(a[i]>n){
				sum=sum+a[i];
			}
		}int temp=0;
		int k=0;
		while(sum>0){
			temp=sum%10;
			k=k*10+temp;
			sum/=10;
		}
		return k;
	}

}
