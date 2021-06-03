package gradeCalculator;

import java.util.HashMap;
import java.util.Map.Entry;

public class UserMainCode {
	public static HashMap<String, String> calculateGrade(HashMap<String,Float> hm){
		HashMap<String, String> h=new HashMap<String,String>();
		for(Entry<String, Float> m:hm.entrySet()){
			if(m.getValue()<60){
				h.put(m.getKey(), "FAIL");
			}else if(m.getValue()>=60){
				h.put(m.getKey(), "PASS");
			}
		}
		return h;
	}

}
