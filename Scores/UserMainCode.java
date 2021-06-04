package Scores;

public class UserMainCode {
	public static boolean checkScores(int[] a){
		for(int i=0;i<a.length-1;i++){
			if(a[i]==100){
				if(a[i+1]==100){
					return true;
				}
			}
				
		}
		return false;
	}

}
