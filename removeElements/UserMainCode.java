package removeElements;

public class UserMainCode {
	public static int removeElements(String[] a,int n){
		int res=0;
		for(String i:a){
			if(i.length()!=n){
				res++;
			}
		}
		return res;
	}

}
