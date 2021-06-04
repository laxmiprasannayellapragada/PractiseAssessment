package SumOfDigInAString;

public class UserMainCode {
	public static int sumOfDigits(String s){
		int sum=0;
		int count=0;
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++){
		if(Character.isDigit(c[i])){
			sum+=Integer.parseInt(String.valueOf(c[i]));
			//System.out.println(sum+" " +Integer.parseInt(String.valueOf(c[i])));
			count++;
		}
		}
		if(count==0){
			return -1;
		}else{
		return sum;
		}
	}

}
