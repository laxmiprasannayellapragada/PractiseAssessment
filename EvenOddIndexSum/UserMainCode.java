package EvenOddIndexSum;

import java.util.ArrayList;

public class UserMainCode {
	public static int sumOfOddEvenPositioned(int n){
		int d=0,g=0,k=0;
		ArrayList<Integer> a=new ArrayList<Integer>();
		while(n>0){
			d=n%10;
			a.add(d);
			n=n/10;
		}
		for(int i=1;i<=a.size();i++){
			if(i%2==0){
				k=k+a.get(i-1);
				//System.out.println(k);
			}else
				g=g+a.get(i-1);
		}
		if(k==g)
			return 1;
		else
			return 2;
	}

}
