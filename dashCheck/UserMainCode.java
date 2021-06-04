package dashCheck;

import java.util.ArrayList;

public class UserMainCode {
	public static int compareDashes(String s1,String s2){
		ArrayList<Integer> a1=new ArrayList<Integer>();
		ArrayList<Integer> a2=new ArrayList<Integer>();
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)=='-')
				a1.add(i);
		}
		for(int i=0;i<s2.length();i++){
			if(s2.charAt(i)=='-')
				a2.add(i);
		}
		if(a1.equals(a2))
			return 1;
		else 
			return 2;
	}

}

