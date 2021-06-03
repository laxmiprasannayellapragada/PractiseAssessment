package stringFinder;

public class UserMainCode {
	public static int stringFinder(String s1,String s2,String s3){
		if(s1.contains(s3)&&s1.contains(s2)){
		if(s1.lastIndexOf(s3)>s1.lastIndexOf(s2)){
			return 1;
		}else
			return 2;
		}
		return -1;
	}

}
