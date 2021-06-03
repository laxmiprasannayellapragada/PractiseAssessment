package gradeCalculator2;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class UserMainCode {
	public static TreeMap<Integer, String> calculateGrade(HashMap<Integer,Integer> hm){
		
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		for(Entry<Integer,Integer> m:hm.entrySet()){
			if(m.getValue()>=80){
				tm.put(m.getKey(), "GOLD");
			}else if(m.getValue()<80&&m.getValue()>=60){
				tm.put(m.getKey(), "SILVER");
			}else if(m.getValue()<60&& m.getValue()>=45){
				tm.put(m.getKey(), "BRONZE");
			}else{
				tm.put(m.getKey(), "FAIL");
			}
		}
		return tm;
	}

}
