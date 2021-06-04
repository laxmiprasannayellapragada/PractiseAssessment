package FindDistance;

public class UserMainCode {
	public static int findDistance(int x1,int y1,int x2,int y2){
		int n=0;
		double k=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		n=(int) Math.round(k);
		return n;
	}

}
