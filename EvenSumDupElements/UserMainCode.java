package EvenSumDupElements;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class UserMainCode {
	public static int sumElements(int[] a){
		int n=0;
		LinkedHashSet<Integer> hm=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++){
			hm.add(a[i]);
		}
		Iterator<Integer> m=hm.iterator();
		while(m.hasNext()){
			int l=m.next();
			if(l%2==0){
				n=n+l;
			}else {
				return -1;
			}
		}
 
		return n;
	}

}
