package ArrayFront;

public class UserMainCode {
	public static boolean scanArray(int[] a){
		boolean b=false;
		if(a.length<4){
			for(int i=0;i<a.length;i++){
				if(a[i]==9)
					b=true;
				else
					b=false;
			}
		}
		else{
			for(int i=0;i<4;i++){
			if(a[i]==9)
				b=true;
			else
				b=false;
		}
		}
		return b;
	}

}
