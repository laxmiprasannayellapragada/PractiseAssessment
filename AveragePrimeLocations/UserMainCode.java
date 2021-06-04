package AveragePrimeLocations;

public class UserMainCode {
	public static double averageElements(int[] a){
		double d=0.0;
		for(int i=0;i<a.length;i++){
			for(int j=2;j<9;j++){
				if(i%j!=0){
					d=d+a[i];
				}
			}
		}
		return d;
	}

}
