package FindDigits;

import java.util.StringTokenizer;

public class UserMainCode {
	public static String findNoDigits(double n){
		String s=String.valueOf(n);
		StringTokenizer st=new StringTokenizer(s,".");
		String s1=st.nextToken();
		//System.out.println(s1);
		String s2=st.nextToken();
		int n1=s1.length();
		int n2=s2.length();
		if(n2!=0){
			if(s2.charAt(n2-1)==0){
				n2=s2.length()-1;
			}
		}
		String res=String.valueOf(n1)+":"+String.valueOf(n2);
		return res;
		
	}

}
