package SumCubesSqrsArr;

public class UserMainCode {
	public static int addEvenOdd(int[] a){
		int s=0;
		int c=0;
		int d=0;
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				s=s+a[i]*a[i];
			}else if(a[i]%2!=0){
				c=c+a[i]*a[i]*a[i];
			}
		}
		d=s+c;
		return d;
	}

}
