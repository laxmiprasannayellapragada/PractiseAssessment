package SumOfCommonElements;

public class UserMainCode {
	public static int getSumOfIntersection(int n,int[] a1,int m,int[] a2){
		int sum=0,c=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(a1[i]==a2[j]){
					sum+=a1[i];
					//System.out.println(a1[i]+"    "+a2[j]);
					c++;
				}
			}
		}
		if(c==0){
			return -1;
		}
		return sum;
	}

}
