package OddDigitSum;

public class UserMainCode {
	public static int oddDigitSum(String[] s){
		int sum=0,k=0;
		StringBuffer b=new StringBuffer();
		for(int i=0;i<s.length;i++){
			for(int j=0;j<s[i].length();j++){
				//System.out.println(s[i].length());
		if(Character.isDigit(s[i].charAt(j))){
			k=Integer.parseInt(String.valueOf(s[i].charAt(j)));
			b.append(k);
			//System.out.println("b"+b);
			}}
		}
		for(int i=0;i<b.length();i++){
			int m=Integer.parseInt(String.valueOf(b.charAt(i)));
			//System.out.println(m);
			if(m%2!=0){
				sum+=m;
		}
			}
		
		return sum;
	}

}
