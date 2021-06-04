package largestDiff;

public class UserMainCode {
	public static int checkDifference(int[] a){
		int sum=0,k=0,c=0;
		for(int i=0;i<a.length;i++){
			for(int j=1;j<a.length;j++){
				//System.out.println(a[j]+"     "+a.length);
			sum=Math.abs(a[i]-a[j]);
			if(sum>c){
				c=sum;
				sum=0;
				k=j;
			}
			}
			
		}
		return k;
	}

}
