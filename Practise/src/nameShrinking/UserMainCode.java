package nameShrinking;

public class UserMainCode {
	public static String getFormatedString(String s){
		String[] s1=s.split(" ");
		String out=s1[2]+" "+s1[1].substring(0, 1)+"."+s1[0].substring(0, 1);
		return out;
	}

}
