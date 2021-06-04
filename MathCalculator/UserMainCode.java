package MathCalculator;

public class UserMainCode {
	public static int calculator(int n1,int n2,String ch){
		int res=0;
		if(ch.equals("+"))
			res=n1+n2;
		else if(ch.equals("-"))
			res=n1-n2;
		else if(ch.equals("*"))
			res=n1*n2;
		else if(ch.equals("/"))
			res=n1/n2;
		else if(ch.equals("%"))
			res=n1%n2;
		return res;
	}

}
