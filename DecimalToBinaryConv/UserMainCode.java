package DecimalToBinaryConv;

public class UserMainCode {
	public static long convertDecimalToBinary(int n){
		long s=0L;
		StringBuffer sb=new StringBuffer();
		int t=0;
		sb.append(0);
		while(n>0){
			t=n%2;
			sb.append(t);
			n=n/2;
		}sb.append(0);
		s=Long.parseLong(String.valueOf(sb));
		return s;
	}

}
