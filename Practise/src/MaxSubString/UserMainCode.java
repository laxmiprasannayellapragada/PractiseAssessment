package MaxSubString;

public class UserMainCode {
	public static String extractMax(String s1,String s2){
		String[] s=s1.split(s2);
		String out=null;
		int max=0;
		for(String i:s){
			if(i.length()>max){
				max=i.length();
				out=i;
			}
		}
		String k=out.substring(0, 1);
		String res=k.toUpperCase()+out.substring(1);
		return res;
	}

}
