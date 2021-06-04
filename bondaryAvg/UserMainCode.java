package bondaryAvg;

public class UserMainCode {
	public static float getBoundaryAverage(int[] a){
		int max=0,min=0;
		max=a[0];
		min=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
			}if(a[i]<min){
				min=a[i];
			}
		}
		float m=(float) ((((max+min)*100)/2)*0.01);
		return m;
	}

}
