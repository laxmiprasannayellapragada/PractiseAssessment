package KaprekarNumber;

public class UserMainCode {
	public static int getKaprekarNumber(int n){
		int s=n*n;
		int sum=0;
		String st=String.valueOf(s);
		int k=st.length();
			int n1=Integer.parseInt(st.substring(0,k/2));
			int n2=Integer.parseInt(st.substring(k/2));
			sum=n1+n2;
			if(sum==n){
				return 1;
			}
			else 
				return -1;
	}

}
